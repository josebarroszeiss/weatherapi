package org.example.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class WeatherAPIClient constructor(var http: RestTemplate,
                                   @Value("\${weatherapi.host}") var host: String,
                                   @Value("\${weatherapi.api-key}") var apiKey: String){

    fun getWeather(city: String): WeatherAPIResponse? {
        return http.getForObject("$host/v1/forecast.json?key=$apiKey&q=$city&days=7",
        WeatherAPIResponse::class.java)
    }
}