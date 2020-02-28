package com.vi.pojo;

import javax.persistence.*;

@Table(name = "`base_city`")
public class BaseCity {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 省份ID
     */
    @Column(name = "`province_id`")
    private Long provinceId;

    /**
     * 地级市ID
     */
    @Column(name = "`city_id`")
    private Long cityId;

    /**
     * 地级市名称
     */
    @Column(name = "`city_name`")
    private String cityName;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取省份ID
     *
     * @return province_id - 省份ID
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省份ID
     *
     * @param provinceId 省份ID
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取地级市ID
     *
     * @return city_id - 地级市ID
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 设置地级市ID
     *
     * @param cityId 地级市ID
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取地级市名称
     *
     * @return city_name - 地级市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置地级市名称
     *
     * @param cityName 地级市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}