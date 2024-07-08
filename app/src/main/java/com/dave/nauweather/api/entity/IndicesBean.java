package com.dave.nauweather.api.entity;

import java.util.List;

public class IndicesBean {

   //https://devapi.qweather.com/v7/indices/1d?type=0&location=101020200&key=bf24fd6ccdc94f43b97bf83ad31b41f2
    /**
     * code : 200
     * updateTime : 2024-06-18T21:13+08:00
     * fxLink : https://www.qweather.com/indices/minhang-101020200.html
     * daily : [{"date":"2024-06-18","type":"1","name":"运动指数","level":"3","category":"较不宜","text":"有较强降水，建议您选择在室内进行健身休闲运动。"},{"date":"2024-06-18","type":"2","name":"洗车指数","level":"4","category":"不宜","text":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"date":"2024-06-18","type":"3","name":"穿衣指数","level":"5","category":"舒适","text":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},{"date":"2024-06-18","type":"4","name":"钓鱼指数","level":"3","category":"不宜","text":"天气不好，不适合垂钓。"},{"date":"2024-06-18","type":"5","name":"紫外线指数","level":"5","category":"很强","text":"紫外线辐射极强，建议涂擦SPF20以上、PA++的防晒护肤品，尽量避免暴露于日光下。"},{"date":"2024-06-18","type":"6","name":"旅游指数","level":"3","category":"一般","text":"温度适宜，有微风同行，但较强降雨的天气将给您的出行带来很多的不便，若坚持旅行建议带上雨具。"},{"date":"2024-06-18","type":"7","name":"过敏指数","level":"1","category":"极不易发","text":"天气条件极不易诱发过敏，有较强降水，空气湿润，出行注意携带雨具。"},{"date":"2024-06-18","type":"8","name":"舒适度指数","level":"2","category":"较舒适","text":"白天有雨，雨量较大，从而使空气湿度加大，会使人们感觉有点儿闷热，但早晚的天气很凉爽、舒适。"},{"date":"2024-06-18","type":"9","name":"感冒指数","level":"2","category":"较易发","text":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"},{"date":"2024-06-18","type":"10","name":"空气污染扩散条件指数","level":"1","category":"优","text":"气象条件非常有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},{"date":"2024-06-18","type":"11","name":"空调开启指数","level":"3","category":"较少开启","text":"您将感到很舒适，一般不需要开启空调。"},{"date":"2024-06-18","type":"12","name":"太阳镜指数","level":"1","category":"不需要","text":"白天有降水天气，视线较差，不需要佩戴太阳镜"},{"date":"2024-06-18","type":"13","name":"化妆指数","level":"5","category":"去油","text":"天气较热，建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。"},{"date":"2024-06-18","type":"14","name":"晾晒指数","level":"5","category":"不宜","text":"有较强降水，不适宜晾晒。若需要晾晒，请在室内准备出充足的空间。"},{"date":"2024-06-18","type":"15","name":"交通指数","level":"3","category":"一般","text":"有较强降水，路面比较湿滑，交通气象条件一般，刹车距离延长，事故易发期，请注意车距。"},{"date":"2024-06-18","type":"16","name":"防晒指数","level":"1","category":"弱","text":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}]
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
         * date : 2024-06-18
         * type : 1
         * name : 运动指数
         * level : 3
         * category : 较不宜
         * text : 有较强降水，建议您选择在室内进行健身休闲运动。
         */

        public String date;
        public String type;
        public String name;
        public String level;
        public String category;
        public String text;
    }
}
