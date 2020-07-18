package com.qingyun.demo.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InstanceSetItem {
    private String instanceId;
    private String instanceName;
    private String description;
    private String instanceType;
    private Integer vcpusCurrent;
    private Integer memoryCurrent;
    private String status;
    private String transitionStatus;
    private Date createTime;
    private Date statusTime;
    private ImageInfo image;
    private List<VxnetInfo> vxnets;
    private EipInfo eip;
    private List<SecurityInfo> securityGroup;
    private List<String> volumeIds;
    private List<String> keypairIds;
    private String graphicsProtocol;
    private String graphicsPasswd;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Integer getVcpusCurrent() {
        return vcpusCurrent;
    }

    public void setVcpusCurrent(Integer vcpusCurrent) {
        this.vcpusCurrent = vcpusCurrent;
    }

    public Integer getMemoryCurrent() {
        return memoryCurrent;
    }

    public void setMemoryCurrent(Integer memoryCurrent) {
        this.memoryCurrent = memoryCurrent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransitionStatus() {
        return transitionStatus;
    }

    public void setTransitionStatus(String transitionStatus) {
        this.transitionStatus = transitionStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public ImageInfo getImage() {
        return image;
    }

    public void setImage(ImageInfo image) {
        this.image = image;
    }

    public List<VxnetInfo> getVxnets() {
        return vxnets;
    }

    public void setVxnets(List<VxnetInfo> vxnets) {
        this.vxnets = vxnets;
    }

    public EipInfo getEip() {
        return eip;
    }

    public void setEip(EipInfo eip) {
        this.eip = eip;
    }

    public List<SecurityInfo> getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(List<SecurityInfo> securityGroup) {
        this.securityGroup = securityGroup;
    }

    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    public List<String> getKeypairIds() {
        return keypairIds;
    }

    public void setKeypairIds(List<String> keypairIds) {
        this.keypairIds = keypairIds;
    }

    public String getGraphicsProtocol() {
        return graphicsProtocol;
    }

    public void setGraphicsProtocol(String graphicsProtocol) {
        this.graphicsProtocol = graphicsProtocol;
    }

    public String getGraphicsPasswd() {
        return graphicsPasswd;
    }

    public void setGraphicsPasswd(String graphicsPasswd) {
        this.graphicsPasswd = graphicsPasswd;
    }
}
