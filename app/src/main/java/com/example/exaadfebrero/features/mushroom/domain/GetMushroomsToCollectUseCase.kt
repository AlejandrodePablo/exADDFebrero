package com.example.exaadfebrero.features.mushroom.domain

class GetMushroomsToCollectUseCase(private val mushroomRepository: MushroomRepository) {

    operator fun invoke(): Map<Album, List<Mushroom>> {
        val albums = mushroomRepository.getAlbums()

        val mushroomsMap = mutableMapOf<Album, List<Mushroom>>()
        for (album in albums) {
            val mushrooms = mushroomRepository.getMushroomsToCollect()
            mushroomsMap[album] = mushrooms
        }

        return mushroomsMap
    }
}
