package com.dave.nauweather.api.entity;

import java.util.List;

public class HourlyForecastBean {
    //https://devapi.qweather.com/v7/weather/24h?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    /**
     * code : 200
     * updateTime : 2024-06-17T22:03+08:00
     * fxLink : https://www.qweather.com/weather/minhang-101020200.html
     * hourly : [{"fxTime":"2024-06-17T23:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"128","windDir":"东南风","windScale":"1-3","windSpeed":"9","humidity":"74","pop":"7","precip":"0.0","pressure":"1009","cloud":"0","dew":"18"},{"fxTime":"2024-06-18T00:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"132","windDir":"东南风","windScale":"1-3","windSpeed":"9","humidity":"75","pop":"7","precip":"0.0","pressure":"1009","cloud":"1","dew":"18"},{"fxTime":"2024-06-18T01:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"127","windDir":"东南风","windScale":"1-3","windSpeed":"7","humidity":"76","pop":"7","precip":"0.0","pressure":"1009","cloud":"3","dew":"18"},{"fxTime":"2024-06-18T02:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"123","windDir":"东南风","windScale":"1-3","windSpeed":"7","humidity":"77","pop":"7","precip":"0.0","pressure":"1008","cloud":"4","dew":"18"},{"fxTime":"2024-06-18T03:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"123","windDir":"东南风","windScale":"1-3","windSpeed":"7","humidity":"79","pop":"7","precip":"0.0","pressure":"1008","cloud":"32","dew":"18"},{"fxTime":"2024-06-18T04:00+08:00","temp":"21","icon":"150","text":"晴","wind360":"123","windDir":"东南风","windScale":"1-3","windSpeed":"7","humidity":"80","pop":"7","precip":"0.0","pressure":"1008","cloud":"60","dew":"18"},{"fxTime":"2024-06-18T05:00+08:00","temp":"21","icon":"100","text":"晴","wind360":"120","windDir":"东南风","windScale":"1-3","windSpeed":"7","humidity":"83","pop":"7","precip":"0.0","pressure":"1007","cloud":"87","dew":"18"},{"fxTime":"2024-06-18T06:00+08:00","temp":"23","icon":"100","text":"晴","wind360":"112","windDir":"东风","windScale":"1-3","windSpeed":"9","humidity":"79","pop":"7","precip":"0.0","pressure":"1007","cloud":"58","dew":"18"},{"fxTime":"2024-06-18T07:00+08:00","temp":"24","icon":"100","text":"晴","wind360":"104","windDir":"东风","windScale":"1-3","windSpeed":"11","humidity":"73","pop":"7","precip":"0.0","pressure":"1007","cloud":"29","dew":"18"},{"fxTime":"2024-06-18T08:00+08:00","temp":"25","icon":"100","text":"晴","wind360":"103","windDir":"东风","windScale":"1-3","windSpeed":"11","humidity":"66","pop":"7","precip":"0.0","pressure":"1007","cloud":"0","dew":"17"},{"fxTime":"2024-06-18T09:00+08:00","temp":"26","icon":"100","text":"晴","wind360":"110","windDir":"东风","windScale":"1-3","windSpeed":"13","humidity":"59","pop":"7","precip":"0.0","pressure":"1007","cloud":"13","dew":"17"},{"fxTime":"2024-06-18T10:00+08:00","temp":"27","icon":"100","text":"晴","wind360":"120","windDir":"东南风","windScale":"1-3","windSpeed":"14","humidity":"52","pop":"7","precip":"0.0","pressure":"1007","cloud":"26","dew":"16"},{"fxTime":"2024-06-18T11:00+08:00","temp":"29","icon":"100","text":"晴","wind360":"127","windDir":"东南风","windScale":"1-3","windSpeed":"14","humidity":"46","pop":"7","precip":"0.0","pressure":"1007","cloud":"38","dew":"16"},{"fxTime":"2024-06-18T12:00+08:00","temp":"30","icon":"100","text":"晴","wind360":"133","windDir":"东南风","windScale":"1-3","windSpeed":"16","humidity":"44","pop":"7","precip":"0.0","pressure":"1008","cloud":"37","dew":"16"},{"fxTime":"2024-06-18T13:00+08:00","temp":"30","icon":"100","text":"晴","wind360":"139","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"42","pop":"7","precip":"0.0","pressure":"1008","cloud":"35","dew":"16"},{"fxTime":"2024-06-18T14:00+08:00","temp":"30","icon":"100","text":"晴","wind360":"141","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"44","pop":"7","precip":"0.0","pressure":"1008","cloud":"34","dew":"16"},{"fxTime":"2024-06-18T15:00+08:00","temp":"29","icon":"100","text":"晴","wind360":"140","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"46","pop":"7","precip":"0.0","pressure":"1008","cloud":"52","dew":"16"},{"fxTime":"2024-06-18T16:00+08:00","temp":"29","icon":"100","text":"晴","wind360":"137","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"49","pop":"7","precip":"0.0","pressure":"1008","cloud":"70","dew":"16"},{"fxTime":"2024-06-18T17:00+08:00","temp":"28","icon":"100","text":"晴","wind360":"133","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"55","pop":"7","precip":"0.0","pressure":"1007","cloud":"89","dew":"17"},{"fxTime":"2024-06-18T18:00+08:00","temp":"27","icon":"100","text":"晴","wind360":"130","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"59","pop":"7","precip":"0.0","pressure":"1006","cloud":"92","dew":"17"},{"fxTime":"2024-06-18T19:00+08:00","temp":"26","icon":"100","text":"晴","wind360":"127","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"66","pop":"7","precip":"0.0","pressure":"1006","cloud":"96","dew":"18"},{"fxTime":"2024-06-18T20:00+08:00","temp":"26","icon":"150","text":"晴","wind360":"125","windDir":"东南风","windScale":"1-3","windSpeed":"18","humidity":"75","pop":"7","precip":"0.0","pressure":"1007","cloud":"100","dew":"19"},{"fxTime":"2024-06-18T21:00+08:00","temp":"24","icon":"151","text":"多云","wind360":"129","windDir":"东南风","windScale":"1-3","windSpeed":"16","humidity":"79","pop":"7","precip":"0.0","pressure":"1007","cloud":"100","dew":"19"},{"fxTime":"2024-06-18T22:00+08:00","temp":"24","icon":"151","text":"多云","wind360":"138","windDir":"东南风","windScale":"1-3","windSpeed":"14","humidity":"82","pop":"7","precip":"0.0","pressure":"1007","cloud":"100","dew":"19"}]
     * refer : {"sources":["QWeather"],"license":["CC BY-SA 4.0"]}
     */

    public String code;
    public String updateTime;
    public String fxLink;
    public ReferBean refer;
    public List<HourlyBean> hourly;

    public static class ReferBean {
        public List<String> sources;
        public List<String> license;
    }

    public static class HourlyBean {
        /**
         * fxTime : 2024-06-17T23:00+08:00
         * temp : 21
         * icon : 150
         * text : 晴
         * wind360 : 128
         * windDir : 东南风
         * windScale : 1-3
         * windSpeed : 9
         * humidity : 74
         * pop : 7
         * precip : 0.0
         * pressure : 1009
         * cloud : 0
         * dew : 18
         */

        public String fxTime;
        public String temp;
        public String icon;
        public String text;
        public String wind360;
        public String windDir;
        public String windScale;
        public String windSpeed;
        public String humidity;
        public String pop;
        public String precip;
        public String pressure;
        public String cloud;
        public String dew;
    }
}
