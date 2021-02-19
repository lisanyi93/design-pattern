package com.example.designpattern.creational.builder;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 建造类
 * @Date: Created in 2021­02­19 19:32
 */
public abstract class Builder {

    public abstract void buildCPU(String cpu);

    public abstract void buildMainBoard(String mainBoard);

    public abstract void buildHardDisk(String hardDisk);

    public abstract void buildDisplayCard(String displayCard);

    public abstract void buildMemory(String memory);

    public abstract Computer createComputer();
}
