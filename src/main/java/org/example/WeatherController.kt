package org.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/weather")
class WeatherController constructor(val service: WeatherService) {

    @GetMapping
    fun getAll(): List<WeatherInfo> {
        return service.getAll()
    }

    @GetMapping("/city/{city}")
    fun getForCity(@PathVariable city: String): List<WeatherInfo> {
        return service.getForCity(city)
    }
}