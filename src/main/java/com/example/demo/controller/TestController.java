package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Data;
import com.example.demo.pojo.JsonRootBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * description: TestController
 *
 *
 * @author ralf
 * @version [1.0, 2018/6/29]
 */
@RestController
public class TestController {

    @Autowired
    RestOperations restTemplate;
    @Value("${ftusdt}")
    private String ftusdt;
    @GetMapping("/")
    public String test(){
        JsonRootBean result = restTemplate.getForObject(ftusdt,JsonRootBean.class);
//        JsonRootBean jsonRootBean = JSONObject.parseObject(result,JsonRootBean.class);
        return JSON.toJSONString(result);
    }
    /**
     * ticker 列表对应字段含义说明:
     *
     * [
     *   0"最新成交价",
     *   1"最近一笔成交的成交量",
     *   2"最大买一价",
     *   3"最大买一量",
     *   4"最小卖一价",
     *   5"最小卖一量",
     *   6"24小时前成交价",
     *   7"24小时内最高价",
     *   8"24小时内最低价",
     *   9"24小时内基准货币成交量, 如 btcusdt 中 btc 的量",
     *   10"24小时内计价货币成交量, 如 btcusdt 中 usdt 的量"
     * ]
     */
}
