package com.protolys.epicviewer

import com.protolys.epicviewer.data.ImageDate


import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.JsonReader
import androidx.lifecycle.*
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.io.InputStreamReader
import java.net.URL


interface EpicApi {

    val API_KEY: String
        get() = "hza2jh9oUxEfKgMH4bn0jZ3fFREiYb30BsbN85Zb"
    val API_URL: String
        get() = "https://epic.gsfc.nasa.gov/api/"
    val API_ALL_IMAGES: String
        get() = "https://epic.gsfc.nasa.gov/api/enhanced/all"

    suspend fun fetchAll(): List<ImageDate>
    suspend fun fetchImage(url: URL): Any
    suspend fun fetchImageInfo(url: URL): Any
}
