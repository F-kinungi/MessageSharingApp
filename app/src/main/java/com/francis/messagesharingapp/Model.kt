package com.francis.messagesharingapp




data class Hobby(val title:String)
object Suppliers{

    val hobbies = listOf<Hobby>(Hobby("Swimming"), Hobby("Dancing"), Hobby("singing"), Hobby("Reading"),
                                Hobby("Acting"),Hobby("Fishing"), Hobby("Framing"), Hobby("Drawing"),
                                Hobby("Sewing"), Hobby("Programming"), Hobby("Baking"), Hobby("Cooking"),
                                Hobby("Gamming"), Hobby("Sleeping"),Hobby("Eating"), Hobby("Walking")
    )
}