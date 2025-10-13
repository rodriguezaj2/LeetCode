package SelfCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static class Solution{
        public int [] twoSum(int[] nums, int target){
            Map <Integer, Integer> seen = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                int need = target - x;

                if(seen.containsKey(need)){
                    return new int[] {seen.get(need),i};
                }

                seen.put(x,i);
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {

        Solution sol=new Solution();
        int[] nums= {2,7,11,15};
        int target=9;

        int [] result = sol.twoSum(nums,target);
        System.out.println(Arrays.toString(result));


    }
}
