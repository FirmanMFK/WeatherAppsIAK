package id.firmanmfk.apps.weatherappsiak;

/**
 * Created by Firman on 7/12/2017.
 * github.com/FirmanMFK
 * UwaCoding.github.io
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * To Do 1
 * Create API Service
 */
public class ApiService {

    public static String API_KEY = "09b544f3c221dc0c9db83f5467cfcacc" ;
    public static String BASE_URL = "http://api.openweathermap.org";
    public static String BASE_PATH = "/data/2.5";

    public static <T> T createService(Class<T> serviceClass) {
        final OkHttpClient okHttpClient = new OkHttpClient
                .Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Gson gson = new GsonBuilder()
                .create();

        Retrofit builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return builder.create(serviceClass);
    }
}
