package com.bignerdranch.android.saint_p.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.bignerdranch.android.saint_p.R
import com.bignerdranch.android.saint_p.preview.Preview
import com.bignerdranch.android.saint_p.ui.CategoryScreen
import com.bignerdranch.android.saint_p.ui.theme.SaintPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaintPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CategoryScreen(
                        categoryText = R.string.coffee_shops,
                        categoryImage = R.drawable._0143609816_1f82146fd4_c
                    )
                }
            }
        }
    }
}

