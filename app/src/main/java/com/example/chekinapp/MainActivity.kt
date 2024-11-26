package com.example.chekinapp

import android.icu.util.Calendar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chekinapp.ui.theme.ChekinappTheme
import androidx.lifecycle.ViewModel
import androidx.compose.foundation.layout.*
import com.example.chekinapp.app.CheckinApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            CheckinApp()
//            ChekinappTheme {
//            }


        }
    }
}



//@Composable
//fun Hello(modifier: Modifier = Modifier) {
//        val message = "Hello world"
//        val size = 28.sp
//        Text(
//            text= message,
//            fontSize = size,
//            modifier = modifier
//        )
//}
//
//@Preview()
//@Composable
//fun HelloPreview() {
//    ChekinappTheme {
//        Hello()
//    }
//}

