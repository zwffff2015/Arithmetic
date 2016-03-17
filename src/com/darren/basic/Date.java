package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���
    ��Ҫע��һ�¼��㣺
    1.��Ҫ�ж��Ƿ�Ϊ����
    2.��Ҫ��������·ݺ����������ϸ���ж�
 */
public class Date {
    public static int getWhichDay(int year, int month, int day) {
        if (year <= 0) {
            System.out.println("��ݲ���С�ڵ���0");
            return 0;
        }

        if (month <= 0 || month > 12) {
            System.out.println("�·ݱ���Ϊ1��12");
            return 0;
        }

        if (month <= 0 || month > 12) {
            System.out.println("�·ݱ���Ϊ1��12");
            return 0;
        }

        if (day <= 0) {
            System.out.println("�����������0");
            return 0;
        }

        Boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            System.out.println("��ǰ�·�Ϊ" + month + ",�������ܴ���31");
            return 0;
        }

        if ((month == 2) && day > (isLeapYear ? 29 : 28)) {
            System.out.printf("��ǰ��ݣ�%1$s%2$sΪ����,��ǰ�·�Ϊ��%3$d,�������ܴ���%4$d\n", year, isLeapYear ? "" : "��", month, isLeapYear ? 29 : 28);
            return 0;
        }

        if ((month == 4 || month == 6 || month == 8 || month == 10) && day > 30) {
            System.out.println("��ǰ�·�Ϊ" + month + ",�������ܴ���30");
            return 0;
        }

        int[] monthDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            if (i != 2)
                totalDays += monthDays[i];
            else
                totalDays += isLeapYear ? monthDays[i] + 1 : monthDays[i];
        }
        totalDays += day;
        return totalDays;
    }
}
