package com.KtorApp.plugins

import com.KtorApp.di.KoinModule
import io.ktor.server.application.*
import io.netty.util.internal.logging.Slf4JLoggerFactory
import org.koin.core.Koin
import org.koin.ktor.plugin.Koin
import org.koin.ktor.plugin.koin
import org.slf4j.spi.SLF4JServiceProvider

fun Application.configureKoin(){
    install(Koin){
        Slf4JLoggerFactory()
        modules(KoinModule)
    }
}