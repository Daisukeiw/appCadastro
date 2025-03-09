package com.example.front_appcadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.front_appcadastro.ui.theme.Front_appCadastroTheme
import com.example.front_appcadastro.ui.theme.azulEscuro
import com.example.front_appcadastro.ui.theme.preto

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Front_appCadastroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Cadastro_Tela()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Cadastro_Tela() {
    // criação de variável
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }

    //Coluna principal
    Column() {
        Box(
            Modifier
                .height(130.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(

                            preto, azulEscuro
                        )
                    )
                )
                .fillMaxWidth()
        ) { // ícone
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "DESCRIÇÃO",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        // coluna com textfield
        Column(
            Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Cadastro",
                modifier = Modifier
                    .fillMaxWidth() // preenche a tela
                    .padding(top = 8.dp),
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                color = azulEscuro,
                textAlign = TextAlign.Center,
                letterSpacing = 1.sp
            )


            // spacer para separar
            Spacer(modifier = Modifier.height(20.dp))
            // Linha dos textfields
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // campo de texto nome
                TextField(
                    value = nome,
                    onValueChange = { nome = it },
                    label = { Text("Nome:") },
                    modifier = Modifier
                        .fillMaxWidth() // preenche a tela
                        .padding(10.dp)
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = preto,
                        unfocusedLabelColor = preto,
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // campo de texto nome
                TextField(
                    value = telefone,
                    onValueChange = { telefone = it },
                    label = { Text("Telefone:") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = preto,
                        unfocusedLabelColor = preto,
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // campo de texto curso
                TextField(
                    value = curso,
                    onValueChange = { curso = it },
                    label = { Text("Curso:") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = preto,
                        unfocusedLabelColor = preto,
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // campo de texto série
                TextField(
                    value = serie,
                    onValueChange = { serie = it },
                    label = { Text("Série:") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = preto,
                        unfocusedLabelColor = preto,
                    )
                )
            }
            // botão cadastrar
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Button(
                    onClick = {
                        nome = ""
                        telefone = ""
                        curso = ""
                        serie = ""
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent), // Cor de fundo transparente, já que o gradiente é aplicado
                    modifier = Modifier
                        .height(50.dp) // altura do botão
                        .width(150.dp) // largura do botão
                        .clip(RoundedCornerShape(25.dp)) // Arredonda as bordas
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    azulEscuro,
                                    azulEscuro
                                )
                            )
                        )
                ) {
                    Text(
                        text = "Cadastrar",
                        color = Color.White,
                        fontSize = 15.sp
                    )
                }
            }
        }


    }
}