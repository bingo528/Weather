package com.dave.nauweather.api.amap;

import android.util.Log;

import java.util.List;

public class AmapWeatherBean {

    /**
     * status : 1
     * count : 1
     * info : OK
     * infocode : 10000
     * lives : [{"province":"北京","city":"东城区","adcode":"110101","weather":"阴","temperature":"31","winddirection":"北","windpower":"≤3","humidity":"16","reporttime":"2024-05-14 15:08:44","temperature_float":"31.0","humidity_float":"16.0"}]
     */

    private String status;
    private String count;
    private String info;
    private String infocode;
    private List<LivesBean> lives;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public List<LivesBean> getLives() {
        return lives;
    }

    public void setLives(List<LivesBean> lives) {
        this.lives = lives;
    }

    public void show() {
        Log.d("dave","onLocationChanged show "+getLives().get(0).weather);
    }

    public static class LivesBean {
        /**
         * province : 北京
         * city : 东城区
         * adcode : 110101
         * weather : 阴
         * temperature : 31
         * winddirection : 北
         * windpower : ≤3
         * humidity : 16
         * reporttime : 2024-05-14 15:08:44
         * temperature_float : 31.0
         * humidity_float : 16.0
         */

        private String province;
        private String city;
        private String adcode;
        private String weather;
        private String temperature;
        private String winddirection;
        private String windpower;
        private String humidity;
        private String reporttime;
        private String temperature_float;
        private String humidity_float;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWinddirection() {
            return winddirection;
        }

        public void setWinddirection(String winddirection) {
            this.winddirection = winddirection;
        }

        public String getWindpower() {
            return windpower;
        }

        public void setWindpower(String windpower) {
            this.windpower = windpower;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getReporttime() {
            return reporttime;
        }

        public void setReporttime(String reporttime) {
            this.reporttime = reporttime;
        }

        public String getTemperature_float() {
            return temperature_float;
        }

        public void setTemperature_float(String temperature_float) {
            this.temperature_float = temperature_float;
        }

        public String getHumidity_float() {
            return humidity_float;
        }

        public void setHumidity_float(String humidity_float) {
            this.humidity_float = humidity_float;
        }
    }
}
