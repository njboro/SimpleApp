package com.example.simpleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpleapp.ui.theme.SimpleAppTheme

class BusinessCardAppActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleAppTheme {
                BusinessCardApp()
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    val imagePainter = painterResource(R.drawable.android_logo)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(R.color.light_green)
            ).padding(25.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .size(height = 150.dp, width = 150.dp).background(
                        color = Color(0xFF014820)
                    )
            )
            Text(text = "Nabajyoti Boro",
                modifier = Modifier
                    .padding(top = 10.dp),
                color = Color(0xFF070707),
                fontSize = 30.sp
            )
            Text(text = "Android Developer Extraordinaire",
                color = Color(0xFF015924),
                modifier = Modifier
                    .padding(top = 10.dp),
                fontWeight = FontWeight.Bold)
        }

        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            MyRowComposable(Icons.Filled.Call, stringResource(R.string.phone_number))
            MyRowComposable(Icons.Filled.Share, stringResource(R.string.social_id))
            MyRowComposable(Icons.Filled.Email, stringResource(R.string.email_id))
        }
    }
}

@Composable
fun MyRowComposable(imgVector: ImageVector, title : String) {
    Row(modifier = Modifier.padding(5.dp)) {
        Icon(
            imageVector = imgVector,
            contentDescription = null,
            tint = Color(0xFF0C7034)
        )
        Spacer(modifier = Modifier.size(width = 20.dp, height = 0.dp))
        Text(
            text = title
        )
    }
}

@Preview
@Composable
fun PreviewBusinessCardApp() {
    SimpleAppTheme {
        BusinessCardApp()
    }
}