package com.yang.structure.decorator;

/**
 * 装饰者案例
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月27日
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        BenzCar benzCar = new BenzCar();
        ConstantSpeedCar constantSpeedCar = new ConstantSpeedCar(benzCar);
        constantSpeedCar.run();
    }
}
