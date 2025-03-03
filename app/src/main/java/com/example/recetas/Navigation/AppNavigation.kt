package com.example.recetas.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recetas.Views.HomeView
import com.example.recetas.Views.RecipeDetailView
import com.example.recetas.Views.RecipeDetailView2
import com.example.recetas.Views.RecipeDetailView3
import com.example.recetas.Views.RecipeDetailView4

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeView(navController)
        }
        composable("recipeDetail1") {
            RecipeDetailView(navController)
        }
        composable("recipeDetail2") {
            RecipeDetailView2(navController)
        }
        composable("recipeDetail3") {
            RecipeDetailView3(navController)
        }
        composable("recipeDetail4") {
            RecipeDetailView4(navController)
        }
    }
}
