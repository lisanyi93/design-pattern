package com.example.designpattern.creational.builder;

/**
 * <p>Exclusive Copyright</p>
 *
 * @author lisanyi
 * @version 1.0
 * @Description： 建造者测试类
 * @Date: Created in 2021­02­19 19:43
 */
public class BuilderTest {

    public static void main(String[] args) {
        //建造类
        Builder builder = new BuilderImpl();
        //组装对象
        Assembler assembler = new Assembler();
        assembler.setBuilder(builder);
        Computer computer = assembler.createComputer("酷睿I7","华硕主板","希捷2T硬盘","英伟达显卡","威刚内存条8G");
        System.out.println(computer);
    }
}
