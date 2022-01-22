package project_7HW;

import java.io.IOException;

public interface WeatherModel {
    default void getWeather(String selectedCiti, Period period) throws IOException {
    }
}