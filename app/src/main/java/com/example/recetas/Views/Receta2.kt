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
fun RecipeDetailView2(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Cubiletes de Elote🌽 ",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFFFBC02D))
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .background(Color(0xFFFFF9C4)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(260.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFFE57373))
                    .padding(6.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cubiletes1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp))
                        .shadow(6.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 📌 Caja con borde para la descripción
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .border(
                        BorderStroke(3.dp, Color(0xFF8D6E63)),
                        RoundedCornerShape(12.dp)
                    )
                    .background(Color(0xFFFFF3E0), RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                Text(
                    text = """
                        🌽 Ingredientes:
                        - 1 taza de harina de maíz
                        - 1 taza de harina de trigo
                        - ½ taza de mantequilla derretida
                        - ½ taza de azúcar
                        - 1 huevo
                        - 1 cucharadita de polvo para hornear
                        - ½ taza de leche
                        - 1 cucharadita de esencia de vainilla
                        - Pizca de sal

                        🧀 Relleno de elote:
                        - 2 tazas de granos de elote
                        - ½ taza de crema
                        - 1 cucharadita de azúcar
                        - 1 cucharadita de esencia de vainilla
                        - 2 cucharadas de maicena disueltas en agua
                        - Pizca de sal

                        🍽️ Preparación:
                        1️⃣ Mezcla los ingredientes secos de la masa.
                        2️⃣ Agrega la mantequilla, huevo y líquidos hasta formar una masa homogénea.
                        3️⃣ Licúa el elote con crema y azúcar, cocina con la maicena hasta espesar.
                        4️⃣ Forma los cubiletes con la masa y rellénalos con la mezcla de elote.
                        5️⃣ Hornea a 180°C por 25 minutos y deja enfriar.
                        6️⃣ ¡Disfruta de este delicioso postre!
                    """.trimIndent(),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color(0xFF4E342E)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))


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
