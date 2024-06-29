package com.dave.nauweather.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import com.dave.nauweather.api.entity.LookUpGeoCityBean;
import com.dave.nauweather.api.entity.NowWeatherBean;
import com.dave.nauweather.request.GetRequest_Interface;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@SuppressLint("SimpleDateFormat") @SuppressWarnings("deprecation")
public class ApiManager {

	public static final String AMAP_URL = "https://restapi.amap.com/v3/weather/";

	public static final String AMAP_WEATHER_KEY = "510f3d6360e3e2335f29d43c69a4b9e2";
	//https://geoapi.qweather.com/v2/city/lookup?location=310112&key=bf24fd6ccdc94f43b97bf83ad31b41f2
	public static final String LOOKUP_URL="https://geoapi.qweather.com/v2/city/";

	public static final String GEO_BASE_URL="https://devapi.qweather.com/v7/weather/";
	public static final String GEO_WEATHER_KEY = "bf24fd6ccdc94f43b97bf83ad31b41f2";
	public static final String GEO_INDICES_URL="https://devapi.qweather.com/v7/indices/";

	public static final String URL = "https://devapi.qweather.com/v7/weather/key=yourkey&cityid=";
	public static final Gson GSON = new Gson();
	public static final String TAG = ApiManager.class.getSimpleName();
	//https://devapi.qweather.com/v7/weather/now?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
	public static final String NOW_URL="https://devapi.qweather.com/v7/weather/";
	public static final String AIR_NOW_URL="https://devapi.qweather.com/v7/air/";

	/**
	 * 是否是今天2023-06-23 16:00 合法data格式： 2023-06-23 16:00 或者2023-06-23
	 *
	 * @param date
	 * @return
	 */
	public static boolean isToday(String date) {
		if (TextUtils.isEmpty(date) || date.length() < 10) {
			// length=10
			return false;
		}
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String today = format.format(new Date());
			if (TextUtils.equals(today, date.substring(0, 10))) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
