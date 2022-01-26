package project_6HW;

import java.io.IOException;

public interface WeatherModel {
    String getWeather(String selectedCiti, Period period) throws IOException;
}
