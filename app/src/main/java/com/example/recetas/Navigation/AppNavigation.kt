package com.example.recetas.Navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recetas.R
import com.example.recetas.Views.HomeView
import com.example.recetas.Views.RecipeDetailView
import com.example.recetas.Views.RecipeDetailView2
import com.example.recetas.Views.RecipeDetailView3
import com.example.recetas.Views.RecipeDetailView4

@Composable
fun AppNavigation(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5E1A4))
    ) {

        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Fondo de la aplicación",
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent), // Asegura que la imagen no tenga fondo sólido
            contentScale = ContentScale.Crop
        )

        // Contenedor de navegación encima del fondo
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.fillMaxSize()
        ) {
            composable("home") {
                HomeView(navController, Modifier.fillMaxSize().background(Color.Transparent))
            }
            composable("recipeDetail1") {
                RecipeDetailView(navController, Modifier.fillMaxSize().background(Color.Transparent))
            }
            composable("recipeDetail2") {
                RecipeDetailView2(navController, Modifier.fillMaxSize().background(Color.Transparent))
            }
            composable("recipeDetail3") {
                RecipeDetailView3(navController, Modifier.fillMaxSize().background(Color.Transparent))
            }
            composable("recipeDetail4") {
                RecipeDetailView4(navController, Modifier.fillMaxSize().background(Color.Transparent))
            }
        }
    }
}
