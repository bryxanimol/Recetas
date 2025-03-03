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
fun RecipeDetailView4(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Coyotas sonorenses", color = Color.Black) },
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
                painter = painterResource(id = R.drawable.comida4),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp)
            )
            Text(
                text = "Ingredientes\n" +
                        "Para la masa:\n" +
                        "500 g de harina de trigo\n" +
                        "200 g de manteca vegetal o mantequilla derretida\n" +
                        "150 g de azúcar\n" +
                        "1 cucharadita de polvo para hornear\n" +
                        "1 pizca de sal\n" +
                        "½ taza de agua tibia\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "Para el relleno:\n" +
                        "250 g de piloncillo rallado o azúcar mascabado\n" +
                        "2 cucharadas de harina de trigo\n" +
                        "1 cucharadita de canela en polvo (opcional)\n" +
                        "Preparación\n" +
                        "1. Preparar la masa:\n" +
                        "En un tazón grande, mezcla la harina, el azúcar, el polvo para hornear y la sal.\n" +
                        "Agrega la manteca vegetal o mantequilla y mezcla con las manos hasta obtener una textura arenosa.\n" +
                        "Añade el agua tibia y la vainilla poco a poco, amasando hasta formar una masa suave y manejable.\n" +
                        "Cubre la masa con un paño y deja reposar por 30 minutos.\n" +
                        "2. Preparar el relleno:\n" +
                        "En un tazón, mezcla el piloncillo rallado con la harina y la canela. La harina ayuda a absorber la humedad y evita que el relleno se escurra al hornear.\n" +
                        "3. Armar las coyotas:\n" +
                        "Precalienta el horno a 180°C y engrasa una charola para hornear.\n" +
                        "Divide la masa en pequeñas porciones y extiéndelas con un rodillo hasta formar círculos de aproximadamente 10 cm de diámetro.\n" +
                        "Coloca una cucharada del relleno en el centro de la mitad de los círculos de masa.\n" +
                        "Cubre con otro círculo de masa y presiona los bordes con un tenedor para sellar.\n" +
                        "Haz pequeños piquetes en la superficie con un tenedor para que el vapor escape y no se deformen.\n" +
                        "4. Hornear las coyotas:\n" +
                        "Coloca las coyotas en la charola y hornéalas por 20-25 minutos o hasta que estén doradas.\n" +
                        "Deja enfriar antes de servir.",
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
