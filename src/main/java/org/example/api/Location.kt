package org.example.api

import com.fasterxml.jackson.annotation.JsonProperty

data class Location constructor(@JsonProperty("name") val city: String, val region: String, val country: String){
}