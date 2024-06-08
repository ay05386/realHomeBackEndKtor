package com.KtorApp.data.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.util.Collections.emptyList
@Serializable
data class ApiResponse(
    val success:Boolean,
    val message : String?=null,
    val nextpage:Int?=null,
    val prevpage:Int?=null,
    val properties:List<Property> = emptyList()
)


