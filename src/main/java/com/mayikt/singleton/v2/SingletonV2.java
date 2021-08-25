package com.mayikt.singleton.v2;

import com.mayikt.singleton.v1.SingletonV1;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV2
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3020:53
 */
public class SingletonV2 {
    // 懒汉式 当真正需要使用该对象的时候才会被初始化 线程安全问题 但是效率非常低
    private static SingletonV2 singletonV2;

    //1.单例模式是否可以让程序猿初始化
    private SingletonV2() {

    }

    /**
     * 线程安全问题 在多线程情况下 可能会被初始化多次
     *
     * @return
     */
    public synchronized static SingletonV2 getSingletonV2() {
        //当第一次singletonV2 等于null 情况 才会被初始化
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        if (singletonV2 == null) {
            singletonV2 = new SingletonV2();
        }
        return singletonV2;
    }

    //100*3000s
    /**
     * 线程安全问题 当多个线程共享同一个数据 做写的操作的时候可能会出现线程安全问题 读不存在线程安全问题的
     * 分析下 懒汉时解决线程安全问题为什么效率比较低呢？ 确实因为同步 读和写都加上了锁
     * 因为第一次创建对象的时候才会加锁，之后获取该对象的时候不需要加锁。
     */
}
