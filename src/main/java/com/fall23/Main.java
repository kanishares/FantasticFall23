package com.fall23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3}; // target (5)

        System.out.println(Arrays.toString(getTargetIndex(nums,5)));
    }

    static int [] getTargetIndex(int[] nums, int target) {
        int [] res = new int[2];
         for (int i = 0; i < nums.length; i++){
             for(int j =i+1; j < nums.length; j++){
             if( nums[i] + nums[j] == target){
                 res[0] =i;
                 res [1] = j;
             }
             }

        }
         return res;
    }
}