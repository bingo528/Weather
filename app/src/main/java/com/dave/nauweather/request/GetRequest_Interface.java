package com.dave.nauweather.request;

import com.dave.nauweather.api.amap.AmapWeatherBean;
import com.dave.nauweather.api.entity.AirNowBean;
import com.dave.nauweather.api.entity.HourlyForecastBean;
import com.dave.nauweather.api.entity.IndicesBean;
import com.dave.nauweather.api.entity.LookUpGeoCityBean;
import com.dave.nauweather.api.entity.NowWeatherBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.POST;

public interface GetRequest_Interface {
    //https://restapi.amap.com/v3/weather/weatherInfo?key=510f3d6360e3e2335f29d43c69a4b9e2&city=310000
    @GET("weatherInfo?")
    Call<AmapWeatherBean> getWeatherData(@Query("key") String key, @Query("city") String city);
    //https://geoapi.qweather.com/v2/city/lookup?location=shangh&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    //https://geoapi.qweather.com/v2/city/lookup?location=310112&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    @GET("lookup?")
    Call<LookUpGeoCityBean> getGeoLoopUpCityData(@Query("location") String location, @Query("key") String key);

    //https://devapi.qweather.com/v7/weather/now?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    @GET("now?")
    Call<NowWeatherBean> getGeoNowWeatherData(@Query("location") String location, @Query("key") String key);
    //https://devapi.qweather.com/v7/weather/24h?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    @GET("24h?")
    Call<HourlyForecastBean> getGeo24HourWeatherData(@Query("location") String location, @Query("key") String key);
    //https://devapi.qweather.com/v7/air/now?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    @GET("now?")
    Call<AirNowBean> getGeoAirNowWeatherData(@Query("location") String location, @Query("key") String key);
    //https://devapi.qweather.com/v7/indices/1d?type=0&location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    @GET("1d?")
    Call<IndicesBean> getGeoIndices1DayWeatherData(@Query("type") String type, @Query("location") String location, @Query("key") String key);
}
