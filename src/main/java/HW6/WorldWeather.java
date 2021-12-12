package HW6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class WorldWeather {
    private static final String HOST_2 = "api.weatherapi.com";
    private static final String API_VERSION_2 = "v1";
    private static final String FORECAST_3 = "forecast.json";


    public static void main(String[] args) throws IOException{
worldWeather();
    }
    public static void worldWeather() throws IOException {
        OkHttpClient client2 = new OkHttpClient();
    HttpUrl url2 = new HttpUrl.Builder()
            .scheme("http")
            .host(HOST_2)
            .addPathSegment(API_VERSION_2)
            .addPathSegment(FORECAST_3)
            .addQueryParameter("key", "3db9ab674bdb44b9961234753211112")
            .addQueryParameter("q","Kaliningrad")
            .addQueryParameter("days","5")
            .addQueryParameter("aqi","no")
            .addQueryParameter("alerts","no")
            .build();
        Request request2 = new Request.Builder()
                .addHeader("accept","application/json")
                .url(url2)
                .build();
        String Response = client2.newCall(request2).execute().body().string();
        System.out.println(Response);

    }
}
