package com.v1.weatherapp.controller;

import com.v1.weatherapp.model.WeatherResponse;
import com.v1.weatherapp.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}
