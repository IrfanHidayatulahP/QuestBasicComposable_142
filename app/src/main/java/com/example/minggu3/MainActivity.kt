package com.example.minggu3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.minggu3.ui.theme.Minggu3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Minggu3Theme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
                fontWeight = FontWeight.Bold))
        Text(text = "Ini adalah halaman Login")
        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = "Login Image",
            modifier = Modifier.padding(top = 5.dp). size(200.dp)
        )
        Text(text = "Nama",
            style = TextStyle(fontSize = 20.sp)
        )
        Text(text = "Irfan Hidayatulah P",
            style = TextStyle(fontSize = 15.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold)
        )
        Text(text = "20220140142",
            style = TextStyle(fontSize = 20.sp)
        )
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "It's Me",
            modifier = Modifier.padding(top = 10.dp). size(200.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Minggu3Theme {
        BasicLayout()
    }
}