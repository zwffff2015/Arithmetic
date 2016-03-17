package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
/*
    输入某年某月某日，判断这一天是这一年的第几天
    需要注意一下几点：
    1.需要判断是否为闰年
    2.需要对输入的月份和天数进行严格的判断
 */
public class Date {
    public static int getWhichDay(int year, int month, int day) {
        if (year <= 0) {
            System.out.println("年份不能小于等于0");
            return 0;
        }

        if (month <= 0 || month > 12) {
            System.out.println("月份必须为1至12");
            return 0;
        }

        if (month <= 0 || month > 12) {
            System.out.println("月份必须为1至12");
            return 0;
        }

        if (day <= 0) {
            System.out.println("天数必须大于0");
            return 0;
        }

        Boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            System.out.println("当前月份为" + month + ",天数不能大于31");
            return 0;
        }

        if ((month == 2) && day > (isLeapYear ? 29 : 28)) {
            System.out.printf("当前年份：%1$s%2$s为闰年,当前月份为：%3$d,天数不能大于%4$d\n", year, isLeapYear ? "" : "不", month, isLeapYear ? 29 : 28);
            return 0;
        }

        if ((month == 4 || month == 6 || month == 8 || month == 10) && day > 30) {
            System.out.println("当前月份为" + month + ",天数不能大于30");
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
