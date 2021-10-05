package Main

import org.w3c.dom.Node


fun longestPalindrome(s: String?): String {
        if (s == null || s.isEmpty()) {
            return ""
        }

        val isPalindrome = Array(s.length) {
            BooleanArray(
                s.length
            )
        }
        for (i in s.indices) {
            isPalindrome[i][i] = true
        }
        for (len in 2..s.length) {
            var start = 0
            while (start + len - 1 < s.length) {
                val end = start + len - 1
                if (len == 2) {
                    if (s[start] == s[end]) {
                        isPalindrome[start][end] = true
                    }
                } else {
                    if (s[start] == s[end] && isPalindrome[start + 1][end - 1]) {
                        isPalindrome[start][end] = true
                    }
                }
                start++
            }
        }
        var maxLength = Int.MIN_VALUE
        var startIndex = -1
        var endIndex = -1
        for (i in s.indices) {
            for (j in i until s.length) {
                if (isPalindrome[i][j] && j - i + 1 > maxLength) {
                    startIndex = i
                    endIndex = j
                    maxLength = j - i + 1
                }
            }
        }
        return s.substring(startIndex, endIndex + 1)
    }

fun main(args:Array<String>){
    print(System.getenv("ARTIFACTORY_USER"))}