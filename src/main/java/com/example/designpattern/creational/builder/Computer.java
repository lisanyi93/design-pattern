package com.example.designpattern.creational.builder;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 电脑
 * @Date: Created in 2021­02­19 19:32
 */
public class Computer {
    //cpu
    private String cpu;
    //主板
    private String mainBoard;
    //硬盘
    private String hardDisk;
    //显卡
    private String displayCard;
    //内存
    private String memory;


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDisplayCard() {
        return displayCard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", displayCard='" + displayCard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}