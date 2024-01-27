package com.bignerdranch.android.saint_p.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.bignerdranch.android.saint_p.data.dataRecommendation.DataRecommendationTemplate
import com.bignerdranch.android.saint_p.model.RecommendationItem

@Composable
fun RecommendationScreen(
    recommendation: List<DataRecommendationTemplate>,
    onRecommendationClick: () -> Unit
) {


    LazyColumn {
        items(recommendation) {
            RecommendationItem(
                recommendationText = it.recommendationText,
                recommendationImage = it.recommendationImage,
                onRecommendationClick = onRecommendationClick
            )
        }
    }
}