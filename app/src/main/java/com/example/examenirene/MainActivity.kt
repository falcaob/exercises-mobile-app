package com.example.examenirene

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardColors
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenirene.ui.theme.ExamenIreneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaNavegacion()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaNavegacion() {

    val navController = rememberNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
    ) {

        Spacer(modifier = Modifier.size(30.dp))

        BarraBotones(navController = navController)

        NavHost(navController = navController, startDestination = "ejercicio1") {
            composable("ejercicio1") { Ejercicio1(navController) }
            composable("ejercicio2") { Ejercicio2(navController) }
            composable("ejercicio3") { Ejercicio3(navController) }
        }
    }
}

@Composable
fun BarraBotones(navController: NavController) {

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Magenta),
    ) {
        Button(onClick = { navController.navigate("ejercicio1") }) { Text(text = "Ejer01") }

        Button(onClick = { navController.navigate("ejercicio2") }) { Text(text = "Ejer02") }

        Button(onClick = { navController.navigate("ejercicio3") }) { Text(text = "Ejer03") }
    }
}

@Composable
fun Ejercicio1 (navController: NavController) {

    Spacer(modifier = Modifier.size(10.dp))

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Magenta),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "1",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "2",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "3",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "4",
                modifier = Modifier
                    .size(150.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
            Text(
                text = "5",
                modifier = Modifier
                    .size(100.dp)
                    .background(color = Color.Magenta),
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
            Text(
                text = "6",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Magenta),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "7",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "8",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "9",
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Gray),
                textAlign = TextAlign.Center,
                color = Color.Magenta
            )
        }

    }
}

@Composable
fun Ejercicio2 (navController: NavController) {

    Spacer(Modifier.size(50.dp))
    Column(modifier = Modifier.padding(10.dp).fillMaxWidth().background(color = Color.Magenta, shape = RoundedCornerShape(16.dp))) {

        Spacer(modifier = Modifier.height(5.dp))

        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Calcular salario", modifier = Modifier
                .background(color = Color.Gray)
                .padding(5.dp),
                color = Color.Magenta,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }

        var hInicio by remember {
            mutableStateOf("")
        }
        var hFin by remember {
            mutableStateOf("")
        }
        var tiempoDescanso by remember {
            mutableStateOf("")
        }
        var salario by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            value = hInicio,
            onValueChange = { hInicio = it },
            label = {
                Text(text = "Hora inicio")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = hFin,
            onValueChange = { hFin = it },
            label = {
                Text(text = "Hora fin")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = tiempoDescanso,
            onValueChange = { tiempoDescanso = it },
            label = {
                Text(text = "Tiempo descanso")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {

            Button(
                onClick = {

                    var trabajado = 0
                    trabajado = (hFin.toInt() - hInicio.toInt() - tiempoDescanso.toInt()) * 10
                    salario = "$trabajado €" // concatenar para simbolo
                },
                modifier = Modifier.padding(10.dp)
            )
            {
                Text(text = "Salario")
            }
        }

        TextField(
            value = salario,
            onValueChange = { salario = it},
            label = {
                Text(text = "Salario")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            enabled = false
        )
    }
}

@Composable
fun Ejercicio3 (navController: NavController) {

    Spacer(Modifier.size(50.dp))
    Column(modifier = Modifier.padding(10.dp).fillMaxWidth()) {

        val subNavController = rememberNavController()

        NavHost(navController = subNavController, startDestination = "mostrarLista") {

            composable("mostrarLista") { MostraLista(subNavController) }
            composable("insertarPokemon") { AdministrarLista(subNavController) }
        }

    }
}

// Datos app
data class Pokemon(
    val id: Int,
    val nombre: String,
    val bando: String,
    val imagen: Int
)

// Lista mutable de pokemons
var Pokemons = mutableStateListOf<Pokemon>(
    Pokemon(1, "Pikachu", "De los buenos", R.drawable.pikachu),
    Pokemon(2, "Bolita", "De los buenos", R.drawable.bolita),
    Pokemon(3, "Bulbasur", "De los buenos", R.drawable.bulbasaur),
    Pokemon(4, "Meowth", "De los malos", R.drawable.meowth),
)

@Composable
fun Tarjeta(indice: Int, pokemon: Pokemon, navController: NavController) {

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 2.dp),
        colors = CardColors(
            containerColor = Color.Magenta,
            contentColor = Color.Blue,
            disabledContentColor = Color.Red,
            disabledContainerColor = Color.Gray
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {

            Column {
                Image(
                    painter = painterResource(R.drawable.delete),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clickable {
                        Pokemons.removeAt(indice)
                    }
                )
            }
            Column {
                Text(
                    text = "Pokemon: ${pokemon.nombre}",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "Bando: ${pokemon.bando}",
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Spacer(modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = (pokemon.imagen).toInt()),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(50.dp)
            )
        }
    }
}

@Composable
fun MostraLista(navController: NavController) {

    Column (modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Button(onClick = { navController.navigate("insertarPokemon") }) {
            Text("Nuevo pokemon")  }

        Spacer(modifier = Modifier.size(30.dp))

        LazyColumn{
            itemsIndexed(Pokemons){
                    indice, pokemon -> Tarjeta(indice = indice, pokemon = pokemon, navController = navController)
            }
        }
    }
}

@Composable
fun AdministrarLista(navController: NavController) {
    //crear los estados para almacenar los OutlineTextField

    var nombre by remember {
        mutableStateOf("")
    }

    var bando by remember {
        mutableStateOf("")
    }

    var imagen by remember {
        mutableStateOf(0)
    }

    var ultimoID = Pokemons.size + 1;

    Spacer(Modifier.size(10.dp))
    Column(modifier = Modifier.padding(10.dp).background(color = Color.Magenta, shape = RoundedCornerShape(16.dp)).padding(16.dp)) {
        Spacer(Modifier.size(40.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Insertar",
                modifier = Modifier
                    .padding(5.dp),
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp
                )
            )
        }

        OutlinedTextField(
            value = ultimoID.toString(),
            onValueChange = { ultimoID = it.toIntOrNull() ?: ultimoID },
            label = {
                Text(text = "ID")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            enabled = true
        )

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = {
                Text(text = "Nombre")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )

        OutlinedTextField(
            value = bando,
            onValueChange = { bando = it },
            label = {
                Text(text = "Descripción")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )

        var selectedOption by remember { mutableStateOf(R.drawable.cabrita) }
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(Modifier.size(40.dp))

            Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text("Bolita")
                RadioButton(
                    selected = selectedOption == R.drawable.bolita,
                    onClick = { selectedOption = R.drawable.bolita}
                )
                Text("Bulbasur")
                RadioButton(
                    selected = selectedOption == R.drawable.bulbasaur,
                    onClick = { selectedOption = R.drawable.bulbasaur}
                )
                Text("Cabrita")
                RadioButton(
                    selected = selectedOption == R.drawable.cabrita,
                    onClick = { selectedOption = R.drawable.cabrita}
                )
            }

            Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text("Caterpie")
                RadioButton(
                    selected = selectedOption == R.drawable.caterpie,
                    onClick = { selectedOption = R.drawable.caterpie}
                )
                Text("Charmander")
                RadioButton(
                    selected = selectedOption == R.drawable.charmander,
                    onClick = { selectedOption = R.drawable.charmander}
                )
                Text("Chicorita")
                RadioButton(
                    selected = selectedOption == R.drawable.chicorita,
                    onClick = { selectedOption = R.drawable.chicorita}
                )
            }

            Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text("Dragon")
                RadioButton(
                    selected = selectedOption == R.drawable.dragon,
                    onClick = { selectedOption = R.drawable.dragon}
                )
                Text("Mariposa")
                RadioButton(
                    selected = selectedOption == R.drawable.mariposa,
                    onClick = { selectedOption = R.drawable.mariposa}
                )
                Text("Meowth")
                RadioButton(
                    selected = selectedOption == R.drawable.meowth,
                    onClick = { selectedOption = R.drawable.meowth}
                )
            }

            Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text("Pikachu")
                RadioButton(
                    selected = selectedOption == R.drawable.pikachu,
                    onClick = { selectedOption = R.drawable.pikachu }
                )
                Text("Piplup")
                RadioButton(
                    selected = selectedOption == R.drawable.piplup,
                    onClick = { selectedOption = R.drawable.piplup }
                )
                Text("Sirena")
                RadioButton(
                    selected = selectedOption == R.drawable.sirena,
                    onClick = { selectedOption = R.drawable.sirena }
                )

            }

            Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Text("Snorlax")
                RadioButton(
                    selected = selectedOption == R.drawable.snorlap,
                    onClick = { selectedOption = R.drawable.snorlap }
                )
            }

            imagen = selectedOption

            Button(
                onClick = {
                    var nuevoPersonaje = Pokemon(ultimoID, nombre, bando, imagen)
                    Pokemons.add(nuevoPersonaje)
                    nombre = ""
                    bando = ""
                    imagen = 0
                }) {
                Text(
                    text = "Insertar"
                )
            }

        }
    }

}