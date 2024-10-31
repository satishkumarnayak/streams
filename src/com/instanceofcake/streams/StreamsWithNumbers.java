package com.instanceofcake.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsWithNumbers {

    public static void main(String[] args){


        // Before Streams
        int sum = 0;
        int[] nums = {1,2,2,1,2,0,2};
        for(int i = 0; i < nums.length; i++){
   //         System.out.println(nums[i]);
            sum = sum + nums[i];
        }

   //     System.out.println(sum);


        // Using Streams

  //     Arrays.stream(nums)
   //                    .forEach(System.out::println);

        sum = Arrays.stream(nums)
                .sum();
    //    System.out.println(sum);



        // More

     //   IntStream.range(0,5).forEach(x -> System.out.print(x+" "));

  //      IntStream.range(0,10).filter(x -> x % 2 == 0).forEach(System.out::println);
      // sum of list of numbers
        List<Integer> numbers = List.of(11,12,24,10,26,53,82);


        Optional<Integer> res = numbers.stream().reduce((a, b) -> a + b);

        int sum1 = numbers.stream().mapToInt(x -> x).sum();
   //         System.out.println(sum1);


       res = numbers.stream().reduce(Integer::sum);
  //      System.out.println(res.get());

        // average of numbers
        OptionalDouble average = numbers.stream().mapToDouble(a -> a).average();
    //    System.out.println(average.getAsDouble());


        // print even and odd

        List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
   //     System.out.println(even);

  //      numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

        // print numbers starts with 1

 //       numbers.stream().map(x->x.toString()).filter(x->x.startsWith("1")).forEach(System.out::println);

        // ignore first 5 numbers
      //  numbers.stream().skip(5).forEach(System.out::println);

        //stats

        DoubleSummaryStatistics doubleSummaryStatistics = numbers.stream().mapToDouble(x -> x).summaryStatistics();
  //      System.out.println(doubleSummaryStatistics);

        // max and min
        Integer i = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
    //    System.out.println(i);

        Integer j = numbers.stream().sorted(Comparator.naturalOrder()).findFirst().get();
    //    System.out.println(j);

        // asc and desc

   //     numbers.stream().sorted().forEach(System.out::println);

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
