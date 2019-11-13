package com.topic_6.convert;


/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 * @author aixiaobai
 * @date 2019/11/12 10:30
 */
public class Solution {
    public java.lang.String convert(String s, int numRows) {
        if (s.length() < 1 || numRows < 1) {
            return "";
        } else if (numRows == 1) {
            return s;
        }
        int total = numRows * 2 - 2;
        int loop = (s.length() + total - 1) / total;
        char[] chars = new char[total * loop];
        int row;
        int col;
        int temp;
        for (int i = 0; i < s.length(); i++) {
            col = i / total + 1;
            row = (i + 1) % total;
            if (row <= numRows && row > 0) {
                if (row == 1) {
                    chars[col - 1] = s.charAt(i);
                } else if (row == numRows) {
                    chars[loop * (row * 2 - 3) + col - 1] = s.charAt(i);
                } else {
                    chars[loop * (row * 2 - 3) + 2 * (col - 1)] = s.charAt(i);
                }
            } else if (row != 0) {
                temp = total - row + 1;
                chars[loop * (temp * 2 - 1) + 2 * (col - 1) + 1] = s.charAt(i);
            } else if(numRows != 2){
                chars[loop + (col - 1) * 2 + 1] = s.charAt(i);
            }else{
                chars[loop + col - 1 ] = s.charAt(i);
            }
        }
        return new String(chars).replaceAll("\u0000","");
    }
}
