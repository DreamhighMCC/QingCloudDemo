package com.qingyun.demo.service;

import com.qingyun.demo.pojo.DescribeInstancesReq;
import com.qingyun.demo.pojo.DescribeInstancesRes;

public interface IHostService {
    /**
     * 获取主机信息
     *
     * @return
     */
    DescribeInstancesRes getDescribeInstancesInfo(String zone, String time_stamp, DescribeInstancesReq describeInstancesReq);

}
