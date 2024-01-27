package com.bignerdranch.android.saint_p.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.bignerdranch.android.saint_p.data.DataCategoryTemplate
import com.bignerdranch.android.saint_p.model.CategoryItem

@Composable
fun CategoryScreen(
    categoryText: Int,
    categoryImage: Int,
    category: List<DataCategoryTemplate>,
    onCategoryClick: () -> Unit
) {


    LazyColumn {
        items(category) {
            CategoryItem(
                categoryText = categoryText,
                categoryImage = categoryImage,
                onCategoryClick = onCategoryClick
            )
        }
    }
}