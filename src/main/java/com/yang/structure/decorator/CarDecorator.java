package com.yang.structure.decorator;

/**
 * 车子装饰者
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月27日
 */
public abstract class CarDecorator {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public void run(){
        this.car.run();
    }
}
