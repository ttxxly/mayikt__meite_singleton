package com.mayikt.singleton.v4;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV5
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3021:35
 */
public class SingletonV5 {
    private SingletonV5() {
        System.out.println("构造函数被初始化...");
    }

    public static SingletonV5 getInstance() {
        return SingletonV5Utils.singletonV5;
    }

    // 在类里面嵌套的
    private static class SingletonV5Utils {
        private static final SingletonV5 singletonV5 = new SingletonV5();
    }

    /**
     * 内部类在调用的时候才会初始化singletonV5
     * static 静态 保证唯一
     * @param args
     */



    // 静态内部类特征：继承懒汉式和饿汉式优点、同时解决双重检验锁第一次加载慢的问题 读和写都不需要同步效率非常高...
    public static void main(String[] args) {
        System.out.println("项目启动成功...");
        SingletonV5 instance1 = SingletonV5.getInstance();
        SingletonV5 instance2 = SingletonV5.getInstance();
        System.out.println(instance1 == instance2);
    }
}
