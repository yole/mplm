package ru.yole

class Greeter(val names: List<String>) {
    fun greet(): String {
        return "Hello ${names.joinToString()}"
    }
}
