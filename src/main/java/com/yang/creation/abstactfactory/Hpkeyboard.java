package com.yang.creation.abstactfactory;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class Hpkeyboard implements Keyboard{
    @Override
    public void say() {
        System.out.println("I created hp keyboard...");
    }
}
