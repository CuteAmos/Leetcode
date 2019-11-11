package com.topic_1.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 1)return null;
        Map<Integer,Integer> map =new HashMap<>();
        map.put(nums[0],0);
        for(int i = 1;i<nums.length;i++){
            if(map.containsKey(target - nums[i]))return new int[]{map.get(target - nums[i]),i};
            map.put(nums[i],i);
        }
        return null;
    }
}
