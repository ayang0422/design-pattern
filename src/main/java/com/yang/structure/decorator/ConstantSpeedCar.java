package com.yang.structure.decorator;

/**
 * 具有定速巡航功能的车
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月27日
 */
public class ConstantSpeedCar extends CarDecorator{
    public ConstantSpeedCar(Car car) {
        super(car);
    }

    @Override
    public void run() {
        System.out.println("setting speed 50 km/h");
        super.run();
    }
}
