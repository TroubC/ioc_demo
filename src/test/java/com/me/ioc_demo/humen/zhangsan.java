package com.me.ioc_demo.humen;

import com.me.ioc_demo.car.Car;

public class zhangsan extends HumenWithCar {

    public zhangsan(Car car) {
        super(car);
    }

    @Override
    public void gohome() {
        car.start();
        car.returnright();
        car.returnleft();
        car.stop();
    }
}
