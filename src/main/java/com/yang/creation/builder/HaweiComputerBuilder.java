package com.yang.creation.builder;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class HaweiComputerBuilder extends ComputerBuilder{

    private Computer computer;

    public HaweiComputerBuilder(String cpu, String ram, String disk){
        computer = new Computer(cpu,ram,disk);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("键盘");
    }

    @Override
    public void setMouse() {
        computer.setKeyboard("鼠标");
    }

    @Override
    public void setMonitor() {
        computer.setKeyboard("4k");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
