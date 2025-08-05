package com.example.comose_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.comose_mvvm.ui.theme.SimpleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel : MyViewModel1 by viewModels()
            SimpleAppTheme {
                RandomNameCompose(viewModel)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    SimpleAppTheme {
        RandomNameCompose(MyViewModel1())
    }
}



