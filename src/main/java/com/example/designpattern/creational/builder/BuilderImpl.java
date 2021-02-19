package com.example.designpattern.creational.builder;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 建造者实现类
 * @Date: Created in 2021­02­19 19:40
 */
public class BuilderImpl  extends Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buildDisplayCard(String displayCard) {
        computer.setDisplayCard(displayCard);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
