package com.KtorApp.repos

import com.KtorApp.data.model.ApiResponse
import com.KtorApp.data.model.property

interface propertyrepo {
    val theProperites :Map <Int ,List<property>>
    val page1:List<property>
    val page2:List<property>
    val page3:List<property>
    val page4:List<property>
    val page5:List<property>

    suspend fun getAllProperties(page :Int =1):ApiResponse
    suspend fun searchProperties (name :String?):ApiResponse

}