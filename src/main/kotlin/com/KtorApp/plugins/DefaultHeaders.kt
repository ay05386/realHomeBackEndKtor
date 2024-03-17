package com.KtorApp.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import io.netty.handler.codec.DefaultHeaders
import io.netty.handler.codec.DefaultHeadersImpl
import kotlin.time.Duration

fun Application.configureDefaultHeader(){
install(DefaultHeaders){
 val oneYearInSeconds = Duration.INFINITE.inWholeSeconds
    header(name = HttpHeaders.CacheControl,"public,max age = $oneYearInSeconds")
}
}
