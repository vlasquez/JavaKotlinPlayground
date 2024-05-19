package coroutines

import kotlinx.coroutines.*
import java.io.Closeable

class AggregateUserDataUseCase(
    private val resolveCurrentUser: suspend () -> UserEntity,
    private val fetchUserComments: suspend (UserId) -> List<CommentEntity>,
    private val fetchSuggestedFriends: suspend (UserId) -> List<FriendEntity>
) : Closeable {
    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    suspend fun aggregateDataForCurrentUser(): AggregatedData {
        val handler = CoroutineExceptionHandler { _, exception ->
            println("CoroutineExceptionHandler got $exception")
        }
       return withContext(coroutineScope.coroutineContext + handler) {
            val currentUser = async { resolveCurrentUser() }
            val userComments = withTimeout(2000) { async { fetchUserComments(currentUser.await().id) } }
            val suggestedFriends = withTimeout(2000) { async { fetchSuggestedFriends(currentUser.await().id) } }
            AggregatedData(currentUser.await(), userComments.await(), suggestedFriends.await())
        }
    }

    override fun close() {
        coroutineScope.cancel()
    }
}


data class AggregatedData(
    val user: UserEntity,
    val comments: List<CommentEntity>,
    val suggestedFriends: List<FriendEntity>
)

typealias UserId = String

data class UserEntity(val id: UserId, val name: String)

data class CommentEntity(val id: String, val content: String)

data class FriendEntity(val id: String, val name: String)

