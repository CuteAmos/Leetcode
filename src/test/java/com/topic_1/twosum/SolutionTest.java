package com.topic_1.twosum;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 5, 6, 8}, 10);
        System.out.println(Arrays.toString(ints));
    }
}