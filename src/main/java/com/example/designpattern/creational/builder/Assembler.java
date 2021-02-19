package com.example.designpattern.creational.builder;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 组装者
 * @Date: Created in 2021­02­19 19:48
 */
public class Assembler {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Computer createComputer(String cpu,String mainBoard,
                                   String hardDisk,String displayCard,String memory){
        this.builder.buildCPU(cpu);
        this.builder.buildMainBoard(mainBoard);
        this.builder.buildHardDisk(hardDisk);
        this.builder.buildDisplayCard(displayCard);
        this.builder.buildMemory(memory);
        return this.builder.createComputer();
    }
}
