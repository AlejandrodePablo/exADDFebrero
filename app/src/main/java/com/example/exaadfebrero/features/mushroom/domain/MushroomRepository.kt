package com.example.exaadfebrero.features.mushroom.domain

interface MushroomRepository {

    fun getAlbums(): List<Album>
    fun getMushroomsToCollect(): List<Mushroom>
    fun getStickers(): List<Sticker>
    fun saveAllAlbums(albums: List<Album>)
    fun saveMushrooms(mushrooms: List<Mushroom>)
    fun saveStickers(sticker: List<Sticker>)

}