package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    ��������������m��n���������Լ������С��������
    �������ַ������
    1. շת�����
    2. �����
    3. ��ٷ�
 */
public class GcdAndLcm {

    /*
        շת�����
        ��������a��b��
            1. a%b������c
            2. ��c=0����b��Ϊ���������Լ��
            3. ��c��0����a=b��b=c���ٻ�ȥִ�Т�
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
        �����
        ��������a��b��
            1. ��a>b����a=a-b
            2. ��a<b����b=b-a
            3. ��a=b����a����b����Ϊ���������Լ��
            4. ��a��b�����ٻ�ȥִ�Т�
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
        ��ٷ�
        ��������a��b��
            1. ���a��b��Сֵmin
            2. ѭ������min��1֮����������a��b���ܱ�����������˵��������Ϊa��b�����Լ��
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