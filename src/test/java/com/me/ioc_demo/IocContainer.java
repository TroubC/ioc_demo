package com.me.ioc_demo;

import org.springframework.util.ConcurrentReferenceHashMap;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IocContainer {
    private Map<String,Object> beans = new ConcurrentHashMap<String,Object>();

    //根据id获取一个bean
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    /**
     * 委托IOC创建一个bean
     * @param classz
     * @param beanId
     * @param paramBeanIds
     */
    public void setBean(Class<?> classz,String beanId,String... paramBeanIds){
        //1.组装构造方法所需的参数值
        Object [] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramBeanIds.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
            System.out.println("paramValues...."+paramValues[i]);
        }

        //2.调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : classz.getConstructors())
            try {
                bean = constructor.newInstance(paramValues);

            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        if (bean == null){
            throw new RuntimeException("找不到合适的构造方法去实例化bean");
        }

        //3.将实例化的bean放入beans
        beans.put(beanId,bean);
    }
}
