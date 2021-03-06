package com.topic_5.longestPalindrome;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author aixiaobai
 * @date 2019/11/11 17:38
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 1) {
            return "";
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int maxLen = 0;
        String maxStr = "";
        for (int i = 1; i < len ; i++) {
            for (int j = 1; ; j++) {
                if (i - j < 0 || i + j > len - 1) {
                    break;
                }
                if (chars[i - j] == chars[i + j]) {
                    if (j * 2 + 1 > maxLen) {
                        maxLen = j * 2 + 1;
                        maxStr = new String(chars, i - j, maxLen);
                    }
                } else {
                    break;
                }
            }
            for (int k = 1; ; k++) {
                if (i - k < 0 || i + k > len) {
                    break;
                }
                if (chars[i - k] == chars[i + k - 1]) {
                    if (k * 2 > maxLen) {
                        maxLen = k * 2;
                        maxStr = new String(chars, i - k, maxLen);
                    }
                } else {
                    break;
                }
            }
        }
        if (maxStr.length() < 1) {
            return new String(chars, 0, 1);
        } else {
            return maxStr;
        }
    }
}
