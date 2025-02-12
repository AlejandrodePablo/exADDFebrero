package com.example.exaadfebrero

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exaadfebrero.features.mushroom.data.MushroomDataRepository
import com.example.exaadfebrero.features.mushroom.data.local.MushroomXmlLocalDataSource
import com.example.exaadfebrero.features.mushroom.domain.Album
import com.example.exaadfebrero.features.mushroom.domain.Mushroom
import com.example.exaadfebrero.features.mushroom.domain.Sticker

class MainActivity : AppCompatActivity() {
    private lateinit var data: MushroomDataRepository

    val albums = listOf(Album("1", "album1", listOf("1", "2", "3")))

    val mushroom1 = Mushroom("1", "Boletus", "Boletus", "Seta Comestible")
    val mushroom2 = Mushroom("2", "Amanita", "Amanita", "Seta Venenosa")
    val mushroom3 = Mushroom("3", " Agaricus Campestris.", " Agaricus", "Seta Comestible")

    val sticker = Sticker("1", "1", "2", "image1", "4º", "45º", "12/2/2025", "17:54")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = MushroomDataRepository(MushroomXmlLocalDataSource(this))

        data.saveAllAlbums(albums)
        data.saveMushrooms(listOf(mushroom1, mushroom2, mushroom3))
        data.saveStickers(listOf(sticker))

    }
}