package com.example.malakashi_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
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
            MyUiTablettePreview()
        }
    }
}


@Composable
fun MyUi() {
    Box(modifier = Modifier.size(100.dp).background(Color.Red))
}

@Preview(device = "spec:width=411dp,height=891dp", showBackground = false, showSystemUi = true,
    wallpaper = Wallpapers.NONE
)
@Composable
fun MyUiPreview() {
        MyUi()
}
@Preview(
    device = "spec:width=1280dp,height=800dp,dpi=240", showBackground = false, showSystemUi = true,
    wallpaper = Wallpapers.NONE
)
@Composable
fun MyUiTablettePreview() {
        MyUi()
}

