package com.example.graphqlexample.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SubscriptionMapping

import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux;
import java.time.Duration


@Controller
class BookController {

    @QueryMapping
    fun books(): Iterable<String>? {
        return listOf<String>("Books","two")
    }

    @QueryMapping
    fun book(@Argument id: String): String? {
        return "Book 222 "
    }

    @SubscriptionMapping("bookchange")
    fun bookchange2(): Flux<Long> {
        return Flux.interval(Duration.ofSeconds(5))
    .map { tick -> tick + 1 }
    }

}