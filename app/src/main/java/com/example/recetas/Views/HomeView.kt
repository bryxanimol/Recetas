package com.example.recetas.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Recetas-Postreria", color = Color.Black) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(245, 245, 220))
            )
        },
        containerColor = Color.Transparent // 🔥 Hace que el fondo del Scaffold sea transparente
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent) // 🔥 Asegura que no cubra la imagen de fondo
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item { RecipeItem(navController, R.drawable.comida1, "Cubiletes de crema pastelera", "recipeDetail1") }
            item { RecipeItem(navController, R.drawable.comida2, "Cubiletes de elote", "recipeDetail2") }
            item { RecipeItem(navController, R.drawable.comida3, "Pay de limon", "recipeDetail3") }
            item { RecipeItem(navController, R.drawable.comida4, "Coyotas sonorenses", "recipeDetail4") }
        }
    }
}

@Composable
fun RecipeItem(navController: NavController, imageRes: Int, buttonText: String, route: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate(route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(245, 245, 220),
                contentColor = Color.Black
            )
        ) {
            Text(text = buttonText, fontSize = 16.sp)
        }
    }
}
