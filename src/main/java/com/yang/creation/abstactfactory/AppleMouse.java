package com.yang.creation.abstactfactory;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class AppleMouse implements Mouse{
    @Override
    public void say() {
        System.out.println("I created apple mouse....");
    }
}
