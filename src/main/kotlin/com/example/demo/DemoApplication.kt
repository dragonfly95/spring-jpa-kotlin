package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}


@RestController
@RequestMapping("/api/article")
class HelloController(private val repository: ArticleRepository) {

//	@RequestMapping("/test")
//	fun hello(): ResponseEntity<List<Int>> {
//		val list = listOf(1, 2, 3, 4, 5);
//		return ResponseEntity.ok().body(list)
//	}


	@GetMapping("")
	fun findAll() = repository.findAllByOrderByAddedAtDesc()

}