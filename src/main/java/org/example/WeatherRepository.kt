package org.example

import org.springframework.data.repository.ListCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WeatherRepository: ListCrudRepository<WeatherInfo, Long> {
    fun findAllByCityIgnoreCase(city: String): List<WeatherInfo>
}