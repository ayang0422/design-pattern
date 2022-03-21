package com.yang.creation.factory;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月20日
 */
public class ShapeFactory {

    public IShape getShape(String shape) {
        if (shape == null || shape.length() == 0) {
            return null;
        }
        switch (shape) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
