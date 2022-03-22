package com.yang.creation.builder;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class Computer {

    /**
     * cpu-- 必须
     */
    private String cpu;
    /**
     * 内存-- 必须
     */
    private String ram;
    /**
     * 硬盘-- 必须
     */
    private String disk;
    /**
     * 键盘--非必需
     */
    private String keyboard;
    /**
     * 鼠标--非必需
     */
    private String mouse;
    /**
     * 显示器--非必需
     */
    private String monitor;

    public Computer(String cpu,String ram,String disk){
        this.cpu = cpu;
        this.disk = disk;
        this.ram =ram;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
