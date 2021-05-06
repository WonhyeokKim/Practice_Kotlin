package org.projecttl.test.program

import java.util.*

class MainClass {
    companion object {

        private val array = mutableMapOf<String, Profiles>()

        @JvmStatic
        fun main(args: Array<out String>) {
            while (true) {
                val scanner = Scanner(System.`in`)
                var command = scanner.nextLine()
                var builder = ProcessBuilder()

                when (command) {
                    "add" -> {
                        println("Please type name!")
                        var name = scanner.nextLine()

                        println("Please type gender! Ex) man or women")
                        var gender = scanner.nextLine()

                        println("Please type age!")
                        var age = scanner.nextInt()

                        array[name] = Profiles(name, age, Gender.valueOf(gender.uppercase()))
                        println("Success create profiles!")
                    }

                    "remove" -> {
                        var name = scanner.nextLine()
                        array.remove(name)

                        println("Success remove profiles!")
                    }

                    "debug" -> {
                        println(array)
                    }

                    "clean" -> {
                        builder.command("cmd", "-c", "cls")
                    }
                }
            }
        }
    }
}