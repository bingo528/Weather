package com.dave.nauweather.api.entity;

import java.util.List;

public class LookUpGeoCityBean {
    //https://geoapi.qweather.com/v2/city/lookup?location=shangh&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    //https://geoapi.qweather.com/v2/city/lookup?location=310112&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    /**
     * code : 200
     * location : [{"name":"上海","id":"101020100","lat":"31.23171","lon":"121.47264","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"11","fxLink":"https://www.qweather.com/weather/shanghai-101020100.html"},{"name":"闵行","id":"101020200","lat":"31.11166","lon":"121.37597","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"25","fxLink":"https://www.qweather.com/weather/minhang-101020200.html"},{"name":"宝山","id":"101020300","lat":"31.39890","lon":"121.48994","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"23","fxLink":"https://www.qweather.com/weather/baoshan-101020300.html"},{"name":"嘉定","id":"101020500","lat":"31.38352","lon":"121.25034","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"23","fxLink":"https://www.qweather.com/weather/jiading-101020500.html"},{"name":"浦东新区","id":"101020600","lat":"31.24594","lon":"121.56770","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"15","fxLink":"https://www.qweather.com/weather/pudong-101020600.html"},{"name":"金山","id":"101020700","lat":"30.72470","lon":"121.33073","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"35","fxLink":"https://www.qweather.com/weather/jinshan-101020700.html"},{"name":"青浦","id":"101020800","lat":"31.15121","lon":"121.11302","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"23","fxLink":"https://www.qweather.com/weather/qingpu-101020800.html"},{"name":"松江","id":"101020900","lat":"31.03047","lon":"121.22354","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"23","fxLink":"https://www.qweather.com/weather/songjiang-101020900.html"},{"name":"奉贤","id":"101021000","lat":"30.91235","lon":"121.45847","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"25","fxLink":"https://www.qweather.com/weather/fengxian-101021000.html"},{"name":"崇明","id":"101021100","lat":"31.62695","lon":"121.39751","adm2":"上海","adm1":"上海市","country":"中国","tz":"Asia/Shanghai","utcOffset":"+08:00","isDst":"0","type":"city","rank":"35","fxLink":"https://www.qweather.com/weather/chongming-101021100.html"}]
     * refer : {"sources":["QWeather"],"license":["QWeather Developers License"]}
     */

    public String code;
    public ReferBean refer;
    public List<LocationBean> location;

    public static class ReferBean {
        public List<String> sources;
        public List<String> license;
    }

    public static class LocationBean {
        /**
         * name : 上海
         * id : 101020100
         * lat : 31.23171
         * lon : 121.47264
         * adm2 : 上海
         * adm1 : 上海市
         * country : 中国
         * tz : Asia/Shanghai
         * utcOffset : +08:00
         * isDst : 0
         * type : city
         * rank : 11
         * fxLink : https://www.qweather.com/weather/shanghai-101020100.html
         */

        public String name;
        public String id;
        public String lat;
        public String lon;
        public String adm2;
        public String adm1;
        public String country;
        public String tz;
        public String utcOffset;
        public String isDst;
        public String type;
        public String rank;
        public String fxLink;
    }


}
