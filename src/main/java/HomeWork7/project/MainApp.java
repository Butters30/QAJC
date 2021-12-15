package HomeWork7.project;



import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args){
//        String jsonString = "{ }";
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        WeatherResponse car = objectMapper.readValue(jsonString, WeatherResponse.class);
//        System.out.println(car);

        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();
    }

}

//Temperature":{"Metric":{"Value":-1.1,"Unit":"C","UnitType":17
//        "LocalObservationDateTime":"2021-12-12T02:42:00+02:00"
//"WeatherText":"Mostly cloudy"
//[{"LocalObservationDateTime":"2021-12-12T06:08:00+02:00","EpochTime":1639282080,"WeatherText":"Mostly cloudy","WeatherIcon":38,"HasPrecipitation":false,"PrecipitationType":null,"IsDayTime":false,"Temperature":{"Metric":{"Value":-1.1,"Unit":"C","UnitType":17},"Imperial":{"Value":30.0,"Unit":"F","UnitType":18}},"MobileLink":"http://www.accuweather.com/en/ru/kaliningrad/292922/current-weather/292922?lang=en-us","Link":"http://www.accuweather.com/en/ru/kaliningrad/292922/current-weather/292922?lang=en-us"}]