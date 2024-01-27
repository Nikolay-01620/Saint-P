package com.bignerdranch.android.saint_p.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.bignerdranch.android.saint_p.data.dataCategory.DataCategoryTemplate
import com.bignerdranch.android.saint_p.model.RecommendationItem

@Composable
fun RecommendationScreen(
    recommendation: List<DataCategoryTemplate>,
    onRecommendationClick: () -> Unit
) {


    LazyColumn {
        items(recommendation) {
            RecommendationItem(
                recommendationText = ,
                recommendationImage = ,
                onRecommendationClick = onRecommendationClick
            )
        }
    }
}