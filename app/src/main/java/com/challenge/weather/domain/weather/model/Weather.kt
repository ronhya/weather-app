package com.challenge.weather.domain.weather.model

data class Weather(
    val country: String,
    val city: String,
    val date: Long,
    val icon: String,
    val description: String,
    val temperature: Double,
    val temperatureMax: Double,
    val windSpeed: Double,
    val humidity: Double
)