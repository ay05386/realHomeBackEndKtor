package com.KtorApp.Routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
private const val BASE_URL = "http://192.168.1.4:8080"

fun Route.root(){
    get ("/"){
        call.respond(message = "Welcome to RealHome",
            status =HttpStatusCode.OK)
    }
}