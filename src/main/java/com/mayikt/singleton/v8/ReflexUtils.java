package com.mayikt.singleton.v8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: ReflexUtils
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/117:51
 */
public class ReflexUtils {


    /**
     * 注入无参数构造函数
     *
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static UserEntity getReflexUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> classInfo = Class.forName("com.mayikt.singleton.v8.UserEntity");
        UserEntity userEntity = (UserEntity) classInfo.newInstance();
        return userEntity;
    }

    public static UserEntity getReflexUser(String userName, Integer age) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> classInfo = Class.forName("com.mayikt.singleton.v8.UserEntity");
        Constructor<?> declaredConstructor = classInfo.getDeclaredConstructor(String.class, Integer.class);
        Object mayikt = declaredConstructor.newInstance(userName, age);
        return (UserEntity) mayikt;
    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
//        UserEntity reflexUser = ReflexUtils.getReflexUser();
//        reflexUser.setUserName("zhangsan");
//        reflexUser.setAge(21);
//        System.out.println(reflexUser.toString());
//        UserEntity mayikt = ReflexUtils.getReflexUser("mayikt", 22);
//        System.out.println(mayikt.toString());

        Class<?> classInfo = Class.forName("com.mayikt.singleton.v8.UserEntity");
        Field[] declaredFields = classInfo.getDeclaredFields();
        Method[] declaredMethods = classInfo.getDeclaredMethods();


    }

}
