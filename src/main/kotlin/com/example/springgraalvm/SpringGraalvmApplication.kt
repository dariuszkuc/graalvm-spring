package com.example.springgraalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringGraalvmApplication

fun main(args: Array<String>) {
	runApplication<SpringGraalvmApplication>(*args)
}
