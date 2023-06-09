package com.example.tmdbclient.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclient.data.model.movie.Movie
import com.example.tmdbclient.data.model.tvshow.TvShow
import com.example.tmdbclient.data.model.tvshow.TvShowList

@Dao
interface TvshowDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(tvShows:List<TvShow>)

    @Query("DELETE FROM popular_tvshows")
    suspend fun deleteAllTvShow()

    @Query("SELECT * FROM popular_tvshows")
    suspend fun getTvShow():List<TvShow>
}