package com.dave.nauweather.api.entity;

import java.util.List;

public class NowWeatherBean {


    /**
     * code : 200
     * updateTime : 2024-06-17T19:03+08:00
     * fxLink : https://www.qweather.com/weather/beijing-101010100.html
     * now : {"obsTime":"2024-06-17T19:00+08:00","temp":"34","feelsLike":"33","icon":"100","text":"晴","wind360":"213","windDir":"西南风","windScale":"2","windSpeed":"9","humidity":"24","precip":"0.0","pressure":"996","vis":"23","cloud":"3","dew":"11"}
     * refer : {"sources":["QWeather"],"license":["CC BY-SA 4.0"]}
     */

    public String code;
    public String updateTime;
    public String fxLink;
    public NowBean now;
    public ReferBean refer;

    public static class NowBean {
        /**
         * obsTime : 2024-06-17T19:00+08:00
         * temp : 34
         * feelsLike : 33
         * icon : 100
         * text : 晴
         * wind360 : 213
         * windDir : 西南风
         * windScale : 2
         * windSpeed : 9
         * humidity : 24
         * precip : 0.0
         * pressure : 996
         * vis : 23
         * cloud : 3
         * dew : 11
         */

        public String obsTime;
        public String temp;
        public String feelsLike;
        public String icon;
        public String text;
        public String wind360;
        public String windDir;
        public String windScale;
        public String windSpeed;
        public String humidity;
        public String precip;
        public String pressure;
        public String vis;
        public String cloud;
        public String dew;
    }

    public static class ReferBean {
        public List<String> sources;
        public List<String> license;
    }
}
