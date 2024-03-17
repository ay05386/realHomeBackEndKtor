package com.KtorApp.data.model

import kotlinx.serialization.Serializable

@Serializable
data class property(
    val id : Int,
    val title :String,
    val price: Int,
    val Description :String,
    val type : String,
    val bedrooms :Int,
    val bathrooms:Int,
    val image:String
)
