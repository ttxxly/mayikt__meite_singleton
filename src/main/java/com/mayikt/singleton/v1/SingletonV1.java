package com.mayikt.singleton.v1;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: Singleton
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3020:46
 */
public class SingletonV1 {
    /**
     * 饿汉式 优点：先天性线程安全 为什么先天性 当类加载的时候 就被创建该对象 。
     * 缺点：如果项目使用过多的饿汉式会发生问题，项目在启动的时候会边的非常慢、存放在方法区占用内存比较大
     * 如果用户不使用该对象的时候，也会被提前创建好,
     */
    private static SingletonV1 singletonV1 = new SingletonV1();

    //1.单例模式是否可以让程序猿初始化
    private SingletonV1() {

    }

    /**
     * 返回该对象的实例
     *
     * @return
     */
    public static SingletonV1 getInstance() {
        return singletonV1;
    }

}
