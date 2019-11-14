package com.topic_8.myAtoi;

/**
 * @author aixiaobai
 * @date 2019/11/14 10:00
 */
public class Solution {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() < 1) {
            return 0;
        }
        char first = str.charAt(0);
        int count = 0;
        StringBuffer res = new StringBuffer();
        if (str.length() == 1) {
            if (first >= '0' && first <= '9') {
                return Integer.parseInt(str);
            } else {
                return 0;
            }
        } else {
            if (first == '-') {
                str = str.substring(1);
                res.append('-');
            } else if (first == '+') {
                str = str.substring(1);
            }
            while(str.startsWith("0")){
                str = str.substring(1);
            }
            if(str.length()<1){
                return 0;
            }
            char c;
            while (count < str.length() && count< 11) {
                c = str.charAt(count);
                if (c >= '0' && c <= '9') {
                    res.append(c);
                    count++;
                } else {
                    break;
                }
            }
        }
        if (count < 1) {
            return 0;
        }
        long l = Long.parseLong(new String(res));
        if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) l;
        }

    }
}
