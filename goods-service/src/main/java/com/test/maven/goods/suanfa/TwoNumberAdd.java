package com.test.maven.goods.suanfa;

import java.util.HashMap;
import java.util.Map;


/**
 * 两数之和
 * @param ints {2,7,15,11}
 * @param sum 22
 * @return 得到7,15的索引  最终结果是  1,2
 */
public class TwoNumberAdd {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] i = {2, 7, 11, 15};
        int target = 26;
        long start = System.currentTimeMillis();
        System.out.println("start：" + start);
        int[] ints = twoSumMy3(i, target);
        System.out.println("end：" + (System.currentTimeMillis() - start));
    }

    public static int[] twoSumMy3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int element = target - nums[i];
            if(map.containsKey(element)){
                return new int[]{i, map.get(element)};
            } else{
                map.put(nums[i], i);
            }

        }
        return null;
    }

    public static int[] twoSumMy2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if(map.containsKey(element) && map.get(element) != i){
                return new int[]{i, map.get(element)};
            }
        }
        return null;
    }

    public static int[] twoSumMy1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(target == (nums[j] + num)){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
