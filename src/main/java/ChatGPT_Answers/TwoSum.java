package ChatGPT_Answers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


       public static class Solution {
            public int[] twoSum(int[] nums, int target) {
                Map<Integer, Integer> seen = new HashMap<>(); // value -> index
                for (int i = 0; i < nums.length; i++) {
                    int x = nums[i];
                    int need = target - x;
                    if (seen.containsKey(need)) {
                        return new int[] { seen.get(need), i };
                        //returns the index where 'need' is located as well as current index
                    }

                    seen.put(x, i);
                }
                // Per constraints, there is always exactly one answer
                return new int[]{};
            }



    }
    public static void main(String[] args) {

        Solution sol = new Solution();

        int [] nums = {2,7,11,15};
        int target= 9;

        int [] result = sol.twoSum(nums,target);

        System.out.println(Arrays.toString(result));

    }


}


/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to
target. You may assume that each input would have exactly one solution,
and you may not use the same element twice. You can return the answer in any order
*/
