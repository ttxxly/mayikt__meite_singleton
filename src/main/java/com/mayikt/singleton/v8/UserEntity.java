package com.mayikt.singleton.v8;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: UserEntity
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/117:52
 */
public class UserEntity {
    private String userName;
    private Integer age;

    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.userName + "," + this.age;
    }
}
