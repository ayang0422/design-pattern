package com.yang.structure.bridge;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月15日
 */
public abstract class Shape{

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI ){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
