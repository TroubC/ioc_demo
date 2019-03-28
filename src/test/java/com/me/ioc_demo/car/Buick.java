package com.me.ioc_demo.car;

public class Buick implements Car{

    @Override
    public void start() {
        System.out.println("buick.启动汽车");
    }

    @Override
    public void stop() {
        System.out.println("buick.停止汽车");
    }

    @Override
    public void returnleft() {
        System.out.println("buick.向左转");
    }

    @Override
    public void returnright() {
        System.out.println("buick.向右转");
    }
}
