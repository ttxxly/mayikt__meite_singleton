package com.mayikt.singleton.v9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: ReflexUtils
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/120:44
 */
public class ReflexUtils {

    public static UserEntity reflexUser() throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> classInfo = Class.forName("com.mayikt.singleton.v9.UserEntity");
        // 1.使用java的反射技术初始化对象 默认执行无参构造函数.. 执行无参构造函数..
//        Constructor<?> declaredConstructor = classInfo.getDeclaredConstructor();
        Constructor<?> declaredConstructor = classInfo.getDeclaredConstructor(String.class, Integer.class);
        declaredConstructor.setAccessible(true);
        UserEntity userEntity = (UserEntity) declaredConstructor.newInstance();
        return userEntity;
    }

    public static UserEntity reflexUser(String userName, Integer age) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> classInfo = Class.forName("com.mayikt.singleton.v9.UserEntity");
        // 1.使用java的反射技术初始化对象 默认执行无参构造函数.. 执行无参构造函数..
//        Constructor<?> declaredConstructor = classInfo.getDeclaredConstructor();
        Constructor<?> declaredConstructor = classInfo.getDeclaredConstructor(String.class, Integer.class);
        declaredConstructor.setAccessible(true);
        UserEntity userEntity = (UserEntity) declaredConstructor.newInstance(userName, age);
        return userEntity;
    }

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        UserEntity userEntity = ReflexUtils.reflexUser("zhangsan", 278);
//        System.out.println(userEntity.getAge() + "," + userEntity.getUserName());
        Class<?> classInfo = Class.forName("com.mayikt.singleton.v9.UserEntity");
        //java的反射技术可以给对象设置 执行方法
        Field[] fields = classInfo.getFields();


    }
}
