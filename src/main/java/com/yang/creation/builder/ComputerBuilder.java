package com.yang.creation.builder;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public abstract class ComputerBuilder {

    public abstract void setKeyboard();
    public abstract void setMouse();
    public abstract void setMonitor();
    public abstract Computer getComputer();
}
