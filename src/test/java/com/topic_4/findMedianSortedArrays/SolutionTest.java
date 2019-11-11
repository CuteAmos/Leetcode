package com.topic_4.findMedianSortedArrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{2, 3, 4}, new int[]{3,9}));
    }
}