package com.vi.pojo;

import javax.persistence.*;

@Table(name = "`base_village`")
public class BaseVillage {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 乡镇ID
     */
    @Column(name = "`town_id`")
    private Long townId;

    /**
     * 村ID--唯一
     */
    @Column(name = "`village_id`")
    private Long villageId;

    /**
     * 村名
     */
    @Column(name = "`village_name`")
    private String villageName;

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
     * 获取乡镇ID
     *
     * @return town_id - 乡镇ID
     */
    public Long getTownId() {
        return townId;
    }

    /**
     * 设置乡镇ID
     *
     * @param townId 乡镇ID
     */
    public void setTownId(Long townId) {
        this.townId = townId;
    }

    /**
     * 获取村ID--唯一
     *
     * @return village_id - 村ID--唯一
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 设置村ID--唯一
     *
     * @param villageId 村ID--唯一
     */
    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    /**
     * 获取村名
     *
     * @return village_name - 村名
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * 设置村名
     *
     * @param villageName 村名
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }
}