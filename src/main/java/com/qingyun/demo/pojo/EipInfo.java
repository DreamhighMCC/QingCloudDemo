package com.qingyun.demo.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EipInfo {
    private String eipId;
    private String eipAddr;
    private String bandwidth;

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getEipAddr() {
        return eipAddr;
    }

    public void setEipAddr(String eipAddr) {
        this.eipAddr = eipAddr;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
}
