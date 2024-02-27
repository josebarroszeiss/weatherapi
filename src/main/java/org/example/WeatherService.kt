package org.example

import org.example.api.WeatherAPIClient
import org.springframework.stereotype.Service

@Service
class WeatherService constructor(val repository: WeatherRepository, val api: WeatherAPIClient){

    fun getAll(): List<WeatherInfo> {
        return repository.findAll();
    }

    fun getForCity(city: String?): List<WeatherInfo> {
        val weatherForCity = repository.findAllByCityIgnoreCase(city!!)
        if (weatherForCity.isNotEmpty()) {
            return weatherForCity
        }
        val apiResponse = api.getWeather(city)
        return repository.saveAll(apiResponse?.toWeatherInfoList() ?: listOf())
    }
}