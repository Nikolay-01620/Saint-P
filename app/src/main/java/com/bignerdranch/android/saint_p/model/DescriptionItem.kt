package com.bignerdranch.android.saint_p.model

import androidx.compose.foundation.Image
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun DescriptionItem(
    descriptionText: Int,
    descriptionImage: Int,
) {

    Card {
        Image(
            painter = painterResource(id = descriptionImage),
            contentDescription = null
        )
        Text(text = stringResource(id = descriptionText))
    }


}