package com.mayikt.singleton.v10;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: EnumSingletonTest
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/121:01
 */
public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        EnumSingleton instance1 = EnumSingleton.INSTANCE;
//        EnumSingleton instance2 = EnumSingleton.INSTANCE;
//        System.out.println(instance1 == instance2);
//        // 单例七种的，为什么枚举是最好的呢？防止java的反射和序列化破解
//        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
//        // 没有无参构造函数...
//        Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor();
//        EnumSingleton enumSingleton = declaredConstructor.newInstance();
//        enumSingleton.add();
//       枚举底层是如何实现的
//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        EnumSingleton.INSTANCE.add();
//        // 存放枚举的对象..
//        EnumSingleton[] values = EnumSingleton.values();
        // 1.使用java的反射技术执行 枚举的有参构造函数..
        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        // 2.查找当前类是否有该构造函数..
        Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        // 3.调用反射方法初始化对象
        EnumSingleton enumSingleton = declaredConstructor.newInstance("zhangsan", 20);
        enumSingleton.add();

    }
    /**
     *  EnumSingleton.INSTANCE 是一个对象...  类  如何初始化呢？ 定义的枚举最终底层肯定是一个类  枚举在底层肯定转换为类
     *
     *  编译器会实现优化 底层会转换类
     */
}
