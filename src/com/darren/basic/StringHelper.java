package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class StringHelper {
    /*
        ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��
     */
    public static String reverseString(String str, int startIndex, int endIndex) {
        char[] chars = str.toCharArray();
        int i = startIndex, j = endIndex;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
