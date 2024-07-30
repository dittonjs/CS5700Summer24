package org.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File

fun main() {
    embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText(File("index.html").readText(), ContentType.Text.Html)
            }

            post("/data"){
                val data = call.receiveText()
                println(data)
                call.respondText { "Nice!" }
            }
        }
    }.start(wait = true)
}