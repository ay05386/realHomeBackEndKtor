package com.KtorApp.data.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class Property(
    val id:Int,
    val title :String,
    val price: Int,
    val Description :String,
    val type : String,
    val bedrooms :Int,
    val bathrooms:Int,
    val image:String,
    val rating:Double
)
