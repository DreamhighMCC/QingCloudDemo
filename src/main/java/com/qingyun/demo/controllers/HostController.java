package com.qingyun.demo.controllers;

import com.qingyun.demo.pojo.DescribeInstancesReq;
import com.qingyun.demo.pojo.DescribeInstancesRes;
import com.qingyun.demo.service.IHostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class HostController {

    @Resource
    private IHostService hostService;

    @GetMapping("/describe-instances")
    public DescribeInstancesRes getDescribeInstances(HttpServletRequest request, @RequestParam("zone") String zone,
                                                     @RequestParam("time_stamp") String timeStamp,
                                                     @RequestBody DescribeInstancesReq req) {
        return hostService.getDescribeInstancesInfo(zone, timeStamp, req);
    }
}
