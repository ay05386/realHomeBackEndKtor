package com.KtorApp.plugins

import com.KtorApp.Routes.getAllProperites
import com.KtorApp.Routes.root
import com.KtorApp.Routes.searchProperty
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

root()
        getAllProperites()
        searchProperty()
// look at the random rabbit function in the video
 static ("/images"){
     resources("images")
 }
        }
        }


