package com.yang.creation.builder;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder){
        builder.setKeyboard();
        builder.setMonitor();
        builder.setMouse();
    }
}
