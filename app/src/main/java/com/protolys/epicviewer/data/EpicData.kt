package com.protolys.epicviewer.data

import androidx.compose.runtime.Immutable
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

//
// Extension functions on String for various date conversions
// The feeds do not specify timezone but they are in UTC as
// NASA always uses UTC.
// Wouldn't have been an issue except the screens majorly use
// Day names which the user most likely assumes to be of
// the local timezone day.
fun String.toDate() : Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd")
    val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
    formatter.setTimeZone(utcZone)
    return formatter.parse(this)
}

fun String.toDateFromLongString() : Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss") // "2024-10-18 00:50:27"
    val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
    formatter.setTimeZone(utcZone)
    return formatter.parse(this)
}

fun String.slashString() : String {
      val dateWithoutTime = this.replace(" .*", "")
      return dateWithoutTime.replace("", "")
}

fun Date.toString() : String {
    val formatter = SimpleDateFormat("yyyy-MM-dd")
    val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
    formatter.timeZone = utcZone
    return formatter.format(this)
}

//
// Special deserializer for Date since Kotlin serializer does not know that!
@Serializer(forClass = Date::class)
class DateSerializer : KSerializer<Date> {
    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): Date {
        return decoder.decodeString().toDate()
    }
}
//
// Keep as many classes as possible immutable as they get loaded from EPIC
// server so that the lists do not cause excessive compose refreshes.
// The images that may be downloaded will be downloaded separately and maybe cached
@Serializable
@Immutable
data class ImageDate(
    @Serializable(with = DateSerializer::class)
    val date: Date
) {
    // a convenience function for the lazy list and other compose components
    val id = date.hashCode()
    // For home screen
    //val monsun : String
    init {
        val formatter = SimpleDateFormat("EEEEEEEE")
        val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
        formatter.timeZone = utcZone
    }
}
val ImageDate.id : Int get() { return date.hashCode() }

val ImageDate.dailyImageDate: String
    get() {
        val formatter = SimpleDateFormat("MM/dd/YYYY")
        val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
        formatter.timeZone = utcZone
        return formatter.format(date)
    }

val ImageDate.monsun: String
    get() {
        val formatter = SimpleDateFormat("EEEEEEEE")
        val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
        formatter.timeZone = utcZone
        return formatter.format(date)
    }
