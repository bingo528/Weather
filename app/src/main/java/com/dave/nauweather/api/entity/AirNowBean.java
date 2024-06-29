package com.dave.nauweather.api.entity;

import java.util.List;

public class AirNowBean {
    //https://devapi.qweather.com/v7/air/now?location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    /**
     * code : 200
     * updateTime : 2024-06-17T21:58+08:00
     * fxLink : https://www.qweather.com/air/minhang-101020200.html
     * now : {"pubTime":"2024-06-17T21:00+08:00","aqi":"32","level":"1","category":"优","primary":"NA","pm10":"18","pm2p5":"14","no2":"24","so2":"7","co":"0.5","o3":"100"}
     * refer : {"sources":["中国环境监测总站 (CNEMC)"],"license":["CC BY-SA 4.0"]}
     */

    public String code;
    public String updateTime;
    public String fxLink;
    public NowBean now;
    public ReferBean refer;

    public static class NowBean {
        /**
         * pubTime : 2024-06-17T21:00+08:00
         * aqi : 32
         * level : 1
         * category : 优
         * primary : NA
         * pm10 : 18
         * pm2p5 : 14
         * no2 : 24
         * so2 : 7
         * co : 0.5
         * o3 : 100
         */

        public String pubTime;
        public String aqi;
        public String level;
        public String category;
        public String primary;
        public String pm10;
        public String pm2p5;
        public String no2;
        public String so2;
        public String co;
        public String o3;
    }

    public static class ReferBean {
        public List<String> sources;
        public List<String> license;
    }


}
