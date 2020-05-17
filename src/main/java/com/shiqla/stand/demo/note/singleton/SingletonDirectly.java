package com.shiqla.stand.demo.note.singleton;

/**
 * Desc 饿汉模式，直接构造单例模式
 * Auth c5285333
 * Date 2020-05-17
 */
public class SingletonDirectly
{
    public static final SingletonDirectly INSTANCE = new SingletonDirectly();


    private SingletonDirectly (){
        System.out.println("create a singleton object");
    }

}
