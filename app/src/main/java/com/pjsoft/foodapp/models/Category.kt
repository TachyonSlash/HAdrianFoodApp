package com.pjsoft.foodapp.models

data class Category(
val name: String,
val image: String
)

val categories = listOf(
    Category("Fast Food", "https://static.vecteezy.com/system/resources/previews/019/607/567/non_2x/fast-food-vector-clipart-design-graphic-clipart-design-free-png.png"),
    Category("Chinese", "https://images.vexels.com/media/users/3/249444/isolated/preview/add4b0e3208bbb48e338b0a930353572-asian-food-noodles-soup.png"),
    Category("Italian", "https://static.vecteezy.com/system/resources/previews/013/392/102/non_2x/pizza-italian-food-png.png"),
    Category("Mexican", "https://images.vexels.com/media/users/3/181353/isolated/preview/1f0da6687abc94f096fef731e614292f-mexico-food-color-illustration.png"),
    Category("Japanese", "https://icons.veryicon.com/png/o/food--drinks/daily-use-book-stickers/rice-group-onigiri.png"),
    Category("Indian", "https://static.vecteezy.com/system/resources/previews/024/406/041/non_2x/indian-food-traditional-icon-isolated-png.png"),
    Category("Healthy", "https://i.redd.it/best-foods-in-xenoblade-v0-7t2tib9wtlz91.png?width=1203&format=png&auto=webp&s=962c8bb8527420616d866e307469976e29f28596"),
    Category("Desserts", "https://icons.veryicon.com/png/o/food--drinks/yoga-flat-icon/healthy-food.png")
)
