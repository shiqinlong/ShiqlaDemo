package com.shiqla.stand.demo.note.recursion;

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
 * Desc 斐波那契数列
 *          采用递归实现，性能比较低，不易理解
 * Auth c5285333
 * Date 2020-05-17
 */
public class Recursion
{

    public static void main(String[] args){
        System.out.println(f(5000));
    }

    /**
     * 递归方式
     * @param n
     * @return
     */
    public static int f(int n){
        if(n == 1 || n== 2){
            return n;
        }else{
            return f(n-2) + f(n-1);
        }
    }
}
