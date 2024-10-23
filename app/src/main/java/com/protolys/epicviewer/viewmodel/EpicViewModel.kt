package com.protolys.epicviewer

import android.media.Image
import androidx.lifecycle.ViewModel
import com.protolys.epicviewer.data.ImageDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.net.URL

interface EpicAllDates {
    suspend fun fetchAllDates(): Flow<List<ImageDate>>
}

interface EpicAllImages {
    suspend fun fetchAllImages(forDate: ImageDate): Flow<List<Image>>
}

interface EpicImage {
    suspend fun fetchImage(url: URL): Any
}

interface EpicImageInfo {
    suspend fun fetchImageInfo(imageId: String): String
}

interface EpicApi: EpicAllDates, EpicAllImages, EpicImage, EpicImageInfo {
    val API_KEY: String
        get() = "hza2jh9oUxEfKgMH4bn0jZ3fFREiYb30BsbN85Zb"
    val API_URL: String
        get() = "https://epic.gsfc.nasa.gov/api/"
    val API_ALL_IMAGES: String
        get() = "https://epic.gsfc.nasa.gov/api/enhanced/all"
}

//
//
// EpicViewModel is readonly and as such just reflects the data model.
// i.e., we don't need a separate data model
class EpicViewModel: EpicApi, ViewModel() {
    var imageDates : List<ImageDate>? = null
    override suspend fun fetchAllDates(): Flow<List<ImageDate>> = withContext(Dispatchers.IO) {
        val response =
            URL(API_ALL_IMAGES + "?api_key=" + API_KEY)
                .openStream()
                .bufferedReader()
                .use {
                    val imagesJson = it.readText()
                    imageDates = Json.decodeFromString<List<ImageDate>>(imagesJson)
                }

        flowOf(imageDates!!)
    }

    override suspend fun fetchAllImages(forDate: ImageDate): Flow<List<Image>> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchImage(url: URL): Image {
        TODO("Not yet implemented")
    }

    override suspend fun fetchImageInfo(imageId: String): String {
        TODO("Not yet implemented")
    }

}