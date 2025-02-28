package com.example.recetas.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

import com.example.recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Recetas", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Blue)
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item { RecipeItem(imageRes = R.drawable.comida1, buttonText = "Ver Receta") }
            item { RecipeItem(imageRes = R.drawable.comida2, buttonText = "Ver Receta") }
            item { RecipeItem(imageRes = R.drawable.comida3, buttonText = "Ver Receta") }
            item { RecipeItem(imageRes = R.drawable.comida4, buttonText = "Ver Receta") }
        }
    }
}

@Composable
fun RecipeItem(imageRes: Int, buttonText: String) {
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
        Button(onClick = { /* Acción del botón */ }) {
            Text(text = buttonText, fontSize = 16.sp)
        }
    }
}