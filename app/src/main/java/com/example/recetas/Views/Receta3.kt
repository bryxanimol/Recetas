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
import androidx.compose.ui.layout.ContentScale
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
fun RecipeDetailView3(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Pay de Limón 🍋",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF4CAF50)) // 🌿 Verde limón
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .background(Color(0xFFE8F5E9)), // 💚 Fondo verde claro
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 📌 Borde decorativo para la imagen
            Box(
                modifier = Modifier
                    .size(260.dp) // Aseguramos que el tamaño de la imagen sea consistente
                    .clip(RoundedCornerShape(16.dp)) // Bordes redondeados
                    .background(Color(0xFF81C784)) // Verde pastel que hace contraste con el fondo
                    .padding(6.dp) // Espaciado interno para el borde
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pay1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp)) // Bordes redondeados para la imagen
                        .shadow(6.dp), // Sombra ligera para profundidad
                    contentScale = ContentScale.Crop // Ajusta la imagen sin distorsionarla
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 📌 Caja con borde para la descripción
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .border(
                        BorderStroke(3.dp, Color(0xFF388E3C)), // Borde verde oscuro
                        RoundedCornerShape(12.dp)
                    )
                    .background(Color(0xFFF1F8E9), RoundedCornerShape(12.dp)) // Fondo verde muy claro
                    .padding(16.dp)
            ) {
                Text(
                    text = """
                        🍪 Ingredientes:
                        🌿 Para la base:
                        - 200 g de galletas Marías
                        - 100 g de mantequilla derretida

                        🍋 Para el relleno:
                        - 1 lata de leche condensada (397 g)
                        - 1 lata de leche evaporada (360 ml)
                        - 4 yemas de huevo
                        - ½ taza de jugo de limón (4-5 limones)
                        - Ralladura de 1 limón (opcional)

                        🎂 Para la decoración:
                        - Crema batida o merengue
                        - Rodajas o ralladura de limón

                        🏆 Preparación:
                        1️⃣ Preparar la base: Tritura las galletas y mézclalas con la mantequilla. Presiona en un molde y refrigera.
                        2️⃣ Hacer el relleno: Mezcla las leches con las yemas y el jugo de limón hasta espesar.
                        3️⃣ Hornear: Vierte la mezcla en la base y hornea a 180°C por 15 min.
                        4️⃣ Enfriar y decorar: Refrigera por 2 horas y decora con crema o merengue.

                        ¡Listo para disfrutar! 🎉
                    """.trimIndent(),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif, // Fuente elegante
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color(0xFF2E7D32) // Verde oscuro para contraste y lectura
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 🔘 Botón estilizado
            Button(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF388E3C),
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
