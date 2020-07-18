package com.qingyun.demo.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DescribeInstancesRes {
    private Integer totalCount;
    private String action;
    private List<InstanceSetItem> instanceSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<InstanceSetItem> getInstanceSet() {
        return instanceSet;
    }

    public void setInstanceSet(List<InstanceSetItem> instanceSet) {
        this.instanceSet = instanceSet;
    }
}
