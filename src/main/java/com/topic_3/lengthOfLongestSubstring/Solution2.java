package com.topic_3.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map =  new HashMap<>();
        int max = 0;
        int count = 0;
        int temp = 0;
        for(int i = 0;i<chars.length;i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i],i);
                count++;
            }else{
                max = max>count?max:count;
                temp = i -map.get(chars[i]);
                if(temp>count){
                    count++;
                }else{
                    count = temp;
                }
                map.put(chars[i],i);
            }
        }
        return   max=max>count?max:count;
    }
}
