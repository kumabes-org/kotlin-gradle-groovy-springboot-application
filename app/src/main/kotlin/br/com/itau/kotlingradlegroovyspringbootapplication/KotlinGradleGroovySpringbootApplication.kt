package br.com.kumabe.kotlingradlegroovyspringbootapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGradleGroovySpringbootApplication

fun main(args: Array<String>) {
	runApplication<KotlinGradleGroovySpringbootApplication>(*args)
}
