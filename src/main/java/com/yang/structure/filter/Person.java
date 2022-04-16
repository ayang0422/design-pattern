package com.yang.structure.filter;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月16日
 */
public class Person {
    private String name;
    /**
     * 0男 1女
     */
    private Integer gender;
    /**
     * 0未婚 1已婚
     */
    private Integer maritalStatus;

    public Person(String name,Integer gender,Integer maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public Integer getGender() {
        return gender;
    }
    public Integer getMaritalStatus() {
        return maritalStatus;
    }
}
