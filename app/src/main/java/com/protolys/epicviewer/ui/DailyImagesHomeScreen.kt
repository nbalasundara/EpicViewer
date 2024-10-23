package com.protolys.epicviewer.ui
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Filled
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.protolys.epicviewer.R
import com.protolys.epicviewer.data.ImageDate
import com.protolys.epicviewer.data.toDate

@Composable
fun DailyImagesHomeScreen(
    modifier: Modifier = Modifier,
    next : ((ImageDate) -> Void)
) {
    val dailyImages = rememberSaveable() { // TODO from ViewModel
        listOf(
            ImageDate("2024-10-20".toDate()),
            ImageDate("2024-10-19".toDate()),
            ImageDate("2024-10-18".toDate())
        )
    }
    LazyColumn(
        modifier = modifier.fillMaxSize()
            .semantics { contentDescription = "Daily Images Home Screen"},
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(dailyImages, key = {imageDate -> imageDate.id})
        {
            showDay(it)
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
                text = day.monsun/*, style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.ExtraBold
                )*/
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