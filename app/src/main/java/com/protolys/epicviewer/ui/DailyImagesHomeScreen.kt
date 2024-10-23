package com.protolys.epicviewer.ui
import android.media.Image
import android.util.Log.v
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.protolys.epicviewer.EpicViewModel
import com.protolys.epicviewer.data.ImageDate
import com.protolys.epicviewer.data.toDate


@Composable
fun DailyImagesHomeScreen(
    modifier: Modifier = Modifier,
    viewModel : EpicViewModel,
    next: (ImageDate) -> Unit
) {
    val dailyImages by produceState<Result<List<ImageDate>?>>(initialValue = Result.success(listOf<ImageDate>())) {
        var x : List<ImageDate>? = null
        viewModel.fetchAllDates().collect {
            x = it
        }
        // Update State with either an Error or Success result.
        // This will trigger a recomposition where this State is read
        value = (if (x != null) {
            Result.success(x)
        } else {
            Result.failure(Exception("fetch failed!")) // TODO handle exceptions
        })
    }

    if (dailyImages.isSuccess && dailyImages.getOrNull() != null) {
        LazyColumn(
            modifier = modifier.fillMaxSize()
                .semantics { contentDescription = "Daily Images Home Screen" },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            dailyImages.onSuccess {
                items(dailyImages.getOrNull()!!, key = { imageDate -> imageDate.id })
                {
                    showDay(it, modifier = modifier)
                }
            }
        }
    }
}

@Composable
fun showDay(imageDate:ImageDate, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(imageDate)
    }
}

@Composable
private fun CardContent(day: ImageDate) {
    Row(
        modifier = Modifier
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(
                text = day.monsun
            )
            Text(text = day.dailyImageDate)
        }
        Row(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "12/12"/*, TODO */
            )
            IconButton(onClick = {

            }) {
                Icon(
                    Icons.Rounded.KeyboardArrowRight,
                    contentDescription = ""
                )
            }
        }
    }
}

//
// Previews
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