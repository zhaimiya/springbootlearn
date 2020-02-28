package com.vi.pojo;

import javax.persistence.*;

@Table(name = "`base_town`")
public class BaseTown {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 县级ID
     */
    @Column(name = "`county_id`")
    private Long countyId;

    /**
     * 乡镇级ID
     */
    @Column(name = "`town_id`")
    private Long townId;

    /**
     * 乡镇名称
     */
    @Column(name = "`town_name`")
    private String townName;

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
     * 获取乡镇级ID
     *
     * @return town_id - 乡镇级ID
     */
    public Long getTownId() {
        return townId;
    }

    /**
     * 设置乡镇级ID
     *
     * @param townId 乡镇级ID
     */
    public void setTownId(Long townId) {
        this.townId = townId;
    }

    /**
     * 获取乡镇名称
     *
     * @return town_name - 乡镇名称
     */
    public String getTownName() {
        return townName;
    }

    /**
     * 设置乡镇名称
     *
     * @param townName 乡镇名称
     */
    public void setTownName(String townName) {
        this.townName = townName;
    }
}