package org.example.api

import com.fasterxml.jackson.annotation.JsonProperty

data class Temperature constructor(@JsonProperty("avgtemp_f") val avgF: Double) {
}