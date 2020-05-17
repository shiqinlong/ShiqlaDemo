package com.shiqla.stand.demo.note;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-15
 */
public class Demo1Class
{

    public static void main (String[] args)
    {
        synchronized("lock"){

        }
        System.out.println("test");

        List list = new ArrayList();

        list.add(22);
        list.add(23);
        list.add(12);
        list.add(25);
        list.add(27);
        list.add(12);
        list.add(32);
        list.add(41);

        System.out.println(test1(list,(x) -> (int)x >= 40));

    }

    public static List  test1(List list, Predicate predicate){

        List list1 = new ArrayList();

        for (Object o : list) {
            if(predicate.test(o))
            list1.add(o);
        }
        return list1;
    }

    public void test2(){
        Consumer<String> consumer = (x) -> System.out.println(x);
        Consumer<String> consumer1 = System.out::println;

        consumer1.accept("shiqinlong");
    }

    public void test3(){
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(20,31));

        Supplier<String> stringSupplier = String::new;

        Function<String,String> function = String::new;

        System.out.println(function.apply("string").toLowerCase());

    }


    public void test4(){

    }
}
