package HomeWork8.entity;
public class WeatherData {

    private final String city;
    private final String localDate;
    private final String dayText;
    private final String nightText;
    private final Double minTemperature;
    private final Double maxTemperature;

    public WeatherData(String city, String localDate, String dayText, String nightText, Double minTemperature, Double maxTemperature) {
        this.city = city;
        this.localDate = localDate;
        this.dayText = dayText;
        this.nightText = nightText;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getCity() {
        return city;
    }

    public String getLocalDate() {
        return localDate;

    }

    public String getDayText() {
        return dayText;
    }

    public String getNightText() {
        return nightText;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", dayText='" + dayText + '\'' +
                ", nightText='" + nightText + '\'' +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                '}';
    }
}