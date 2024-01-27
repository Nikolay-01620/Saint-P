package com.bignerdranch.android.saint_p.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.bignerdranch.android.saint_p.model.RecommendationItem

@Composable
fun RecommendationScreen(
    recommendationText: Int,
    recommendationImage: Int,

    ) {

    Column {
        RecommendationItem(
            recommendationText = recommendationText,
            recommendationImage = recommendationImage
        )
        RecommendationItem(
            recommendationText = recommendationText,
            recommendationImage = recommendationImage
        )
        RecommendationItem(
            recommendationText = recommendationText,
            recommendationImage = recommendationImage
        )
        RecommendationItem(
            recommendationText = recommendationText,
            recommendationImage = recommendationImage
        )
        RecommendationItem(
            recommendationText = recommendationText,
            recommendationImage = recommendationImage
        )
    }
}