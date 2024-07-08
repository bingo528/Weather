package com.dave.nauweather.api.entity;

import java.util.List;

public class DailyForecastBean {

    /**
     * code : 200
     * updateTime : 2024-07-08T15:51+08:00
     * fxLink : https://www.qweather.com/weather/minhang-101020200.html
     * daily : [{"fxDate":"2024-07-08","sunrise":"04:58","sunset":"19:02","moonrise":"06:52","moonset":"21:07","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"38","tempMin":"28","iconDay":"100","textDay":"晴","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"73","precip":"0.0","pressure":"1003","vis":"25","cloud":"25","uvIndex":"6"},{"fxDate":"2024-07-09","sunrise":"04:58","sunset":"19:02","moonrise":"07:51","moonset":"21:37","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"37","tempMin":"27","iconDay":"104","textDay":"阴","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"83","precip":"0.0","pressure":"1003","vis":"24","cloud":"25","uvIndex":"5"},{"fxDate":"2024-07-10","sunrise":"04:59","sunset":"19:02","moonrise":"08:48","moonset":"22:04","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"33","tempMin":"26","iconDay":"305","textDay":"小雨","iconNight":"305","textNight":"小雨","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"96","precip":"1.0","pressure":"1004","vis":"17","cloud":"55","uvIndex":"8"},{"fxDate":"2024-07-11","sunrise":"04:59","sunset":"19:02","moonrise":"09:42","moonset":"22:28","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"30","tempMin":"26","iconDay":"305","textDay":"小雨","iconNight":"104","textNight":"阴","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"98","precip":"1.0","pressure":"1000","vis":"13","cloud":"55","uvIndex":"4"},{"fxDate":"2024-07-12","sunrise":"05:00","sunset":"19:01","moonrise":"10:36","moonset":"22:53","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"31","tempMin":"27","iconDay":"305","textDay":"小雨","iconNight":"305","textNight":"小雨","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"93","precip":"1.0","pressure":"1000","vis":"20","cloud":"55","uvIndex":"5"},{"fxDate":"2024-07-13","sunrise":"05:01","sunset":"19:01","moonrise":"11:28","moonset":"23:16","moonPhase":"蛾眉月","moonPhaseIcon":"801","tempMax":"32","tempMin":"27","iconDay":"306","textDay":"中雨","iconNight":"305","textNight":"小雨","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"89","precip":"1.0","pressure":"1003","vis":"24","cloud":"55","uvIndex":"5"},{"fxDate":"2024-07-14","sunrise":"05:01","sunset":"19:01","moonrise":"12:23","moonset":"23:43","moonPhase":"上弦月","moonPhaseIcon":"802","tempMax":"32","tempMin":"27","iconDay":"305","textDay":"小雨","iconNight":"305","textNight":"小雨","wind360Day":"0","windDirDay":"北风","windScaleDay":"1-3","windSpeedDay":"3","wind360Night":"0","windDirNight":"北风","windScaleNight":"1-3","windSpeedNight":"3","humidity":"92","precip":"1.0","pressure":"1006","vis":"24","cloud":"55","uvIndex":"3"}]
     * refer : {"sources":["QWeather"],"license":["CC BY-SA 4.0"]}
     */

    public String code;
    public String updateTime;
    public String fxLink;
    public ReferBean refer;
    public List<DailyBean> daily;

    public static class ReferBean {
        public List<String> sources;
        public List<String> license;
    }

    public static class DailyBean {
        /**
         * fxDate : 2024-07-08
         * sunrise : 04:58
         * sunset : 19:02
         * moonrise : 06:52
         * moonset : 21:07
         * moonPhase : 蛾眉月
         * moonPhaseIcon : 801
         * tempMax : 38
         * tempMin : 28
         * iconDay : 100
         * textDay : 晴
         * iconNight : 104
         * textNight : 阴
         * wind360Day : 0
         * windDirDay : 北风
         * windScaleDay : 1-3
         * windSpeedDay : 3
         * wind360Night : 0
         * windDirNight : 北风
         * windScaleNight : 1-3
         * windSpeedNight : 3
         * humidity : 73
         * precip : 0.0
         * pressure : 1003
         * vis : 25
         * cloud : 25
         * uvIndex : 6
         */

        public String fxDate;
        public String sunrise;
        public String sunset;
        public String moonrise;
        public String moonset;
        public String moonPhase;
        public String moonPhaseIcon;
        public String tempMax;
        public String tempMin;
        public String iconDay;
        public String textDay;
        public String iconNight;
        public String textNight;
        public String wind360Day;
        public String windDirDay;
        public String windScaleDay;
        public String windSpeedDay;
        public String wind360Night;
        public String windDirNight;
        public String windScaleNight;
        public String windSpeedNight;
        public String humidity;
        public String precip;
        public String pressure;
        public String vis;
        public String cloud;
        public String uvIndex;
    }
}
