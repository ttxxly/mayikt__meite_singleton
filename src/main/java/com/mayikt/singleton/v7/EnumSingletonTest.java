package com.mayikt.singleton.v7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: EnumSingletonTest
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3022:04
 */
public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.add();
//        EnumSingleton[] values = instance1.values();
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }

        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton v3 = declaredConstructor.newInstance();
        System.out.println(v3 == instance1);
        EnumSingleton.INSTANCE.add();


    }
}
