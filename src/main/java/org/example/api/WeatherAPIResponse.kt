package org.example.api

import org.example.WeatherInfo

data class WeatherAPIResponse constructor(val location: Location, val forecast: Forecast){
    fun toWeatherInfoList(): List<WeatherInfo> {
        val region = location.region
        val country = location.country
        val city = location.city
        return forecast.days.map { f ->
            val temp = f.temperature.avgF
            WeatherInfo(
                null,  // id is null because this will be a new entity
                region,
                country,
                "",
                city,
                f.date,
                "$temp F"
            )
        }.toList()
    }
}