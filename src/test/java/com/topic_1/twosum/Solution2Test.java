package com.topic_1.twosum;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void twoSum() {
        Solution2 solution2 = new Solution2();
        int[] ints = solution2.twoSum(new int[]{2, 5, 6, 8}, 10);
        System.out.println(Arrays.toString(ints));
    }
}