package com.me.ioc_demo.humen;

import com.me.ioc_demo.car.Car;

public abstract class HumenWithCar implements Humen{
    protected Car car;

    public HumenWithCar(Car car) {
        this.car = car;
    }

    @Override
    public abstract void gohome();
}
