package org.example.api

import com.fasterxml.jackson.annotation.JsonProperty

data class Forecast constructor(@JsonProperty("forecastday") var days: List<ForecastDay>){
}