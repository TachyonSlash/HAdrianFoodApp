package com.pjsoft.foodapp.models

data class Restaurant(
    val nombre : String,
    val imagen : String
)

val restaurants = listOf(
    Restaurant("Burger King", "https://i.pinimg.com/736x/ca/38/ca/ca38cabfc7f07d97a422859b91df07cd.jpg"),
    Restaurant("McDonald's", "https://hipfonts.com/wp-content/uploads/2022/08/McDonalds-logo-cover.jpg"),
    Restaurant("KFC", "https://toppng.com/uploads/preview/kfc-logo-11563249058wxuvh8kia1.png"),
    Restaurant("Domino's Pizza", "https://logos-world.net/wp-content/uploads/2021/08/Dominos-Logo.png"),
    Restaurant("Subway", "https://emea.newsroom.subway.com/image/Subway+Choicemark_thumbnail.png"),
    Restaurant("Pizza Hut", "https://logos-world.net/wp-content/uploads/2021/10/Pizza-Hut-Symbol.png"),
    Restaurant("Starbucks", "https://static.vecteezy.com/system/resources/previews/022/636/379/non_2x/starbucks-logo-starbucks-icon-transparent-free-png.png"),
    Restaurant("Dunkin' Donuts", "https://logos-world.net/wp-content/uploads/2020/12/Dunkin-Emblem.png"),
    Restaurant("Five Guys", "https://i.redd.it/five-guys-rebrand-concept-i-made-constructive-criticism-v0-2w8whccvr70b1.png?width=2500&format=png&auto=webp&s=83649ce85b0878ed08182b067396c7358e0d80ee")
)
