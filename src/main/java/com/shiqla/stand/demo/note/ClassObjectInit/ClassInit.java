package com.shiqla.stand.demo.note.ClassObjectInit;

/** 类初始化
 *      源码编译之后会在字节码中加入<clinit>方法，JVM在类初始化的过程中会执行此方法
 *      初始化时机：
 *          在new 一个对象的时候
 *          main 所在的类，也会被初始化
 *      初始化内容：
 *          先父类再子类
 *          然后执行静态变量，以及静态代码块，根据定义顺序来执行。
 *  实例初始化
 *      源码编译之后字节码加入<init>方法,用来实例初始化
 *      初始化时机：new 对象
 *      初始化内容：
 *          先调用super()方法，初始化父类实例，
 *          然后执行非静态的变量，和非静态代码块，按照顺序执行，然后在执行构造器
 *  不会重写的方法：
 *      fianl 方法
 *      静态方法
 *      private方法
 * Desc
 * Auth c5285333
 * Date 2020-05-17
 */
public class ClassInit extends com.shiqla.note.ClassObjectInit.ClassInitFater
{

    public static void main(String[] args){

    }
}
