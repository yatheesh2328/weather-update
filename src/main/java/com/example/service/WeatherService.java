package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeatherForecast() {
        // Your weather service logic goes here
        return "Today's weather forecast is sunny!";
    }
}

