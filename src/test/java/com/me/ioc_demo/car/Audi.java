package com.me.ioc_demo.car;

public class Audi implements Car{
    @Override
    public void start() {
        System.out.println("audi.启动汽车");
    }

    @Override
    public void stop() {
        System.out.println("audi.停止汽车");
    }

    @Override
    public void returnleft() {
        System.out.println("audi.向左转");
    }

    @Override
    public void returnright() {
        System.out.println("audi.向右转");
    }
}
