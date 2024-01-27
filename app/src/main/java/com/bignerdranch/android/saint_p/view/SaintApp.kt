package com.bignerdranch.android.saint_p.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bignerdranch.android.saint_p.data.Route
import com.bignerdranch.android.saint_p.ui.CategoryScreen
import com.bignerdranch.android.saint_p.ui.RecommendationScreen

@Composable
fun SaintApp(
    navController: NavHostController = rememberNavController()

) {

    NavHost(
        navController = navController,
        startDestination = Route.Category.name
    ) {
        composable(route = Route.Category.name) {
            CategoryScreen(
                category = ,
                onCategoryClick =
                { navController.navigate(Route.Recommendation.name) }
            )
        }

        composable(route = Route.Recommendation.name) {
            RecommendationScreen(
                recommendation = ,
                onRecommendationClick =
                { navController.navigate(Route.Description.name) })
        }
    }
}