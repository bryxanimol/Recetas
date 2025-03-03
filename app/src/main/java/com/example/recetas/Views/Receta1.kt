package com.example.recetas.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.navigation.NavController
import com.example.recetas.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeDetailView(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Cubiletes de crema pastelera", color = Color.Black) },
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
                painter = painterResource(id = R.drawable.comida1),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp)
            )
            Text(
                text = "Ingredientes\n" +
                        "Para la masa:\n" +
                        "250 g de harina de trigo\n" +
                        "125 g de mantequilla fría en cubos\n" +
                        "75 g de azúcar\n" +
                        "1 huevo\n" +
                        "1 pizca de sal\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "Para la crema pastelera:\n" +
                        "250 ml de leche\n" +
                        "50 g de azúcar\n" +
                        "2 yemas de huevo\n" +
                        "20 g de maicena\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "Preparación\n" +
                        "1. Preparar la masa:\n" +
                        "En un tazón, mezcla la harina con la sal y el azúcar.\n" +
                        "Agrega la mantequilla fría y mezcla con los dedos hasta obtener una textura arenosa.\n" +
                        "Incorpora el huevo y la vainilla, amasando solo hasta formar una masa homogénea.\n" +
                        "Envuélvela en plástico film y refrigérala por 30 minutos.\n" +
                        "2. Hacer la crema pastelera:\n" +
                        "En un tazón, bate las yemas con el azúcar hasta que se tornen más claras.\n" +
                        "Añade la maicena y mezcla bien.\n" +
                        "En una cacerola, calienta la leche a fuego medio hasta que esté tibia (sin hervir).\n" +
                        "Vierte la leche poco a poco sobre la mezcla de yemas, batiendo constantemente.\n" +
                        "Regresa la mezcla a la cacerola y cocina a fuego medio-bajo, removiendo hasta que espese.\n" +
                        "Retira del fuego, agrega la vainilla y deja enfriar.\n" +
                        "3. Formar y hornear los cubiletes:\n" +
                        "Precalienta el horno a 180°C.\n" +
                        "Extiende la masa con un rodillo y corta círculos para forrar moldes para cupcakes o tartaletas.\n" +
                        "Rellena cada base de masa con la crema pastelera.\n" +
                        "Hornea por 20-25 minutos o hasta que la masa esté dorada.\n" +
                        "Deja enfriar antes de desmoldar y servir.",
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
