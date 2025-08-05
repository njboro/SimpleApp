package com.example.simpleapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleapp.ui.theme.SimpleAppTheme

class MyListViewActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimpleAppTheme {
                ListViewWithCardUI()
            }
        }
    }

    @Composable
    fun MyListViewScreen() {
        val names = listOf("Nabajyoti", "Siva", "Divya", "Deepak", "Rajat", "Rama")

        LazyColumn {
            items(names) { name ->
                Text(
                    text = name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
            }
        }
    }

    @Preview
    @Composable
    fun PreviewMyListViewScreen() {
        SimpleAppTheme {
            ListViewWithCardUI()
        }
    }

    @Composable
    fun ListViewWithCardUI() {
        val context = LocalContext.current
        val people = listOf(
            Person("Nabajyoti", 10000),
            Person("Siva", 20000),
            Person("Divya", 30000),
            Person("Deepak", 15000),
            Person("Rajat", 16000),
            Person("Rama", 20000)
        )

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items = people) {
                person ->
                PersonCard(person, onClick = {
                    //Handle click here
                    println("Clicked on ${person.name} (Rs. ${person.salary})")
                    Toast.makeText(context, "${person.name} clicked", Toast.LENGTH_LONG).show()
                })
            }
        }
    }

    @Composable
    fun PersonCard( person: Person, onClick: () -> Unit) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }, // 👈 Click handler here
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(person.name, style = MaterialTheme.typography.titleMedium)
                Text("Salary: ₹${person.salary}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }

    //Basic Toolbar with TopAppBar
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyScreenWithToolbar() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("My Toolbar")
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {println("Back Pressed")}
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                )
            }
        ) {
            // Your screen content here
            Column(modifier = Modifier.padding(it)) {
                Text("Hello, content below the toolbar!")
            }
        }
    }
}

