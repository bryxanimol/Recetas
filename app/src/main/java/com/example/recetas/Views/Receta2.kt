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
fun RecipeDetailView2(navController: NavController, background: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Cubiletes de elote", color = Color.Black) },
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
                painter = painterResource(id = R.drawable.comida2),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp) // Espaciado interno
                    .border(4.dp, Color.White) // 📌 Agrega un borde blanco de 4dp

            )
            Text(
                text = "Ingredientes\n" +
                        "Para la masa:\n" +
                        "1 taza de harina de maíz (puede ser de la que se usa para tamales)\n" +
                        "1 taza de harina de trigo\n" +
                        "½ taza de mantequilla derretida\n" +
                        "½ taza de azúcar\n" +
                        "1 huevo\n" +
                        "1 cucharadita de polvo para hornear\n" +
                        "½ taza de leche\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "Pizca de sal\n" +
                        "Para el relleno de elote:\n" +
                        "2 tazas de granos de elote (puedes usar elote fresco o enlatado)\n" +
                        "½ taza de crema\n" +
                        "1 cucharadita de azúcar\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "2 cucharadas de maicena disueltas en 3 cucharadas de agua\n" +
                        "Pizca de sal\n" +
                        "Preparación\n" +
                        "1. Preparar la masa:\n" +
                        "Precalienta el horno a 180°C y engrasa un molde para cubiletes o flaneras pequeñas.\n" +
                        "En un tazón grande, mezcla las harinas, el polvo para hornear, el azúcar y la sal.\n" +
                        "Agrega la mantequilla derretida y el huevo, mezcla bien hasta obtener una masa suave.\n" +
                        "Añade la leche poco a poco y la esencia de vainilla. Mezcla hasta obtener una masa homogénea, suave pero no líquida.\n" +
                        "2. Preparar el relleno de elote:\n" +
                        "Si estás usando elote fresco, licúa los granos con un poco de leche hasta que se forme una mezcla suave. Si usas elote enlatado, licúa los granos con la crema, azúcar, y vainilla.\n" +
                        "Cocina la mezcla de elote a fuego medio en una cacerola.\n" +
                        "Añade la maicena disuelta en agua para espesar el relleno. Cocina por 5-7 minutos hasta que espese.\n" +
                        "Retira del fuego y deja enfriar un poco.\n" +
                        "3. Formar los cubiletes:\n" +
                        "Coloca una cucharada de masa en cada molde, asegurándote de cubrir el fondo.\n" +
                        "Añade una cucharada del relleno de elote sobre la masa, y luego cúbrelo con más masa para sellar el cubilete.\n" +
                        "Coloca los moldes en el horno y hornea durante 20-25 minutos o hasta que los cubiletes estén dorados en la parte superior.\n" +
                        "Deja enfriar un poco antes de desmoldar.\n",
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
