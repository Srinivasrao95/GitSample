package com.frameworkpractiesession;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreams {

    public static void main(String[] args){

        List<String> names=new ArrayList<String>();
        names.add("Adam");
        names.add("Alex");
        names.add("Dex");
        names.add("bottleneck");
        names.add("Alooveer");

       long x= names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(x);
        names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));
        names.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));
        System.out.println("____________");
        names.stream().filter(s->s.endsWith("x")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("--------");

        List<String> name= Arrays.asList("Abhijeeth","Ram","Rahul","Praddep","Mani");
        name.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        System.out.println("-------");
        List<Integer> values=Arrays.asList(1,4,66,8,7,4);
        values.stream().distinct().sorted().forEach(s-> System.out.print(s+","));
    }
}
