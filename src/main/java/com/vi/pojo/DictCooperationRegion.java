package com.vi.pojo;

import javax.persistence.*;

@Table(name = "`dict_cooperation_region`")
public class DictCooperationRegion {
    @Id
    @Column(name = "`ID`")
    private String id;

    /**
     * 节点名称
     */
    @Column(name = "`NODE_NAME`")
    private String nodeName;

    /**
     * 省id
     */
    @Column(name = "`PROVINCE_ID`")
    private String provinceId;

    /**
     * 省
     */
    @Column(name = "`PROVINCE_NAME`")
    private String provinceName;

    /**
     * 市ID
     */
    @Column(name = "`CITY_ID`")
    private String cityId;

    /**
     * 市
     */
    @Column(name = "`CITY`")
    private String city;

    /**
     * 区/县ID
     */
    @Column(name = "`COUNTY_ID`")
    private String countyId;

    /**
     * 区/县
     */
    @Column(name = "`COUNTY_NAME`")
    private String countyName;

    /**
     * 乡/镇_ID
     */
    @Column(name = "`TOWN_ID`")
    private String townId;

    /**
     * 乡/镇
     */
    @Column(name = "`TOWN_NAME`")
    private String townName;

    /**
     * 村ID
     */
    @Column(name = "`VILLAGE_ID`")
    private String villageId;

    /**
     * 村
     */
    @Column(name = "`VILLAGE_NAME`")
    private String villageName;

    /**
     * 根节点：0
     */
    @Column(name = "`PID`")
    private String pid;

    /**
     * 自当前节点到根节点的名字（-隔开）
     */
    @Column(name = "`ALL_NAME`")
    private String allName;

    /**
     * code
     */
    @Column(name = "`CODE`")
    private String code;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取节点名称
     *
     * @return NODE_NAME - 节点名称
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 设置节点名称
     *
     * @param nodeName 节点名称
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 获取省id
     *
     * @return PROVINCE_ID - 省id
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省id
     *
     * @param provinceId 省id
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取省
     *
     * @return PROVINCE_NAME - 省
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置省
     *
     * @param provinceName 省
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取市ID
     *
     * @return CITY_ID - 市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置市ID
     *
     * @param cityId 市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取市
     *
     * @return CITY - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区/县ID
     *
     * @return COUNTY_ID - 区/县ID
     */
    public String getCountyId() {
        return countyId;
    }

    /**
     * 设置区/县ID
     *
     * @param countyId 区/县ID
     */
    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    /**
     * 获取区/县
     *
     * @return COUNTY_NAME - 区/县
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * 设置区/县
     *
     * @param countyName 区/县
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /**
     * 获取乡/镇_ID
     *
     * @return TOWN_ID - 乡/镇_ID
     */
    public String getTownId() {
        return townId;
    }

    /**
     * 设置乡/镇_ID
     *
     * @param townId 乡/镇_ID
     */
    public void setTownId(String townId) {
        this.townId = townId;
    }

    /**
     * 获取乡/镇
     *
     * @return TOWN_NAME - 乡/镇
     */
    public String getTownName() {
        return townName;
    }

    /**
     * 设置乡/镇
     *
     * @param townName 乡/镇
     */
    public void setTownName(String townName) {
        this.townName = townName;
    }

    /**
     * 获取村ID
     *
     * @return VILLAGE_ID - 村ID
     */
    public String getVillageId() {
        return villageId;
    }

    /**
     * 设置村ID
     *
     * @param villageId 村ID
     */
    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    /**
     * 获取村
     *
     * @return VILLAGE_NAME - 村
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * 设置村
     *
     * @param villageName 村
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    /**
     * 获取根节点：0
     *
     * @return PID - 根节点：0
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置根节点：0
     *
     * @param pid 根节点：0
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取自当前节点到根节点的名字（-隔开）
     *
     * @return ALL_NAME - 自当前节点到根节点的名字（-隔开）
     */
    public String getAllName() {
        return allName;
    }

    /**
     * 设置自当前节点到根节点的名字（-隔开）
     *
     * @param allName 自当前节点到根节点的名字（-隔开）
     */
    public void setAllName(String allName) {
        this.allName = allName;
    }

    /**
     * 获取code
     *
     * @return CODE - code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }
}