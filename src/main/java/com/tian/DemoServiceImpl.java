package com.tian;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService
public class DemoServiceImpl implements IDemoService {

    public String get(String s) {
        return "receive: "+s;
    }
}
