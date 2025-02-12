package com.example.exaadfebrero.features.mushroom.data.local

import android.content.Context
import android.content.SharedPreferences
import com.example.exaadfebrero.features.mushroom.domain.Album
import com.example.exaadfebrero.features.mushroom.domain.Mushroom
import com.example.exaadfebrero.features.mushroom.domain.Sticker
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MushroomXmlLocalDataSource(private val context: Context) {

    val sharedPref = context.getSharedPreferences("mushrooms", Context.MODE_PRIVATE)
    val gson = Gson()

    fun saveAllAlbum(albums: List<Album>) {
        val json = gson.toJson(albums)
        sharedPref.edit()
            .putString("album_list", json)
            .apply()
    }

    fun findAllAlbum(): List<Album> {
        val json = sharedPref.getString("albums_list", null)
        val type = object : TypeToken<List<Album>>() {}.type
        return gson.fromJson(json, type)?: emptyList()
    }

    fun saveAllMushrooms(mushrooms: List<Mushroom>) {
        val json = gson.toJson(mushrooms)
        sharedPref.edit()
            .putString("mushroom_list", json)
            .apply()
    }

    fun findAllMushrooms(): List<Mushroom> {
        val json = sharedPref.getString("mushroom_list", null)
        val type = object : TypeToken<List<Mushroom>>() {}.type
        return gson.fromJson(json, type)?: emptyList()
    }

    fun saveAllStickers(stickers: List<Sticker>) {
        val json = gson.toJson(stickers)
        sharedPref.edit()
            .putString("sticker_list", json)
            .apply()
    }

    fun findAllStickers(): List<Sticker> {
        val json = sharedPref.getString("sticker_list", null)
        val type = object : TypeToken<List<Sticker>>() {}.type
        return gson.fromJson(json, type)?: emptyList()
    }

    fun deleteAlbum(idAlbum: String) {
        sharedPref.edit()
            .clear()
            .apply()
    }
}