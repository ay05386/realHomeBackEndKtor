package com.KtorApp.Routes

import com.KtorApp.repos.propertyrepo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchProperty(){
    val thepropertyrep :propertyrepo by inject()

    get("/RealHomes/Properites/search"){
        val name = call.request.queryParameters["title"]
        val apiResponse = thepropertyrep.searchProperties(name = name)
        call.respond(message = apiResponse,
            status = HttpStatusCode.OK)
    }

}