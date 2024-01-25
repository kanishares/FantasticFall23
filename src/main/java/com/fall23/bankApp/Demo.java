package com.fall23.bankApp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int [] nums = {5,4,1,3,7,8,9,5,1,2,3};
        //
        int num = 0;
        //       5
        //       4
        //       1
        //       1
        //       1
        //       5
        //       4
        //       3
        //       3

        for(int i =0;i < nums.length -1;i++){
            //       4
            //       1
            //       3
            //       7
            //       8
            //       4
            //       5
            //       3
            //       7
            //       8

            for(int p = i+1; p < nums.length;p++){
                //            5  > 4  true
                //         4 > 1  true
                //         1 > 3  false
                //         1 > 7 false
                //         1 > 8 false
                //         5 > 4 true
                //         4 > 5  false
                //         4 > 3 true
                //         3 > 7  false


                if ( nums[i] > nums[p]){
                    //       5
                    //       4
                    //       5
                    //       4
                    num = nums[i];
                    //  5  =  4
                    //  4  =  1
                    //   4 = 3
                    nums[i]= nums[p];
                    //  4 = 5  {4,5,1,3,7,8,9,5,1,2,3}
                    //  1 = 4  {1,5,4,3,7,8,9,5,1,2,3}
                    //  5      {1,4,5,3,7,8,9,5,1,2,3}
                    //         {1,3,5,4,7,8,9,5,1,2,3}
                    //         {1,1,5,4,7,8,9,5,3,2,3}


                    nums[p]=num;

                }

            }
        }
        System.out.println(Arrays.toString(nums));

        int nodoule = 0; // 0
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] !=nums[i+1]){
                //     0   =     1
                //     1   =     2
                //     2   =     3
                //     3   =     4
                //     4  =      5
                //     5 =       7
                //     6  =      8
                //     7  =      9
                nums[nodoule++]=nums[i];
            }
        }
        //     7        =
        nums[nodoule++] = nums[nums.length-1];
        for (int i = nodoule;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }

}
//                System.out.println(Arrays.toString(nums)); // [1, 1, 2, 3, 3, 4, 5, 5, 7, 8, 9]
//
//        Set<Integer> noDouble = new HashSet<>();
//        for (int jo : nums){
//            noDouble.add(jo);
//        }
//        int [] noDouble1 = new int[noDouble.size()];
//        int index = 0;
//        for (int num1 : noDouble){
//            noDouble1[index++] = num1;
//        }
//        System.out.println(Arrays.toString(noDouble1)); //[1, 2, 3, 4, 5, 7, 8, 9]
//
//            }
//        }
//
