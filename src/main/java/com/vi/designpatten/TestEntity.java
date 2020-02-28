package com.vi.designpatten;

import java.util.List;

public class TestEntity {

    private int id;
    private String name;
    private int parentId;
    private int level;
    private List<TestEntity> childList;

    public TestEntity(int id, String name, int parentId, int level) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
    }

    public TestEntity(int id, String name, int parentId, int level, List<TestEntity> childList) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.childList = childList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<TestEntity> getChildList() {
        return childList;
    }

    public TestEntity setChildList(List<TestEntity> childList) {
        this.childList = childList;
        return this;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}