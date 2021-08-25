package com.mayikt.singleton.v6;

import com.mayikt.singleton.v1.SingletonV1;

import java.io.*;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV6
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3021:55
 */
public class SingletonV6 implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // java的序列化技术 目的：
        /**
         * 对象从内存写入到硬盘中 序列化
         * 从硬盘中读取到内存 反序列化
         */
        SingletonV6 instance1 = SingletonV6.getInstance();
        FileOutputStream fos = new FileOutputStream("E:\\code\\Singleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        oos.flush();
        oos.close();

        // 反序列化
        FileInputStream fis = new FileInputStream("E:\\code\\Singleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonV6 instance2 = (SingletonV6) ois.readObject();
        System.out.println(instance1 == instance2);
    }

    /**
     * 饿汉式 优点：先天性线程安全 为什么先天性 当类加载的时候 就被创建该对象 。
     * 缺点：如果项目使用过多的饿汉式会发生问题，项目在启动的时候会边的非常慢、存放在方法区占用内存比较大
     * 如果用户不使用该对象的时候，也会被提前创建好,
     */
    private static SingletonV6 singletonV6 = new SingletonV6();

    //1.单例模式是否可以让程序猿初始化
    private SingletonV6() {

    }

    /**
     * 返回该对象的实例
     *
     * @return
     */
    public static SingletonV6 getInstance() {
        return singletonV6;
    }

    //返回序列化获取对象 ，保证为单例
    public Object readResolve() {
        return singletonV6;
    }

    // 问题：周日公开课中... 老师亲自给解答源码 枚举和

}
