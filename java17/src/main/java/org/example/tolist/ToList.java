package org.example.tolist;

import java.util.LinkedList;
import java.util.List;

public class ToList {

    public static void main(String[] args) {

//        List<Integer> integers = List.of(1, 2, 3, 4)
//                .stream()
//                .toList();

        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }


    public  static int removeDuplicates(int[] nums) {

        int k = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            int next = nums[i];
            if (current != next) {
                nums[k] = next;
                k ++;
            }
        }
        return k;
    }

}
