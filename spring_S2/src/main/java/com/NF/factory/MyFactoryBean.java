package com.NF.factory;

import com.NF.bean.Person;
import org.springframework.beans.factory.FactoryBean;


/**
 * 此方式是spring创建bean方式的一种补充，用户可以按照需求创建对象，
 * 创建的对象交由spring IOC容器来进行管理，无论是否是单例，都是在
 * 用到的时候才会创建该对象，不用该对象不会创建
 */
public class MyFactoryBean implements FactoryBean<Person> {

    /**
     * @return 返回获取的bean
     * @throws Exception
     */
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("王五");
        return person;
    }

    /**
     * @return 获取返回bean的类型
     */
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * @return 判断当前bean是否为单例
     */
    public boolean isSingleton() {
        return false;
    }
}
