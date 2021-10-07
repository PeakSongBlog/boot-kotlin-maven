package com.peaksong.boot.kotlin.maven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootKotlinMavenApplication

fun main(args: Array<String>) {
    runApplication<BootKotlinMavenApplication>(*args)
}
