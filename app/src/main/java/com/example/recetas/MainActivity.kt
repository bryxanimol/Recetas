package com.example.recetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.recetas.ui.theme.RecetasTheme
import com.example.recetas.Navigation.AppNavigation
import com.example.recetas.R // Asegúrate de importar la imagen desde res/drawable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecetasTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    // Imagen de fondo
                    Image(
                        painter = painterResource(id = R.drawable.chef), // 📌 Imagen en res/drawable
                        contentDescription = "Fondo de la aplicación",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop // Ajusta la imagen al tamaño de la pantalla
                    )

                    // Navegación encima del fondo
                    val navController = rememberNavController()
                    AppNavigation(navController)
                }
            }
        }
    }
}
