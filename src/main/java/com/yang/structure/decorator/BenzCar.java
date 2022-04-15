package com.yang.structure.decorator;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月27日
 */
public class BenzCar implements Car{
    @Override
    public void run() {
        System.out.println("benz running");
    }
}
