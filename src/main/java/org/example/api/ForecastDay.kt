package org.example.api

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate

data class ForecastDay constructor(val date: LocalDate, @JsonProperty("day") val temperature: Temperature){
}