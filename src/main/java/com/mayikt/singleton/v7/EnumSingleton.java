package com.mayikt.singleton.v7;

public enum EnumSingleton {
    INSTANCE, MAYIKT;

    // 枚举能够绝对有效的防止实例化多次,和防止反射和序列化破解
    public void add() {
        System.out.println("add方法...");
    }
    // 枚举是如何初始化的？ 反序列化底层是如何解决防止单例被破解。
}
