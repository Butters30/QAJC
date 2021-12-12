package HW6;


import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;



import java.io.IOException;

public class AccuWeather {
    private static final String HOST = "dataservice.accuweather.com";
    private static final String FORECAST = "forecasts";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    private static final String SAINT_PETERSBURG_LOCAL_KEY = "295212";
    private static final String API_KEY = "pkGCzBoEWQSjKuMEWv6pH6pAyqw8WBF2";

    public static void main(String[] args) throws IOException {
        accuWeather();
    }
public static void accuWeather() throws IOException {
    OkHttpClient client = new OkHttpClient();
    HttpUrl url = new HttpUrl.Builder()
            .scheme("http")
            .host(HOST)
            .addPathSegment(FORECAST)
            .addPathSegment(API_VERSION)
            .addPathSegment(FORECAST_TYPE)
            .addPathSegment(FORECAST_PERIOD)
            .addPathSegment(SAINT_PETERSBURG_LOCAL_KEY)
            .addQueryParameter("apikey", API_KEY)
            .addQueryParameter("language", "ru")
            .addQueryParameter("metric", "true")
            .addQueryParameter("details", "false")
            .build();

    Request requests = new Request.Builder()
            .addHeader("accept", "application/json")
            .url(url)
            .build();

    String Response = client.newCall(requests).execute().body().string();
    System.out.println(Response);
    }
}


