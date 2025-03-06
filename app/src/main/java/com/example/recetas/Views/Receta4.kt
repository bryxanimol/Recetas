package com.example.recetas.Views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeDetailView4(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Coyotas Sonorenses 🌵",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFFD84315)) // 🔥 Naranja rústico
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .background(Color(0xFFFFF3E0)), // Fondo beige claro para contraste suave
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 📌 Imagen ajustada al borde y con un color contrastante
            Box(
                modifier = Modifier
                    .fillMaxWidth() // Ajuste al ancho completo
                    .height(250.dp) // Tamaño ajustado de la imagen
                    .clip(RoundedCornerShape(16.dp)) // Esquinas redondeadas
                    .shadow(6.dp, shape = RoundedCornerShape(16.dp)) // Sombra suave
                    .background(Color(0xFFD84315)) // Contraste con color naranja
            ) {
                Image(
                    painter = painterResource(id = R.drawable.coyotas1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize() // Imagen ajustada al tamaño de la caja
                        .clip(RoundedCornerShape(16.dp)) // Esquinas redondeadas
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 📌 Caja con fondo y borde para la descripción
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .border(
                        BorderStroke(3.dp, Color(0xFFBF360C)), // 🌰 Borde marrón oscuro
                        RoundedCornerShape(12.dp)
                    )
                    .background(Color(0xFFFFE0B2), RoundedCornerShape(12.dp)) // 🍪 Fondo beige suave
                    .padding(16.dp)
            ) {
                Text(
                    text = """
                        🍪 Ingredientes:
                        🌾 Para la masa:
                        - 500 g de harina de trigo
                        - 200 g de manteca vegetal o mantequilla
                        - 150 g de azúcar
                        - 1 cdita. de polvo para hornear
                        - 1 pizca de sal
                        - ½ taza de agua tibia
                        - 1 cdita. de esencia de vainilla

                        🍯 Para el relleno:
                        - 250 g de piloncillo rallado
                        - 2 cdas. de harina de trigo
                        - 1 cdita. de canela en polvo (opcional)

                        🏆 Preparación:
                        1️⃣ Preparar la masa: Mezcla los ingredientes secos, añade la manteca y amasa con agua y vainilla.
                        2️⃣ Relleno: Mezcla el piloncillo con harina y canela.
                        3️⃣ Formar las coyotas: Extiende la masa en círculos, coloca el relleno y sella los bordes con un tenedor.
                        4️⃣ Hornear: Cocina a 180°C por 20-25 minutos hasta dorar.

                        ¡Disfruta estas deliciosas coyotas sonorenses! 🎉
                    """.trimIndent(),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color(0xFF6D4C41) // 🍂 Marrón para buen contraste
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 🔘 Botón estilizado
            Button(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFBF360C), // 🔥 Naranja oscuro
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .height(48.dp)
            ) {
                Text("Regresar", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}
