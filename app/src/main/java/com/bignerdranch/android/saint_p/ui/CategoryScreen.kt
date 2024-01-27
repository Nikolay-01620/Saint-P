package com.bignerdranch.android.saint_p.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.bignerdranch.android.saint_p.model.CategoryItem

@Composable
fun CategoryScreen(
    categoryText: Int,
    categoryImage: Int,
    ) {

    Column {

        CategoryItem(
            categoryText = categoryText,
            categoryImage = categoryImage
        )
        CategoryItem(
            categoryText = categoryText,
            categoryImage = categoryImage
        )
        CategoryItem(
            categoryText = categoryText,
            categoryImage = categoryImage
        )
        CategoryItem(
            categoryText = categoryText,
            categoryImage = categoryImage
        )
        CategoryItem(
            categoryText = categoryText,
            categoryImage = categoryImage
        )

    }


}