package com.instanceofcake.numbers;

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

       Arrays.stream(nums)
                       .forEach(System.out::println);

        sum = Arrays.stream(nums)
                .sum();
        System.out.println(sum);


    }

}
