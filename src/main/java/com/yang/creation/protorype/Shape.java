package com.yang.creation.protorype;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月23日
 */
public abstract class Shape {
    private String id;
    private String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
