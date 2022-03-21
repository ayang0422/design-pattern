package com.yang.creation.abstactfactory;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class AppleFactory extends AbstractPCFactory{

    @Override
    Mouse createMouse() {
        return new AppleMouse();
    }

    @Override
    Keyboard createKeyboard() {
        return new Applekeyboard();
    }

}
