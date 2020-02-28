package com.vi.pojo;

import javax.persistence.*;

@Table(name = "`base_county`")
public class BaseCounty {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 地级市ID
     */
    @Column(name = "`city_id`")
    private Long cityId;

    /**
     * 县级ID
     */
    @Column(name = "`county_id`")
    private Long countyId;

    /**
     * 县级名称
     */
    @Column(name = "`county_name`")
    private String countyName;

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
     * 获取县级ID
     *
     * @return county_id - 县级ID
     */
    public Long getCountyId() {
        return countyId;
    }

    /**
     * 设置县级ID
     *
     * @param countyId 县级ID
     */
    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    /**
     * 获取县级名称
     *
     * @return county_name - 县级名称
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * 设置县级名称
     *
     * @param countyName 县级名称
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}