package com.dave.nauweather;


import static com.dave.nauweather.api.ApiManager.AIR_NOW_URL;
import static com.dave.nauweather.api.ApiManager.GEO_BASE_URL;
import static com.dave.nauweather.api.ApiManager.GEO_INDICES_URL;
import static com.dave.nauweather.api.ApiManager.GEO_WEATHER_KEY;
import static com.dave.nauweather.api.ApiManager.LOOKUP_URL;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.dave.nauweather.api.amap.RuestAmapWeather;
import com.dave.nauweather.api.entity.AirNowBean;
import com.dave.nauweather.api.entity.HourlyForecastBean;
import com.dave.nauweather.api.entity.IndicesBean;
import com.dave.nauweather.api.entity.LookUpGeoCityBean;
import com.dave.nauweather.api.amap.AmapWeatherBean;
import com.dave.nauweather.api.entity.NowWeatherBean;
import com.dave.nauweather.request.GetRequest_Interface;
import com.dave.nauweather.widget.HourlyForecastView;
import com.qweather.sdk.view.HeConfig;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends Activity {
	private  Context mContext;
	public AMapLocationClient mLocationClient = null;
	private static final String TAG = "MainActivity";
	TextView mTvLookCity;
	TextView mTvNowTemp;
	TextView mTvNowCondText;
	TextView mTvAirPm25Text;
	TextView mTvAirPm10Text;
	TextView mTvAirSO2Text;
	TextView mTvAirNO2Text;
	TextView mTvIndicesSuggestBrefText;
	TextView mTvIndicesSuggestText;
	TextView mTvIndicesSuggestDrsgBrfText;
	TextView mTvIndicesSuggestDrsgText;
	TextView mTvIndicesSuggestUvBrfText;
	TextView mTvIndicesSuggestUvText;
	TextView mTvIndicesSuggestSportBrfText;
	TextView mTvIndicesSuggestSportText;
	TextView mTvIndicesSuggestFluBrfText;
	TextView mTvIndicesSuggestFluText;
	TextView mTvIndicesSuggestTarvBrfText;
	TextView mTvIndicesSuggestTarvText;
	TextView mTvIndicesSuggestCwBrfText;
	TextView mTvIndicesSuggestCwText;
	TextView mTvTodayTempText;
	TextView mTvTodayFeelsLikeText;
	TextView mTvTodayHumText;
	TextView mTvTodayVisText;
	TextView mTvTodayPrecipText;
	HourlyForecastView mHourlyForecastView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Android 6.0动态请求权限
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE
					, Manifest.permission.READ_EXTERNAL_STORAGE
					,Manifest.permission.ACCESS_FINE_LOCATION
					, Manifest.permission.ACCESS_COARSE_LOCATION};
			for (String str : permissions) {
				if (checkSelfPermission(str) != PackageManager.PERMISSION_GRANTED) {
					requestPermissions(permissions, 111);
					break;
				}
			}
		}
		setContentView(R.layout.fragment_weather);
		mContext = this;
		initView();
		initAMap();


		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public static Typeface typeface;

	public static Typeface getTypeface(Context context) {
		return typeface;
	}
	private void initView() {

		mTvLookCity = findViewById(R.id.w_look_city);
		mTvNowTemp = findViewById(R.id.w_now_tmp);
		mTvNowCondText = findViewById(R.id.w_now_cond_text);
		mTvAirPm25Text = findViewById(R.id.w_aqi_pm25);
		mTvAirPm10Text = findViewById(R.id.w_aqi_pm10);
		mTvAirSO2Text = findViewById(R.id.w_aqi_so2);
		mTvAirNO2Text = findViewById(R.id.w_aqi_no2);

		mTvIndicesSuggestBrefText = findViewById(R.id.w_suggestion_comf_brf);
		mTvIndicesSuggestText = findViewById(R.id.w_suggestion_comf);
		mTvIndicesSuggestDrsgBrfText = findViewById(R.id.w_suggestion_drsg_brf);
		mTvIndicesSuggestDrsgText = findViewById(R.id.w_suggestion_drsg);
		mTvIndicesSuggestUvBrfText = findViewById(R.id.w_suggestion_uv_brf);
		mTvIndicesSuggestUvText = findViewById(R.id.w_suggestion_uv);
		mTvIndicesSuggestSportBrfText = findViewById(R.id.w_suggestion_sport_brf);
		mTvIndicesSuggestSportText = findViewById(R.id.w_suggestion_sport);
		mTvIndicesSuggestFluBrfText = findViewById(R.id.w_suggestion_flu_brf);
		mTvIndicesSuggestFluText = findViewById(R.id.w_suggestion_flu);
		mTvIndicesSuggestTarvBrfText = findViewById(R.id.w_suggestion_tarv_brf);
		mTvIndicesSuggestTarvText = findViewById(R.id.w_suggestion_tarv);
		mTvIndicesSuggestCwBrfText = findViewById(R.id.w_suggestion_cw_brf);
		mTvIndicesSuggestCwText = findViewById(R.id.w_suggestion_cw);
		mTvTodayTempText = findViewById(R.id.w_todaydetail_temp);
		mTvTodayFeelsLikeText = findViewById(R.id.w_now_fl);
		mTvTodayHumText = findViewById(R.id.w_now_hum);
		mTvTodayVisText = findViewById(R.id.w_now_vis);
		mTvTodayPrecipText = findViewById(R.id.w_now_pcpn);
		mHourlyForecastView = findViewById(R.id.w_hourlyForecastView);
	}

	private void initAMap() {
		try {
			AMapLocationClient.updatePrivacyShow(mContext,true,true);
			AMapLocationClient.updatePrivacyAgree(mContext,true);
			mLocationClient = new AMapLocationClient(getApplicationContext());
			//设置定位回调监听
			mLocationClient.setLocationListener(mLocationListener);
			//启动定位
			mLocationClient.startLocation();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		HeConfig.init("HE2405221750191689", "d6f5da40e0fc40c386bf20e367a35aa5");

	}
	//异步获取定位结果
	AMapLocationListener mLocationListener = new AMapLocationListener(){
		@Override
		public void onLocationChanged(AMapLocation amapLocation) {
			if (amapLocation != null) {
				Log.d(TAG, "onLocationChanged amapLocation=" + amapLocation.toString()
						+",getErrorCode="+amapLocation.getErrorCode()
						);
				if (amapLocation.getErrorCode() == 0) {

					//解析定位结果
					Log.d(TAG,"onLocationChanged 停止定位");
					mLocationClient.stopLocation();
					//高德地图的天气
					//RuestAmapWeather.requestAmapTest(amapLocation);
					requestGeoLoopUpCityApi(amapLocation);

				}else if(amapLocation.getErrorCode() == 12){
					initAMap();
				}
			}
		}
	};

	private void requestGeoLoopUpCityApi(AMapLocation amapLocation) {
		Log.d(TAG,"requestGeoNowApi onLocationChanged amapLocation.getAdCode()="+amapLocation.getAdCode()
				+",getProvince="+amapLocation.getProvince());

		//步骤4:创建Retrofit对象
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(LOOKUP_URL) // 设置 网络请求 Url
				.addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
				.build();
		// 步骤5:创建 网络请求接口 的实例
		final GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
		//对 发送请求 进行封装
		Call<LookUpGeoCityBean> call = request.getGeoLoopUpCityData(amapLocation.getAdCode(),GEO_WEATHER_KEY);
		//步骤6:发送网络请求(异步)
		call.enqueue(new Callback<LookUpGeoCityBean>() {
			//请求成功时回调
			@Override
			public void onResponse(Call<LookUpGeoCityBean> call, Response<LookUpGeoCityBean> response) {
				// 步骤7：处理返回的数据结果
				Log.d(TAG,"requestGeoNowApi onLocationChanged info="+response.body().code
				+",name="+response.body().location.get(0).name
				+",getId="+response.body().location.get(0).id);
				mTvLookCity.setText(response.body().location.get(0).adm1+","
				+response.body().location.get(0).name);
				requestNowWeather(response.body());
				request24HWeather(response.body());
				requestAirNowWeather(response.body());
				requestIndices1DayWeather(response.body());
			}
			//请求失败时回调
			@Override
			public void onFailure(Call<LookUpGeoCityBean> call, Throwable throwable) {
				Log.d(TAG,"requestGeoNowApi onLocationChanged 连接失败=");
			}
		});

	}

	private void request24HWeather(LookUpGeoCityBean body) {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(GEO_BASE_URL) // 设置 网络请求 Url
				.addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
				.build();
		// 步骤5:创建 网络请求接口 的实例
		GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
		//对 发送请求 进行封装
		Call<HourlyForecastBean> call = request.getGeo24HourWeatherData(body.location.get(0).id,GEO_WEATHER_KEY);
		//步骤6:发送网络请求(异步)
		call.enqueue(new Callback<HourlyForecastBean>() {
			//请求成功时回调
			@Override
			public void onResponse(Call<HourlyForecastBean> call, Response<HourlyForecastBean> response) {
				// 步骤7：处理返回的数据结果
				Log.d(TAG,"request24HWeather onLocationChanged info="+response.body().code
						+",updateTime="+response.body().updateTime
						+",text="+response.body().hourly.get(0).text);
				//mHourlyForecastView = new HourlyForecastView(mContext);
				mHourlyForecastView.setData(response.body());
			}

			//请求失败时回调
			@Override
			public void onFailure(Call<HourlyForecastBean> call, Throwable throwable) {
				Log.d(TAG,"request24HWeather onLocationChanged 连接失败=");
			}
		});
	}

	private void requestIndices1DayWeather(LookUpGeoCityBean body) {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(GEO_INDICES_URL) // 设置 网络请求 Url
				.addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
				.build();
		// 步骤5:创建 网络请求接口 的实例
		final GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
		//对 发送请求 进行封装
		Call<IndicesBean> call = request.getGeoIndices1DayWeatherData("0",body.location.get(0).id,GEO_WEATHER_KEY);
		//步骤6:发送网络请求(异步)
		call.enqueue(new Callback<IndicesBean>() {
			//请求成功时回调
			@Override
			public void onResponse(Call<IndicesBean> call, Response<IndicesBean> response) {
				// 步骤7：处理返回的数据结果
				Log.d(TAG,"requestIndices1DayWeather onLocationChanged info="+response.body().code);
				mTvIndicesSuggestBrefText.setText(response.body().daily.get(7).category);
				mTvIndicesSuggestText.setText(response.body().daily.get(7).text);
				mTvIndicesSuggestDrsgBrfText.setText(response.body().daily.get(2).category);
				mTvIndicesSuggestDrsgText.setText(response.body().daily.get(2).text);
				mTvIndicesSuggestUvBrfText.setText(response.body().daily.get(4).category);
				mTvIndicesSuggestUvText.setText(response.body().daily.get(4).text);
				mTvIndicesSuggestSportBrfText.setText(response.body().daily.get(0).category);
				mTvIndicesSuggestSportText.setText(response.body().daily.get(0).text);
				mTvIndicesSuggestFluBrfText.setText(response.body().daily.get(8).category);
				mTvIndicesSuggestFluText.setText(response.body().daily.get(8).text);
				mTvIndicesSuggestTarvBrfText.setText(response.body().daily.get(5).category);
				mTvIndicesSuggestTarvText.setText(response.body().daily.get(5).text);
				mTvIndicesSuggestCwBrfText.setText(response.body().daily.get(1).category);
				mTvIndicesSuggestCwText.setText(response.body().daily.get(1).text);



			}

			//请求失败时回调
			@Override
			public void onFailure(Call<IndicesBean> call, Throwable throwable) {
				Log.d(TAG,"requestIndices1DayWeather onLocationChanged 连接失败=");
			}
		});
	}

	private void requestAirNowWeather(LookUpGeoCityBean body) {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(AIR_NOW_URL) // 设置 网络请求 Url
				.addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
				.build();
		// 步骤5:创建 网络请求接口 的实例
		final GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
		//对 发送请求 进行封装
		Call<AirNowBean> call = request.getGeoAirNowWeatherData(body.location.get(0).id,GEO_WEATHER_KEY);
		//步骤6:发送网络请求(异步)
		call.enqueue(new Callback<AirNowBean>() {
			//请求成功时回调
			@Override
			public void onResponse(Call<AirNowBean> call, Response<AirNowBean> response) {
				// 步骤7：处理返回的数据结果
				Log.d(TAG,"requestAirNowWeather onLocationChanged info="+response.body().code
						+",pm2p5="+response.body().now.pm2p5);
				mTvAirPm25Text.setText(response.body().now.pm2p5+"μg/m³");
				mTvAirPm10Text.setText(response.body().now.pm10+"μg/m³");
				mTvAirSO2Text.setText(response.body().now.so2+"μg/m³");
				mTvAirNO2Text.setText(response.body().now.no2+"μg/m³");


			}

			//请求失败时回调
			@Override
			public void onFailure(Call<AirNowBean> call, Throwable throwable) {
				Log.d(TAG,"requestAirNowWeather onLocationChanged 连接失败=");
			}
		});
	}

	private void requestNowWeather(LookUpGeoCityBean body) {
		//步骤4:创建Retrofit对象
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(GEO_BASE_URL) // 设置 网络请求 Url
				.addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
				.build();
		// 步骤5:创建 网络请求接口 的实例
		GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
		//对 发送请求 进行封装
		Call<NowWeatherBean> call = request.getGeoNowWeatherData(body.location.get(0).id,GEO_WEATHER_KEY);
		//步骤6:发送网络请求(异步)
		call.enqueue(new Callback<NowWeatherBean>() {
			//请求成功时回调
			@Override
			public void onResponse(Call<NowWeatherBean> call, Response<NowWeatherBean> response) {
				// 步骤7：处理返回的数据结果
				Log.d(TAG,"requestNowWeather onLocationChanged info="+response.body().code
						+",temp="+response.body().now.temp
						+",text="+response.body().now.text);
				mTvNowTemp.setText(response.body().now.temp);
				mTvNowCondText.setText(response.body().now.text);
				mTvTodayTempText.setText(response.body().now.temp+"°");
				mTvTodayFeelsLikeText.setText(response.body().now.feelsLike+"°");
				mTvTodayHumText.setText(response.body().now.humidity+"%");
				mTvTodayVisText.setText(response.body().now.vis+"KM");
				mTvTodayPrecipText.setText(response.body().now.precip+"mm");



			}

			//请求失败时回调
			@Override
			public void onFailure(Call<NowWeatherBean> call, Throwable throwable) {
				Log.d(TAG,"requestNowWeather onLocationChanged 连接失败=");
			}
		});

	}


	@Override
	protected void onStart() {
		super.onStart();
		//initAMap();
	}

	@Override
	protected void onResume() {
		super.onResume();

		//weatherView.onResume();
	}
	@Override
	protected void onPause() {
		super.onPause();
		//weatherView.onPause();
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		//weatherView.onDestroy();
	}

    public void openSettings(View view) {
		Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);
	}
}
