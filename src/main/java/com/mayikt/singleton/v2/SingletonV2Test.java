package com.mayikt.singleton.v2;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV2Test
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3020:57
 */
public class SingletonV2Test {
    public static void main(String[] args) {
//        SingletonV2 singletonV1 = SingletonV2.getSingletonV2();
//        SingletonV2 singletonV2 = SingletonV2.getSingletonV2();
//        System.out.println(singletonV1 == singletonV2);
        // 如何去模拟高并发情况下 懒汉式线程安全问题
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonV2 singletonV1 = SingletonV2.getSingletonV2();
                    System.out.println(Thread.currentThread().getName() + "," + singletonV1);
                }
            }).start();
        }
    }
}
