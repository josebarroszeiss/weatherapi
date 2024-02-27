package org.example

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDate


@Entity
data class WeatherInfo constructor(@Id
                              @GeneratedValue
                              val id: Long? = null,
                              val region: String? = null,
                              val country: String? = null,
                              val state: String? = null,
                              val city: String? = null,
                              val localDate: LocalDate? = null,
                              val avgTemperature: String? = null){
}