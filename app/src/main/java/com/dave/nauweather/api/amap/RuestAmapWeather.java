package com.dave.nauweather.api.amap;

import static com.dave.nauweather.api.ApiManager.AMAP_URL;
import static com.dave.nauweather.api.ApiManager.AMAP_WEATHER_KEY;

import android.util.Log;

import com.amap.api.location.AMapLocation;
import com.dave.nauweather.request.GetRequest_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RuestAmapWeather {
    private static final String TAG = "RuestAmapWeather";
    public static void requestAmapTest(AMapLocation amapLocation) {
        Log.d(TAG,"requestAmap onLocationChanged amapLocation.getAdCode()="+amapLocation.getAdCode()
                +",getProvince="+amapLocation.getProvince());

        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AMAP_URL) // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();

        // 步骤5:创建 网络请求接口 的实例
        final GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);

        //对 发送请求 进行封装
        Call<AmapWeatherBean> call = request.getWeatherData(AMAP_WEATHER_KEY,amapLocation.getAdCode());
        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<AmapWeatherBean>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<AmapWeatherBean> call, Response<AmapWeatherBean> response) {
                // 步骤7：处理返回的数据结果
                Log.d(TAG,"requestAmap onLocationChanged info="+response.body().getInfo());
                response.body().show();


            }

            //请求失败时回调
            @Override
            public void onFailure(Call<AmapWeatherBean> call, Throwable throwable) {
                Log.d(TAG,"requestAmap onLocationChanged 连接失败=");
                System.out.println("连接失败");
            }
        });
    }
}
