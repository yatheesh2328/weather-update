package com.example.util;

import org.springframework.stereotype.Component;

@Component
public class WeatherUtils {

    public String getWeatherCondition(String weatherForecast) {
        // Your logic to determine weather condition based on the forecast
        // For simplicity, let's assume it's sunny if the forecast contains "sunny"
        return weatherForecast.toLowerCase().contains("sunny") ? "Sunny" : "Unknown";
    }
}

