package com.qingyun.demo.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class VxnetInfo {
    private String vxnetId;
    private String vxnetName;
    private Integer vxnetType;
    private String nicId;
    private String privateIp;

    public String getVxnetId() {
        return vxnetId;
    }

    public void setVxnetId(String vxnetId) {
        this.vxnetId = vxnetId;
    }

    public String getVxnetName() {
        return vxnetName;
    }

    public void setVxnetName(String vxnetName) {
        this.vxnetName = vxnetName;
    }

    public Integer getVxnetType() {
        return vxnetType;
    }

    public void setVxnetType(Integer vxnetType) {
        this.vxnetType = vxnetType;
    }

    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
}
