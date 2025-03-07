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
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF4CAF50))
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .background(Color(0xFFE8F5E9)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(260.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFF81C784))
                    .padding(6.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pay1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp))
                        .shadow(6.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .border(
                        BorderStroke(3.dp, Color(0xFF388E3C)),
                        RoundedCornerShape(12.dp)
                    )
                    .background(Color(0xFFF1F8E9), RoundedCornerShape(12.dp))
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
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color(0xFF2E7D32)
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
