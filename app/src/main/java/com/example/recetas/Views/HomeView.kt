package com.example.recetas.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                title = {
                    Text(
                        "Recetario: Recetas Deliciosas 👨‍🍳",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF6D4C41))
            )
        },
        containerColor = Color.Transparent
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item { RecipeItem(navController, R.drawable.pastelera1, "Cubiletes de crema pastelera", "recipeDetail1") }
            item { RecipeItem(navController, R.drawable.cubiletes1, "Cubiletes de elote", "recipeDetail2") }
            item { RecipeItem(navController, R.drawable.pay1, "Pay de limón", "recipeDetail3") }
            item { RecipeItem(navController, R.drawable.coyotas1, "Coyotas sonorenses", "recipeDetail4") }
        }
    }
}

@Composable
fun RecipeItem(navController: NavController, imageRes: Int, buttonText: String, route: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(210.dp) // Ajuste de tamaño igual para todas las imágenes
                .clip(RoundedCornerShape(16.dp)) // Bordes redondeados
                .background(Color(0xFFD7CCC8)) // Borde de color beige
                .padding(4.dp) // Espaciado interno para el borde
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(12.dp)) //  Ajuste dentro del borde
                    .shadow(6.dp),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { navController.navigate(route) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF8D6E63),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(48.dp)
        ) {
            Text(
                text = buttonText,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
        }
    }
}
