package com.mayikt.singleton.v3;

import com.mayikt.singleton.v2.SingletonV2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV3Test
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3021:29
 */
public class SingletonV3Test {
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 100; i++) {
////            new Thread(new Runnable() {
////                public void run() {
////                    SingletonV3 singletonV3 = SingletonV3.getSingletonV3();
////                    System.out.println(Thread.currentThread().getName() + "," + singletonV3);
////                }
////            }).start();
////        }
        // 单例基本原则；保证在单个jvm中不重复创建
        SingletonV3 singletonV1 = SingletonV3.getSingletonV3();
        //  如何去破解单例  使用java的反射技术 、序列化技术
        Constructor<SingletonV3> declaredConstructor = SingletonV3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        // 使用java的反射技术创建
        SingletonV3 singletonV2 = declaredConstructor.newInstance();
        System.out.println(singletonV1 == singletonV2);
        // 如何防御反射技术破解单例
    }
}
