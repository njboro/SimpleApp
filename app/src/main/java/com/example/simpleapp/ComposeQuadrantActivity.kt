package com.example.simpleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleapp.ui.theme.SimpleAppTheme

class ComposeQuadrantActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }

    @Composable
    fun ComposeQuadrantApp() {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(Modifier.weight(1f)) {
                ComposableInfoCard(
                    title = stringResource(R.string.text_composable),
                    description = stringResource(R.string.displays_text_follows),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.image_composable),
                    description = stringResource(R.string.creates_composable),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                ComposableInfoCard(
                    title = stringResource(R.string.row_composable),
                    description = stringResource(R.string.layout_composable),
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = stringResource(R.string.column_composable),
                    description = stringResource(R.string.a_layout_composable_vertical_sequence),
                    backgroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

    @Preview
    @Composable
    fun QuadrantScreenPreview() {
        SimpleAppTheme {
            ComposeQuadrantApp()
        }
    }

    @Composable
    private fun ComposableInfoCard(
        title : String,
        description : String,
        backgroundColor : Color,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }
}