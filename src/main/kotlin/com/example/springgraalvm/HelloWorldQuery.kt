package com.example.springgraalvm

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class HelloWorldQuery {

    @QueryMapping
    fun hello(@Argument name: String? = null): String = if (name != null) {
        "Hello $name"
    } else {
        "Hello World"
    }
}