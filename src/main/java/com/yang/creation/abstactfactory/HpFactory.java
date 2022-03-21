package com.yang.creation.abstactfactory;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class HpFactory  extends AbstractPCFactory{
    @Override
    Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    Keyboard createKeyboard() {
        return new Hpkeyboard();
    }
}
