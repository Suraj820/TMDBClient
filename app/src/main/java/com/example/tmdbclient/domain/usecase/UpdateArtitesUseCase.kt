package com.example.tmdbclient.domain.usecase

import com.example.tmdbclient.domain.repository.ArtitiesRespository
import com.example.tmdbclient.data.model.artist.Artist

class UpdateArtitesUseCase(private val artitiesRespository: ArtitiesRespository) {
    suspend fun execute():List<Artist>? = artitiesRespository.updateArtites()

}