package com.example.kmmtesting

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}