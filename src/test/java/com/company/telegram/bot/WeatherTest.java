package com.company.telegram.bot;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class WeatherTest {
    Weather weather = new Weather();

    @Test
    public void weatherTest() throws IOException {
        Model model = new Model();

        assertTrue(weather.getWeather("Казань", model).contains("Kazan"));
        assertTrue(weather.getWeather("Москва", model).contains("Moscow"));
    }
}
