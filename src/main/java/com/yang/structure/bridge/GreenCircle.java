package com.yang.structure.bridge;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月15日
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int r) {
        System.out.printf("draw circle,color is: green and radius is: %d\n", r);
    }
}
