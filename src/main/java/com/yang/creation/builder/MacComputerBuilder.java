package com.yang.creation.builder;

import java.util.concurrent.CompletableFuture;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年03月22日
 */
public class MacComputerBuilder extends ComputerBuilder{

    private Computer computer;

    public MacComputerBuilder(String cpu,String ram,String disk){
        computer = new Computer(cpu,ram,disk);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("妙控键盘");
    }

    @Override
    public void setMouse() {
        computer.setKeyboard("妙控鼠标");
    }

    @Override
    public void setMonitor() {
        computer.setKeyboard("视网膜屏");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
