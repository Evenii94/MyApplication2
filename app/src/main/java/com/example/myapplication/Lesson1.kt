package com.example.myapplication

fun main() {
    data class Movies(val genre: String, val movieTitle: String)

    val movies = Movies("Ужас", "ОНО")
    println(movies)


    for(i in 1..10){
        println("Hello Kotlin")
    }

    for(i in 10 downTo 1 ) {
        println(i)
    }

    for (i in 1 downTo -10 step 2){
        println(i)
    }

}