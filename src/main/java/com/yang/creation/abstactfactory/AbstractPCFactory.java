package com.yang.creation.abstactfactory;

/**
 * 抽象pc工厂
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public abstract class AbstractPCFactory {

    /**
     * create mouse
     * @return
     */
    abstract Mouse createMouse();

    /**
     * create keyboard
     * @return
     */
    abstract Keyboard createKeyboard();

}
