package com.example.recetas.Views



import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.navigation.NavController
import com.example.recetas.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeDetailView3(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pay de limon", color = Color.Black) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(191, 223, 255))
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.comida3),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp) // Espaciado interno
                    .border(4.dp, Color.White) // 📌 Agrega un borde blanco de 4dp
            )

            Text(
                text = "Ingredientes\n" +
                        "Para la base:\n" +
                        "200 g de galletas Marías (o galletas tipo Digestive)\n" +
                        "100 g de mantequilla derretida\n" +
                        "Para el relleno:\n" +
                        "1 lata de leche condensada (397 g)\n" +
                        "1 lata de leche evaporada (360 ml)\n" +
                        "4 yemas de huevo\n" +
                        "½ taza de jugo de limón (aprox. 4-5 limones)\n" +
                        "Ralladura de 1 limón (opcional)\n" +
                        "Para la decoración (opcional):\n" +
                        "1 taza de crema batida o merengue\n" +
                        "Rodajas o ralladura de limón\n" +
                        "Preparación\n" +
                        "1. Preparar la base:\n" +
                        "Tritura las galletas hasta obtener un polvo fino. Puedes hacerlo con un procesador de alimentos o metiéndolas en una bolsa y aplastándolas con un rodillo.\n" +
                        "Mezcla las galletas trituradas con la mantequilla derretida hasta obtener una textura de arena húmeda.\n" +
                        "Cubre el fondo y los lados de un molde para pay (aprox. 22 cm de diámetro) con esta mezcla, presionando bien con una cuchara.\n" +
                        "Refrigera durante 15 minutos para que se compacte.\n" +
                        "2. Hacer el relleno:\n" +
                        "Precalienta el horno a 180°C.\n" +
                        "En un tazón, bate las yemas de huevo con la leche condensada y la leche evaporada hasta que la mezcla sea homogénea.\n" +
                        "Agrega el jugo de limón poco a poco, mezclando constantemente hasta que espese ligeramente. Añade la ralladura de limón si lo deseas.\n" +
                        "Vierte la mezcla sobre la base de galleta refrigerada.\n" +
                        "3. Hornear y enfriar:\n" +
                        "Hornea el pay durante 15 minutos a 180°C, solo hasta que el relleno cuaje.\n" +
                        "Retira del horno y deja enfriar a temperatura ambiente. Luego, refrigera por al menos 2 horas antes de servir.\n" +
                        "4. Decorar y servir:\n" +
                        "Puedes decorar con crema batida o merengue.\n" +
                        "Añade rodajas de limón o ralladura para darle un toque especial.\n",
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { navController.navigate("home") }) {
                Text("Regresar", fontSize = 16.sp)
            }
        }
    }
}
