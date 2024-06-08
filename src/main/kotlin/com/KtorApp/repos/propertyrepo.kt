package com.KtorApp.repos

import com.KtorApp.data.model.ApiResponse
import com.KtorApp.data.model.Property

interface propertyrepo {
    val theProperites :Map <Int ,List<Property>>
    val page1:List<Property>
    val page2:List<Property>
    val page3:List<Property>
    val page4:List<Property>
    val page5:List<Property>

    suspend fun getAllProperties(page :Int =1):ApiResponse
    suspend fun searchProperties (name :String?):ApiResponse

}