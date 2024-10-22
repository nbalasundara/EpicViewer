package com.protolys.epicviewer.data

import androidx.compose.runtime.Immutable
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

// TODO move to Api
val API_KEY = "hza2jh9oUxEfKgMH4bn0jZ3fFREiYb30BsbN85Zb"

//
// Extension functions on String for various date conversions
// The feeds do not specify timezone but they are in UTC as
// NASA always uses UTC.
// Wouldn't have been an issue except the screens majorly use
// Day names which the user most likely assumes to be the local timezone
// day.
fun String.toDate() : Date? {
    val formatter = SimpleDateFormat("yyyy-MM-dd")
    val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
    formatter.setTimeZone(utcZone)
    return formatter.parse(this)
}

fun String.toDateFromLongString() : Date? {
    val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss") // "2024-10-18 00:50:27"
    val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
    formatter.setTimeZone(utcZone)
    return formatter.parse(this)
}

fun String.slashString() : String? {
      val dateWithoutTime = this.replace(" .*", "")
      return dateWithoutTime.replace("", "")
}

// Keep as many classes as possible immutable as they get loaded from EPIC
// server so that the lists do not cause excessive compose refreshes.
// The images that may be downloaded will be downloaded separately and maybe cached
@Immutable
data class ImageDate(val date: String)
