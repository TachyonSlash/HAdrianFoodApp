package com.pjsoft.foodapp.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.pjsoft.foodapp.R


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(15.dp)){
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier.size(50.dp),
            tint = Color(0xFFF44336)
        )
        Text("Hola, Daniel",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            modifier = Modifier
                .padding(start = 10.dp, top = 10.dp)
        )
        Spacer(modifier = Modifier.weight(1f))

        IconButton(
            onClick = {},
            modifier = Modifier.size(55.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
                modifier = Modifier.size(50.dp),
                tint = Color(0xFFF44336)
            )
        }

    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}