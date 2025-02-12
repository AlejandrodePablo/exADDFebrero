package com.example.exaadfebrero.features.mushroom.data

import com.example.exaadfebrero.features.mushroom.data.local.MushroomXmlLocalDataSource
import com.example.exaadfebrero.features.mushroom.domain.Album
import com.example.exaadfebrero.features.mushroom.domain.Mushroom
import com.example.exaadfebrero.features.mushroom.domain.MushroomRepository
import com.example.exaadfebrero.features.mushroom.domain.Sticker

class MushroomDataRepository(private val xml: MushroomXmlLocalDataSource) : MushroomRepository {

    override fun saveMushrooms(mushrooms: List<Mushroom>) {
        xml.saveAllMushrooms(mushrooms)
    }

    override fun saveStickers(sticker: List<Sticker>) {
        xml.saveAllStickers(sticker)
    }

    override fun saveAllAlbums(albums: List<Album>) {
        xml.saveAllAlbum(albums)
    }

    override fun getAlbums(): List<Album> {
        return xml.findAllAlbum()
    }

    override fun getMushroomsToCollect(): List<Mushroom> {
        return xml.findAllMushrooms()
    }

    override fun getStickers(): List<Sticker> {
        return xml.findAllStickers()
    }
}