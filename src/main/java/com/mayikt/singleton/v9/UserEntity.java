package com.mayikt.singleton.v9;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: UserEntity
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/120:43
 */
public class UserEntity {
    private String userName;
    private Integer age;

    //    private UserEntity() {
//        System.out.println("无参构造函数执行。。");
//    }
    private UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
