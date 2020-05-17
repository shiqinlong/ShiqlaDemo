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
 * Desc 懒汉模式，采用构造方法去创建单例对象，线程不安全,如果要保证线程安全，需要加锁。
 * Auth c5285333
 * Date 2020-05-17
 */
public class SingletonLazy
{
    private static SingletonLazy INSTANCE;

    private SingletonLazy ()
    {

    }

    /**
     * 双重检查锁，一定程度保证线程安全，因为指令重排的原因，但是比单锁效率高
     * @return
     */
    public static SingletonLazy getInstance ()
    {
        if (INSTANCE == null) {

            synchronized(SingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 加入检查锁，一定程度保证线程安全，但是锁块比较大，影响性能。
     * @return
     */
    public static SingletonLazy getInstance1(){
        synchronized(SingletonLazy.class) {
            if (INSTANCE == null) {
                INSTANCE = new SingletonLazy();
            }
        }
        return INSTANCE;
    }
}
