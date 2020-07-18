package com.qingyun.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.qingyun.demo.pojo.DescribeInstancesReq;
import com.qingyun.demo.pojo.DescribeInstancesRes;
import com.qingyun.demo.service.IHostService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 主机API访问实现
 */
@Service
public class HostServiceImpl implements IHostService {

    @Value("${qingyun.url}")
    private String qingCloudUrl;


    @Resource
    private RestTemplate restTemplate;

    @Override
    public DescribeInstancesRes getDescribeInstancesInfo(String zone, String time_stamp, DescribeInstancesReq describeInstancesReq) {

        String paramStr = String.format(qingCloudUrl, "DescribeInstances", zone, time_stamp) + describeInstancesReq.getStringParamStr();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(paramStr, HttpMethod.GET, httpEntity, String.class);
        String result = responseEntity.getBody();
        return JSONObject.parseObject(result,DescribeInstancesRes.class);
    }
}
