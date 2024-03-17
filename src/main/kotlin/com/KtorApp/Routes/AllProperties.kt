package com.KtorApp.Routes

import com.KtorApp.data.model.ApiResponse
import com.KtorApp.repos.propertyrepo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.netty.handler.codec.http.HttpResponseStatus
import org.koin.ktor.ext.inject


fun Route.getAllProperites(){
    val propertyrepo :propertyrepo by inject()
    get("/RealHomes/Properites"){
   try {
       val page = call.request.queryParameters["page"]?.toInt()?:1

       require(page in 1..5)
       val apiResponse =propertyrepo.getAllProperties(page = page)
       call.respond(message = apiResponse,
           status = HttpStatusCode.OK)
   }catch (e:NumberFormatException){
       call.respond(message = ApiResponse(success = false, message = "Only numbers allowed"),
           status = HttpStatusCode.BadRequest
       )

   }catch (e: IllegalArgumentException){
       call.respond(message = ApiResponse(success = false, message = "Property not found"),
           status = HttpStatusCode.BadRequest)
   }

    }
}