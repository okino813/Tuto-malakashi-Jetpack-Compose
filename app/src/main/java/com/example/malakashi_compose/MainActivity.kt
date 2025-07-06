package com.example.malakashi_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.*
import com.example.malakashi_compose.ui.theme.Malakashi_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyUiPreview()
        }
    }
}


@Composable
fun MyUi() {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(3)
        ){
            items(10){
                Box(modifier = Modifier
                    .padding(8.dp)
                    .size(50.dp)
                    .background(Color.Magenta))
            }
        }
        LazyRow{
            items(20){
                Box(modifier = Modifier
                    .padding(8.dp)
                    .size(150.dp)
                    .background(Color.Magenta))
            }
        }
//
        LazyColumn{
            items(5) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.Cyan),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Item $index")
                }
            }
        }

        LazyHorizontalGrid(
            rows = GridCells.Adaptive(20.dp)
        ){
            items(20){
                Box(modifier = Modifier
                    .padding(8.dp)
                    .size(200.dp)
                    .background(Color.Green))
            }
        }
    }
}

@Preview(device = "spec:width=411dp,height=891dp", showBackground = false, showSystemUi = true,
    wallpaper = Wallpapers.NONE
)
@Composable
fun MyUiPreview() {
        MyUi()
}


