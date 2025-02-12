package com.example.exaadfebrero.features.mushroom.domain

data class Mushroom(val id: String, val name: String, val family: String, val description: String)

data class Album(val id: String, val name: String, val idMushroomsToCollect: List<String>)

data class Sticker(
    val id: String,
    val albumId: String,
    val mushroomId: String,
    val image: String,
    val latitude: String,
    val longitude: String,
    val date: String,
    val time: String
)