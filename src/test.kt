import kotlin.math.min

class test {
    val students = listOf(
        Student(
            id = 1, name = "aaa",
            subscribedCourses = listOf(
                Course(id = 1, name = "Maths", isPaid = false),
                Course(id = 2, name = "Arts", isPaid = true)
            )
        ),
        Student(
            id = 2, name = "bbb",
            subscribedCourses = listOf(
                Course(id = 3, name = "History", isPaid = true),
                Course(id = 4, name = "Biology", isPaid = true)
            )
        ),
        Student(
            id = 3, name = "ccc",
            subscribedCourses = listOf(
                Course(id = 5, name = "Physics", isPaid = true), Course(id = 3, name = "History", isPaid = true)
            )
        )
    )
}

class University(private val repository: Repository<Student>) {
    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
        var result = mutableMapOf<Course, Int>()

        repository.get().forEach { student ->
            student.subscribedCourses.filter { it.isPaid }
                    .groupingBy { it }
                    .eachCountTo(result)
        }
            return result

    }
}

interface Repository<T> {
    fun get(): Iterable<T>
}

data class Student(val id: Int, val name: String, val subscribedCourses: List<Course>)
data class Course(val id: Int, val name: String, val isPaid: Boolean)


/*class Test2() {
    fun solution(A: IntArray): Int {
        if (A.isNotEmpty()) {
            var count1 = 0
            var count2 = 0
            A.forEachIndexed { index, _ ->

                if (index % 2 == 0) {
                    if (A[index] == 1) count1 += 1
                    if (A[index] == 0) count2 += 1
                } else {
                    if (A[index] == 0) count1 += 1
                    if (A[index] == 1) count2 += 1
                }
            }
        }
    }
}*/