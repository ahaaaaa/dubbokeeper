package com.dubboclub.dk.admin;

import com.alibaba.dubbo.common.URL;
import com.alibaba.fastjson.JSON;

/**
 * Created by QingyuanZhang on 6/2/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(URL.valueOf("cn.jpush.lossstats.service.HelloService%24Iface")));
    }
}
