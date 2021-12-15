package HomeWork7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("WeatherText")
    private String weatherText;

    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }
    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

}