package com.me.ioc_demo.test;

import com.me.ioc_demo.IocContainer;
import com.me.ioc_demo.car.Audi;
import com.me.ioc_demo.car.Buick;
import com.me.ioc_demo.humen.Humen;
import com.me.ioc_demo.humen.HumenWithCar;
import com.me.ioc_demo.humen.lisi;
import com.me.ioc_demo.humen.zhangsan;
import org.junit.Before;
import org.junit.Test;

public class TestIoc {

    private IocContainer iocContainer = new IocContainer();

    @Before
    public void Before(){
        iocContainer.setBean(Audi.class,"audi");
        iocContainer.setBean(Buick.class,"buick");
        iocContainer.setBean(zhangsan.class,"zhangsan","audi");
        iocContainer.setBean(lisi.class,"lisi","buick");
    }

    @Test
    public void test(){
        Humen zhangsan = (Humen) iocContainer.getBean("zhangsan");
        zhangsan.gohome();
        Humen lisi = (Humen) iocContainer.getBean("lisi");
        lisi.gohome();
    }
}
