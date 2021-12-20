package HomeWork8;
import HomeWork8.entity.WeatherData;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException, SQLException;
    List<WeatherData> getAllFromDb() throws IOException, SQLException;

}
