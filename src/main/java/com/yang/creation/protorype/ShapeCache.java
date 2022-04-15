package com.yang.creation.protorype;

import javafx.fxml.LoadException;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月23日
 */
public class ShapeCache {

    private static ConcurrentHashMap<String,Shape> shapeIdMap = new ConcurrentHashMap<>(16);
    private static ConcurrentHashMap<String,Shape> shapeTypeMap = new ConcurrentHashMap<>(16);

    public static Shape getShapeById(String shapeId){
        return shapeIdMap.get(shapeId);
    }

    public static Shape getShapeByType(String shapeId){
        return shapeTypeMap.get(shapeId);
    }

    public static void LoadShape(){
        Circle circle = new Circle();
        circle.setType("circle");
        circle.setId("1");
        shapeIdMap.put("1",circle);
        shapeTypeMap.put("circle",circle);

        Square square = new Square();
        square.setType("square");
        square.setId("2");
        shapeIdMap.put("2",square);
        shapeTypeMap.put("square",square);

        Rectangle rectangle = new Rectangle();
        rectangle.setType("rectangle");
        rectangle.setId("3");
        shapeIdMap.put("3",rectangle);
        shapeTypeMap.put("rectangle",rectangle);
    }
}
