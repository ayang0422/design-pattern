package com.yang.structure.adapter;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class Adapter220 extends Power220 implements Target{
    @Override
    public int convertTo220V() {
        this.outPut();
        System.out.println("but I changed your output to 110v ,hahaha");
        return 110;
    }
}
