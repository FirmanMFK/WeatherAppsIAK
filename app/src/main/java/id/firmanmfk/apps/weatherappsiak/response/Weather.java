package id.firmanmfk.apps.weatherappsiak.response;

/**
 * Created by Firman on 7/12/2017.
 * github.com/FirmanMFK
 * UwaCoding.github.io
 */

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * To Do List 3
 */

public class Weather {

    @SerializedName("main")
    private WeatherMain weatherMain;

    @SerializedName("weather")
    private ArrayList<WeatherItem> listWeather = new ArrayList<>();

    @SerializedName("name")
    private String city;

    public WeatherMain getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(WeatherMain weatherMain) {
        this.weatherMain = weatherMain;
    }

    public ArrayList<WeatherItem> getListWeather() {
        return listWeather;
    }

    public void setListWeather(ArrayList<WeatherItem> listWeather) {
        this.listWeather = listWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
