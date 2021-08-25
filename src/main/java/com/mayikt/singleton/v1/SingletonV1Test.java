package com.mayikt.singleton.v1;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: SingletonV1Test
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/3020:51
 */
public class SingletonV1Test {
    public static void main(String[] args) {
        SingletonV1 instance1 = SingletonV1.getInstance();
        SingletonV1 instance2 = SingletonV1.getInstance();
        System.out.println(instance1 == instance2);
    }
}
