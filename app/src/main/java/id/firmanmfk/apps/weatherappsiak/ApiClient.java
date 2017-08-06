package id.firmanmfk.apps.weatherappsiak;

import id.firmanmfk.apps.weatherappsiak.response.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Firman on 7/12/2017.
 * github.com/FirmanMFK
 * UwaCoding.github.io
 */

/**
 * To Do 5
 */

public interface ApiClient {
    @GET("/data/2.5/weather")
    Call<Weather> getWeather(@Query("q") String q,
                             @Query("appid") String appId);
}
