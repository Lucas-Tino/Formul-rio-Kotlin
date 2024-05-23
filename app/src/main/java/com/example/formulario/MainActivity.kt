package com.example.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormularioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    var nome by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }

    Column(
        Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .background(Color(28, 100, 255))
                .fillMaxWidth()
                .padding(5.dp),
            Arrangement.Center
        ) {
            Text(
                text = "App Formulário",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = { Text(text = "Nome:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cpf,
                onValueChange = {cpf = it},
                label = { Text(text = "CPF:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = endereco,
                onValueChange = {endereco = it},
                label = { Text(text = "Endereço:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = cidade,
                onValueChange = {cidade = it},
                label = { Text(text = "Cidade:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = estado,
                onValueChange = {estado = it},
                label = { Text(text = "Estado:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = { Text(text = "Telefone:")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(28, 100, 255),
                    unfocusedLabelColor = Color(28, 100, 255),
                    unfocusedContainerColor = Color.White,
                    unfocusedTextColor = Color.Black,

                    focusedIndicatorColor = Color(28, 100, 255),
                    focusedLabelColor = Color(28, 100, 255),
                    focusedContainerColor = Color.White,
                    focusedTextColor = Color.Black,

                    cursorColor = Color(28, 100, 255)
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Done
                )
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {}

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(28, 100, 255)),
            ) {
                Text(
                    text = "Cadastrar",
                    color = Color.White,
                    fontSize = 20.sp,
                )
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    FormularioTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}