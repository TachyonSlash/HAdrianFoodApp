package com.pjsoft.foodapp.models

data class Food(
    val name: String,
    val image: String,
    val rating : Double,
    val price: Double
)

val foods = listOf(
    Food("Whopper", "https://purepng.com/public/uploads/large/burger-king-whopper-with-cheese-lxz.png", 4.5, 5.99),
    Food("Chicken Fries", "https://static.vecteezy.com/system/resources/thumbnails/025/230/097/small_2x/tasty-paprika-fried-chicken-isolated-on-transparent-background-free-png.png", 4.7, 8.99),
    Food("Big Mac", "https://www.pngplay.com/wp-content/uploads/15/Mcdonalds-Big-Mac-Free-PNG.png", 4.9, 12.99),
    Food("Tacos", "https://static.vecteezy.com/system/resources/previews/047/755/758/non_2x/tacos-casserole-illustration-vegan-tacos-on-a-wooden-plate-isolated-on-a-transparent-background-png.png", 4.8, 3.99),
    Food("Five Guys Style", "https://cdn10.bostonmagazine.com/wp-content/uploads/sites/2/2018/08/burgerfeature-fries-300x300.png", 4.9, 7.99),
    Food("Fried Chicken", "https://static.vecteezy.com/system/resources/thumbnails/025/230/163/small_2x/tasty-tandoori-fried-chicken-isolated-on-transparent-background-png.png", 4.4, 6.99),
    Food("McFlurry", "https://www.pngkey.com/png/full/705-7053044_mcflurry-oreo-mcdonalds-png-mcflurry-mcdonalds.png", 4.3, 4.99),
    Food("Stacker", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.bs/files/DOUBLE_STACKER_500x540px.png", 4.9, 2.99)
)
