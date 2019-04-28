package com.xuming.springcloud.serviceconsumer9001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yuanqi on 2019/4/25.
 */
public class lambdaStreamTest {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        filtered.stream().forEach(System.out::println);


        System.out.println("-------------------------------------");

        //用数组来转换集合
        List<Integer> list = Arrays.asList(9,3,3);
        //distinct()函数，是去重复函数
        list = list.stream().distinct().map(i -> i*i).collect(Collectors.toList());
        //打印输出list
        list.forEach(System.out::println);

    }


}
