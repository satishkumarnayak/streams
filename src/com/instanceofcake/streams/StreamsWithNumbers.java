package com.instanceofcake.streams;

import java.util.Arrays;
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

        IntStream.range(0,10).filter(x -> x % 2 == 0).forEach(System.out::println);


















    }

}
