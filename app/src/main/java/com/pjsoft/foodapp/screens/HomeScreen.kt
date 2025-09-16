package com.pjsoft.foodapp.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import com.pjsoft.foodapp.R
import com.pjsoft.foodapp.models.Category
import com.pjsoft.foodapp.models.Food
import com.pjsoft.foodapp.models.categories
import com.pjsoft.foodapp.models.foods
import com.pjsoft.foodapp.models.restaurants


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top = 25.dp, start = 15.dp, end = 15.dp),
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(50.dp),
                tint = Color(0xFFF44336)
            )
            Text(
                "Hola, Daniel",
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
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
        Text(
            "Nuestras categorías",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp, bottom = 10.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            items(categories) { Category ->
                Column(
                    modifier = Modifier
                        .padding(end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { },
                        shape = CircleShape,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336)),
                        modifier = Modifier
                            .size(70.dp)
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

        Text(
            "Busca los mejores restaurantes",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp, bottom = 10.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            items(restaurants) { Restaurant ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        Button(
                            onClick = { },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                            modifier = Modifier.size(80.dp)
                        ) {
                        }
                        AsyncImage(
                            model = Restaurant.imagen,
                            contentDescription = Restaurant.nombre,
                            modifier = Modifier
                                .size(70.dp)
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

        Text(
            "Nuestras mejores comidas",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp, bottom = 10.dp)
        )

        @OptIn(ExperimentalFoundationApi::class)
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            items(foods) { food ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(bottom = 10.dp, end = 25.dp)
                ) {
                    Box(contentAlignment = Alignment.BottomEnd) {
                        AsyncImage(
                            model = food.image,
                            contentDescription = food.name,
                            modifier = Modifier
                                .width(110.dp)
                                .height(80.dp)
                                .clip(RectangleShape),
                            contentScale = ContentScale.Crop
                        )
                        Button(
                            onClick = {},
                            shape = MaterialTheme.shapes.medium,
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336)),
                            modifier = Modifier
                                .offset(x = (25).dp)
                                .height(40.dp)
                        ) {
                            Text(
                                text = "$${food.price}",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(0xFF4CAF50),
                            modifier = Modifier.size(20.dp)
                        )
                        Text(
                            text = "${food.rating} ${food.name}",
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
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