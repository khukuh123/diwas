package komeeko

import io.ktor.application.*
import komeeko.plugins.configureMonitoring
import komeeko.plugins.configureRouting
import komeeko.plugins.configureSerialization

fun main(args: Array<String>) {
    /*embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureMonitoring()
        configureHTTP()
        configureSecurity()
    }.start(wait = true)*/

    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module(testing: Boolean = false) {
    configureRouting()
    configureSerialization()
    configureMonitoring()
//    configureHTTP()
//    configureSecurity()
}