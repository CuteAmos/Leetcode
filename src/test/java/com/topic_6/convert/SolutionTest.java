package com.topic_6.convert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/12 11:01
 */
public class SolutionTest {

    @Test
    public void convert() {
        Solution solution = new Solution();
        System.out.println(solution.convert("ABCD", 2));
    }
}