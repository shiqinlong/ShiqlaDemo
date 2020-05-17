package com.shiqla.stand.demo.note;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-16
 */
public class StreamAPITest
    {

    public static List<String> list = new ArrayList<>();

    static {
        list.add("shi");
        list.add("qin");
        list.add("long");
        list.add("cai");
        list.add("wen");
        list.add("wen");
    }

    public static void test1 ()
    {
        List list1 = list.stream().limit(5).filter((e) -> e.startsWith("c")).sorted(String::compareTo).collect(
            Collectors.toList());
        System.out.println(list1);

        list.stream().map((e) ->
            e.charAt(0)
        ).forEach(System.out::println);

        list.stream().flatMap((e)->{
            char[] chars = e.toCharArray();
            return Stream.of(chars);
        }).forEach(System.out::println);

        System.out.println(list.stream().max(String::compareTo));

        list.parallelStream();
    }

    public static void main (String[] args)
    {
        StreamAPITest.test1();
    }

}
