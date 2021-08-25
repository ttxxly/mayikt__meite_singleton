package com.mayikt.singleton.v3;

import com.mayikt.singleton.v2.SingletonV2;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV3
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3021:12
 */
public class SingletonV3 {
    /**
     * volatile 防止重排序 java内存模型 增加可见性
     */
    private volatile static SingletonV3 singletonV3;

    // 双重检验锁 解决懒汉式 读和写都加上锁的问题 缺点 第一次创建对象可能会比较慢
    // 如何解决 写和读 都不加锁 还能够保证唯一性 线程安全问题
    private SingletonV3() throws Exception {
        if (singletonV3 != null) {
            throw new Exception("对象已经被初始化..");
        }
        System.out.println("SingletonV3被初始化...");
    }

//    /**
//     * 读的不加锁的，写的时候才会加锁。。
//     */
    public static SingletonV3 getSingletonV3() throws Exception {
        // 当多个线程 同时在可能new 对象的时候 才会加锁，保证线程问题。
        if (singletonV3 == null) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            synchronized (SingletonV3.class) {
                if (singletonV3 == null) { // 当前线程已经获取到锁的呢，在判断一下该对象是否已经初始化过，没有初始化过的 创建
                    singletonV3 = new SingletonV3();
                }
            }
        }
        return singletonV3;
    }
    // 双重检验锁目的什么？ 解决懒汉式获取对象效率问题。
    /**
     *  如果 if singletonV3 == null 比较巧  正好有10个线程进入到呢 25行代码获取锁
     *  因为synchronized 保证线程问题，只需要有一个线程获取锁，
     */

}
