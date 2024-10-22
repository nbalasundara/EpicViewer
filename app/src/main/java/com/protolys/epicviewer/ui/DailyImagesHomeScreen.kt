package com.protolys.epicviewer.ui
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.protolys.epicviewer.data.ImageDate
import com.protolys.epicviewer.data.toDate
import com.protolys.epicviewer.ui.theme.EPICViewerTheme
import java.util.Date

@Composable
fun DailyImagesHomeScreen() {
    val dailyImages = rememberSaveable() {
        listOf(
            ImageDate("2024-10-20".toDate()),
            ImageDate("2024-10-19".toDate()),
            ImageDate("2024-10-18".toDate())
        )
    }
    LazyColumn {
        items(dailyImages, key = {imageDate -> imageDate.id})
        {
            showDay(it)
        }
    }
}


@Composable
fun showDay(imageDate:ImageDate/*, modifier: Modifier = Modifier*/) {
    Text(
        text = imageDate.monsun,
        color = Color.Black
        //modifier = modifier
    )
}

class DayImagesParameterProvider : PreviewParameterProvider<ImageDate> {
    override val values = sequenceOf(
        ImageDate("2024-10-20".toDate()),
        ImageDate("2024-10-21".toDate()),
        ImageDate("2024-10-22".toDate()),
        ImageDate("2024-10-23".toDate()),
        ImageDate("2024-10-24".toDate()),
        ImageDate("2024-10-25".toDate()),
        ImageDate("2024-10-26".toDate())
    )
}

@Preview
@Composable
fun GreetingPreview(
    @PreviewParameter(DayImagesParameterProvider::class) imageDate: ImageDate
)
{
    showDay(imageDate)
}