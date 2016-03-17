package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    输入两个正整数m和n，求其最大公约数和最小公倍数。
    可有三种方法解答：
    1. 辗转相除法
    2. 相减法
    3. 穷举法
 */
public class GcdAndLcm {

    /*
        辗转相除法
        有两整数a和b：
            1. a%b得余数c
            2. 若c=0，则b即为两数的最大公约数
            3. 若c≠0，则a=b，b=c，再回去执行①
     */
    public static GcdLcmData getByDivision(int m, int n) {
        int a = m > n ? m : n;
        int b = m < n ? m : n;
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }

        GcdLcmData result = new GcdLcmData();
        result.gcd = b;
        result.lcm = m * n / b;

        return result;
    }

    /*
        相减法
        有两整数a和b：
            1. 若a>b，则a=a-b
            2. 若a<b，则b=b-a
            3. 若a=b，则a（或b）即为两数的最大公约数
            4. 若a≠b，则再回去执行①
     */
    public static GcdLcmData getBySubtraction(int m, int n) {
        int multiplication = m * n;
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }

        GcdLcmData result = new GcdLcmData();
        result.gcd = m;
        result.lcm = multiplication / m;

        return result;
    }

    /*
        穷举法
        有两整数a和b：
            1. 求出a和b的小值min
            2. 循环遍历min到1之间的数，如果a和b都能被该数整除，说明该数则为a和b的最大公约数
     */
    public static GcdLcmData getByLoop(int m, int n) {
        int min = m < n ? m : n;

        int gcd = 1;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
                break;
            }
        }

        GcdLcmData result = new GcdLcmData();
        result.gcd = gcd;
        result.lcm = m * n / gcd;

        return result;
    }
}