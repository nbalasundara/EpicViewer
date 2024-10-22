package com.protolys.epicviewer.data

import org.junit.Test

import org.junit.jupiter.api.Assertions
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

const val naturalDate : String = "https://epic.gsfc.nasa.gov/api/enhanced/date/2015-10-31"

const val naturalAll : String = "https://epic.gsfc.nasa.gov/api/enhanced/all"

// https://epic.gsfc.nasa.gov/api/enhanced/date/2022-04-06?api_key=hza2jh9oUxEfKgMH4bn0jZ3fFREiYb30BsbN85Zb
// https://epic.gsfc.nasa.gov/api/enhanced/date/2021-10-18?api_key=hza2jh9oUxEfKgMH4bn0jZ3fFREiYb30BsbN85Zb


class EpicDataTest {
    @Test
    fun testToDate() {
        val date: Date? = "2024-10-18".toDate()
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
        formatter.timeZone = utcZone
        Assertions.assertEquals(formatter.format(date!!), "2024-10-18")
    }

    @Test
    fun testToDateFromLongString() {
        val date: Date? = "2024-10-18 00:50:27".toDateFromLongString()
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss") // "2024-10-18 00:50:27"
        val utcZone: TimeZone = TimeZone.getTimeZone("UTC")
        formatter.timeZone = utcZone
        val dateString = formatter.format(date!!)
        Assertions.assertEquals(dateString, "2024-10-18 00:50:27")
    }
}