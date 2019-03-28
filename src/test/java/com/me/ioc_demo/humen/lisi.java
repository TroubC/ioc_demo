package com.me.ioc_demo.humen;

import com.me.ioc_demo.car.Car;

public class lisi extends HumenWithCar{

    public lisi(Car car) {
        super(car);
    }

    @Override
    public void gohome() {
        car.start();
        car.stop();
    }
}
