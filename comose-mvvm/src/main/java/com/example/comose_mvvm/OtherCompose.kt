package com.example.comose_mvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.comose_mvvm.MainViewModel
import com.example.comose_mvvm.MyViewModel1

@Composable
fun SecondScreen() {
    var text by rememberSaveable { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = { Text("Enter your text") }
        )

        Text("You typed: $text")
    }
}

@Composable
fun RandomNameCompose(myViewModel1: MyViewModel1) {
    val name by myViewModel1.name.collectAsState("")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = name)
        Button(
            onClick = {
                myViewModel1.changeName()
            }
        ) {
            Text(
                text = "Change name"
            )
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val name by viewModel.name.collectAsState("")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingMessage(
            name
        ) { newName ->
            viewModel.onNameChanged(newName)
        }
    }
}

@Composable
fun GreetingMessage(textFieldValue: String, textFieldUpdate: (String) -> Unit) {
    TextField(value = textFieldValue, onValueChange = { textFieldUpdate(it) })
    Button(onClick = {}) {
        Text(text = textFieldValue)
    }
}