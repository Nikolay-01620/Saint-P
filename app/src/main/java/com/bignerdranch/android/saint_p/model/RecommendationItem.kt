package com.bignerdranch.android.saint_p.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun RecommendationItem(
    recommendationText: Int,
    recommendationImage: Int,
) {
    Card(
        modifier = Modifier
            .padding(6.dp)
    ) {
        Row(
            modifier = Modifier
        ) {

            Image(
                modifier = Modifier
                    .padding(10.dp)
                    .size(80.dp)
                    .clip(MaterialTheme.shapes.small),
                contentScale = ContentScale.Crop,
                painter = painterResource(recommendationImage),
                contentDescription = null
            )
            Text(
                text = stringResource(id = recommendationText),
                modifier = Modifier
                    .padding(
                        start = 1.dp,
                        end = 10.dp,
                        top = 10.dp
                    )
            )
        }
    }
}