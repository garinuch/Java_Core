package project_7HW;

import java.io.IOException;

public interface WeatherModel {
    String getWeather(String selectedCiti, Period period) throws IOException;
}