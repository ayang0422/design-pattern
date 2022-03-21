package com.yang.creation.factorymethod;

import java.math.BigDecimal;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月21日
 */
public class NumberFactoryImpl implements NumberFactory{

    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
