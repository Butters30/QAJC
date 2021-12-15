package HomeWork7.project;

import HomeWork7.project.enums.Periods;


import java.io.IOException;

public interface WeatherProvider {

    void getWeatherFiveDays(Periods period) throws IOException;
    void getWeatherDay(Periods period) throws IOException;

}
