package com.pjsoft.foodapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.pjsoft.foodapp.R
import com.pjsoft.foodapp.models.Category
import com.pjsoft.foodapp.models.categories
import com.pjsoft.foodapp.models.restaurants


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    )
    {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(top = 25.dp, start = 15.dp, end = 15.dp),)
    {
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


        Text("Nuestras categorías",
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp, bottom = 10.dp)

        )

        LazyRow (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
                items(categories) { Category ->
                    Column (
                        modifier = Modifier
                            .padding(end = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = { },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336)),
                            modifier = Modifier
                                .size(100.dp)
                        ) {
                            AsyncImage(
                                model = Category.image,
                                contentDescription = Category.name,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(CircleShape)
                            )
                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(text = Category.name)
                    }
                }
        }

        Text("Busca los mejores restaurantes",
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                modifier = Modifier
                    .padding(start = 10.dp, top = 25.dp, bottom = 10.dp)
            )

        LazyRow (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            items(restaurants) { Restaurant ->
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        Button(
                            onClick = { },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            modifier = Modifier.size(110.dp)
                        ) {
                        }
                        AsyncImage(
                            model = Restaurant.imagen,
                            contentDescription = Restaurant.nombre,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = Restaurant.nombre,
                        modifier = Modifier.offset(y = -6.dp)
                    )
                }
            }
        }

    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}