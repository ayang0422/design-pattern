package com.yang.structure.bridge;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月15日
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape red = new Circle(new RedCircle(),10);
        Shape green = new Circle(new GreenCircle(),5);

        red.draw();
        green.draw();
    }
}
