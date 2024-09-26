package com.instanceofcake.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamsWithString {


    public static void main(String[] args){
        String[] names = {"Adam","Zahaid","Max","Peter","Bon","Jon","Martha","Sub"};


  /*      Arrays.stream(names)
                .sorted()
                .forEach(System.out::println);*/


        Comparator<String> intComp = (x,y)-> Integer.compare(y.length(),x.length());

        Arrays.stream(names)
                .sorted(intComp)
                                .forEach(System.out::println);


 /*       Arrays.stream(names)
                .filter(x -> x.contains("b"))
                .forEach(System.out::println);
*/
        //     Arrays.stream(names)
      //          .forEach(x -> System.out.print(x+" "));

     //   Stream.of(names)
      //          .forEach(x -> System.out.print(x+ " "));

    }
}
