package com.ejrope.kotlintrainingapp

fun getItems():List<Item> {
    //Generating range and map into a Item list
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/sports/$it/") }
}

data class Item(val id: Long, val title: String, val url: String)