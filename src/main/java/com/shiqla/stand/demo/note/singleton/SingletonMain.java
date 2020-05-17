package com.shiqla.stand.demo.note.singleton;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃  神兽保佑
 * 　　　　┃　　　┃  代码无bug
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * Desc 饿汉模式： 类加载的时候直接创建单例对象
 *         1 直接初始化
 *         2 采用枚举
 *         3 采用静态代码块
 *      懒汉模式：需要的时候再创建单例对象
 *
 * Auth c5285333
 * Date 2020-05-17
 */
public class SingletonMain
{
    public static void main(String[] args){
        SingletonDirectly singleton1 = SingletonDirectly.INSTANCE;

        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
    }
}
