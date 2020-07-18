package com.qingyun.demo.pojo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DescribeInstancesReq {
    private String instancesN = null;
    private String imageIdN = null;
    private String instanceTypeN = null;
    private Integer instanceClass = null;
    private Integer vcpusCurrent = null;
    private Integer memoryCurrent = null;
    private Integer osDiskSize = null;
    private Integer excludeReserved = null;
    private String statusN = null;
    private String searchWord = null;
    private String tagsN = null;
    private String dedicatedHostGroupId = null;
    private String dedicatedHostId = null;
    private String owner = null;
    private Integer verbose = null;
    private Integer offset = 0;
    private Integer limit = 20;


    public String getInstancesN() {
        return instancesN;
    }

    public void setInstancesN(String instancesN) {
        this.instancesN = instancesN;
    }

    public String getImageIdN() {
        return imageIdN;
    }

    public void setImageIdN(String imageIdN) {
        this.imageIdN = imageIdN;
    }

    public String getInstanceTypeN() {
        return instanceTypeN;
    }

    public void setInstanceTypeN(String instanceTypeN) {
        this.instanceTypeN = instanceTypeN;
    }

    public Integer getInstanceClass() {
        return instanceClass;
    }

    public void setInstanceClass(Integer instanceClass) {
        this.instanceClass = instanceClass;
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

    public Integer getOsDiskSize() {
        return osDiskSize;
    }

    public void setOsDiskSize(Integer osDiskSize) {
        this.osDiskSize = osDiskSize;
    }

    public Integer getExcludeReserved() {
        return excludeReserved;
    }

    public void setExcludeReserved(Integer excludeReserved) {
        this.excludeReserved = excludeReserved;
    }

    public String getStatusN() {
        return statusN;
    }

    public void setStatusN(String statusN) {
        this.statusN = statusN;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getTagsN() {
        return tagsN;
    }

    public void setTagsN(String tagsN) {
        this.tagsN = tagsN;
    }

    public String getDedicatedHostGroupId() {
        return dedicatedHostGroupId;
    }

    public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getVerbose() {
        return verbose;
    }

    public void setVerbose(Integer verbose) {
        this.verbose = verbose;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getStringParamStr() {
        StringBuilder stringBuilder = new StringBuilder();
        if (instancesN != null) {
            stringBuilder.append("&instances.n=" + instancesN);
        }
        if (imageIdN != null) {
            stringBuilder.append("&image_id.n=" + imageIdN);
        }
        if (instanceTypeN != null) {
            stringBuilder.append("&instance_type.n=" + instanceTypeN);
        }
        if (instanceClass != null) {
            stringBuilder.append("&instance_class=" + instanceClass);
        }
        if (vcpusCurrent != null) {
            stringBuilder.append("&vcpus_current=" + vcpusCurrent);
        }
        if (memoryCurrent != null) {
            stringBuilder.append("&memory_current=" + memoryCurrent);
        }
        if (osDiskSize != null) {
            stringBuilder.append("&os_disk_size=" + osDiskSize);
        }
        if (excludeReserved != null) {
            stringBuilder.append("&exclude_reserved=" + excludeReserved);
        }
        if (statusN != null) {
            stringBuilder.append("&status.n=" + statusN);
        }
        if (searchWord != null) {
            stringBuilder.append("&search_word=" + searchWord);
        }
        if (tagsN != null) {
            stringBuilder.append("&tags.n=" + tagsN);
        }
        if (dedicatedHostGroupId != null) {
            stringBuilder.append("&dedicated_host_group_id=" + dedicatedHostGroupId);
        }
        if (dedicatedHostId != null) {
            stringBuilder.append("&dedicated_host_id=" + dedicatedHostId);
        }
        if (owner != null) {
            stringBuilder.append("&owner=" + owner);
        }
        if (verbose != null) {
            stringBuilder.append("&verbose=" + verbose);
        }
        if (offset != null) {
            stringBuilder.append("&offset=" + offset);
        }
        if (limit != null) {
            stringBuilder.append("&limit=" + limit);
        }
        return stringBuilder.toString();
    }
}
