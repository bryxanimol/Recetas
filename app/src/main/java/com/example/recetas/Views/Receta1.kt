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
fun RecipeDetailView(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Cubiletes de Crema Pastelera🎂 ",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFFFDD835)) // Amarillo pastel
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .background(Color.White), // Fondo blanco para que no se sobrecargue el color
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 🔥 Borde decorativo para la imagen
            Box(
                modifier = Modifier
                    .size(260.dp) // El tamaño de la imagen se ajusta al borde
                    .clip(RoundedCornerShape(16.dp)) // Bordes redondeados
                    .background(Color(0xFFE57373)) // Borde color rojo suave (contrasta bien con el amarillo)
                    .padding(4.dp) // Espaciado interno para el borde
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pastelera1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp)) // Bordes redondeados para la imagen
                        .shadow(6.dp), // Sombra más ligera para profundidad
                    contentScale = ContentScale.Crop // Ajusta la imagen para llenar el contenedor sin distorsionarse
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 📌 Caja con borde para la descripción
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .border(
                        BorderStroke(3.dp, Color(0xFF8D6E63)), // Borde café claro
                        RoundedCornerShape(12.dp)
                    )
                    .background(Color(0xFFFFF3E0), RoundedCornerShape(12.dp)) // Fondo crema suave
                    .padding(16.dp)
            ) {
                Text(
                    text = """
                        🍰 Ingredientes:
                        - 250 g de harina de trigo
                        - 125 g de mantequilla fría en cubos
                        - 75 g de azúcar
                        - 1 huevo
                        - 1 pizca de sal
                        - 1 cucharadita de esencia de vainilla
                        
                        🍮 Crema pastelera:
                        - 250 ml de leche
                        - 50 g de azúcar
                        - 2 yemas de huevo
                        - 20 g de maicena
                        - 1 cucharadita de esencia de vainilla

                        🥧 Preparación:
                        1️⃣ Mezcla la harina, sal y azúcar. Agrega la mantequilla y amasa hasta formar una masa homogénea.
                        2️⃣ Refrigera por 30 min.
                        3️⃣ Cocina la leche con la maicena y las yemas hasta espesar.
                        4️⃣ Extiende la masa y coloca en moldes de cupcakes.
                        5️⃣ Rellena con la crema y hornea a 180°C por 25 min.
                        6️⃣ ¡Disfruta!
                    """.trimIndent(),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif, // Fuente más elegante
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color(0xFF4E342E) // Café oscuro para buena lectura
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 🔘 Botón estilizado
            Button(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF8D6E63),
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
