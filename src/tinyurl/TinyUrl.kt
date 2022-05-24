package tinyurl

import java.net.URL
import kotlin.test.assertEquals

class TinyUrl {
    private val pathToLong = mutableMapOf<String, String>()
    private val longToPath = mutableMapOf<String, String>()
    private var sb = StringBuilder("0")

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        longToPath[longUrl]?.let { path ->
            return "$BASE_URL$path"
        }

        val shortUrl = "$BASE_URL$sb"
        pathToLong[sb.toString()] = longUrl
        longToPath[longUrl] = sb.toString()
        updateKey()

        return shortUrlM
    }

    private fun updateKey() {
        for (i in sb.indices) {
            val c = sb[i]
            if (c < '9') {
                sb[i]++
                return
            } else if (c == '9') {
                sb[i] = 'A'
                return
            } else if (c < 'Z') {
                sb[i]++
                return
            } else if (c == 'Z') {
                sb[i] = 'a'
                return
            } else if (c < 'z') {
                sb[i]++
                return
            } else if (c == 'z') {
                sb[i] = '0'
            }
        }
        sb.append('0')
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        val key = URL(shortUrl).path.split("/").last()
        return pathToLong[key] ?: ""
    }

    companion object {
        const val BASE_URL = "https://tinyurl.com/"
    }
}

fun randomString(length: Int): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun main(args: Array<String>) {
    val encoder = TinyUrl()

    assertEquals("https://www.google.com", encoder.decode(encoder.encode("https://www.google.com")))
    assertEquals("https://www.google.com", encoder.decode(encoder.encode("https://www.google.com")))
    assertEquals("https://www.leetcode.com", encoder.decode(encoder.encode("https://www.leetcode.com")))

    (1 .. 1000).forEach {
        println(encoder.encode(randomString(25)))
    }
}