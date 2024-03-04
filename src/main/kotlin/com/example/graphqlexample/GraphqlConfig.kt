package com.example.graphqlexample.config 

import graphql.scalars.ExtendedScalars
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import graphql.schema.idl.RuntimeWiring
import org.springframework.graphql.execution.*


@Configuration
class GraphQLConfig {


@Bean 
fun runtimeWiringConfigurer(): RuntimeWiringConfigurer { 
   return RuntimeWiringConfigurer { 
    wiringBuilder: RuntimeWiring.Builder -> 
    wiringBuilder
    .scalar(ExtendedScalars.GraphQLLong)
   } 
}

}
