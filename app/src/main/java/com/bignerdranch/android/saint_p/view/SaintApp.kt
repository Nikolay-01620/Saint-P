package com.bignerdranch.android.saint_p.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bignerdranch.android.saint_p.data.Route
import com.bignerdranch.android.saint_p.data.dataCategory.CategoryResource
import com.bignerdranch.android.saint_p.data.dataRecommendation.RecommendationResource
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
                category = CategoryResource.categoryResource ,
                onCategoryClick =
                { navController.navigate(Route.RecommendationResourceRestaurants.name) }
            )
        }

        composable(route = Route.RecommendationResourceCoffeeShops.name) {
            RecommendationScreen(
                recommendation = RecommendationResource.recommendationResourceCoffeeShops
            ) { navController.navigate(Route.Description.name) }
        }
        composable(route = Route.RecommendationResourceRestaurants.name) {
            RecommendationScreen(
                recommendation = RecommendationResource.recommendationResourceRestaurants
            ) { navController.navigate(Route.Description.name) }
        }
        composable(route = Route.RecommendationResourceMuseums.name) {
            RecommendationScreen(
                recommendation = RecommendationResource.recommendationResourceMuseums
            ) { navController.navigate(Route.Description.name) }
        }
        composable(route = Route.RecommendationResourceParks.name) {
            RecommendationScreen(
                recommendation = RecommendationResource.recommendationResourceParks
            ) { navController.navigate(Route.Description.name) }
        }
        composable(route = Route.RecommendationResourceShoppingCenters.name) {
            RecommendationScreen(
                recommendation = RecommendationResource.recommendationResourceShoppingCenters
            ) { navController.navigate(Route.Description.name) }
        }
    }
}