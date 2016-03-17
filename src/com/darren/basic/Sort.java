package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Sort {
    /*
        冒泡排序：时间复杂度为n^2
        在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /*
        选择排序：
        在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     */
    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    /*
        快速排序：
        快速排序采用的思想是分治思想。
        快速排序是找出一个元素（理论上可以随便找一个）作为基准(pivot),然后对数组进行分区操作,使基准左边元素的值都不大于基准值,基准右边的元素值 都不小于基准值，如此作为基准的元素调整到排序后的正确位置。递归快速排序，将其他n-1个元素也调整到排序后的正确位置。最后每个元素都是在排序后的正 确位置，排序完成。所以快速排序算法的核心算法是分区操作，即如何调整基准的位置以及调整返回基准的最终位置以便分治递归。
     */
    public static int[] quickSort(int[] arr, int left, int right) {
        if (left >= right) return arr;

        int baseNumber = arr[left];
        int i = left, j = right;
        while (i != j) {
            while (arr[j] >= baseNumber && j > i) {
                j--;
            }
            while (arr[i] <= baseNumber && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = baseNumber;

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
        return arr;
    }

    /*
        直接插入排序：时间复杂度为n^2
        将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
     */
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i - 1;
                int temp = arr[i];
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    /*
        二分插入排序：时间复杂度为n^2
     */
    public static int[] halfInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i - 1;
                int temp = arr[i];
                int left = 0, right = j;
                while (left <= right) {
                    int half = (left + right) / 2;
                    if (arr[half] < temp) {
                        left = half + 1;
                    } else
                        right = half - 1;
                }

                for (int k = j; k >= left; k--) {
                    arr[k + 1] = arr[k];
                }
                arr[left] = temp;
            }
        }
        return arr;
    }

    /*
        希尔排序：
        我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
        即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
     */
    public static int[] shellSort(int[] arr) {
        int dk = arr.length / 2;
        while (dk >= 1) {
            insertSort(arr, arr.length, dk);
            dk = dk / 2;
        }
        return arr;
    }

    /*
        归并排序：
        归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
     */
    public static int[] mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }



    /*
        合并有序数组
     */
    private static int[] merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
        return arr;
    }

    /*
        直接插入排序的一般形式
     */
    private static int[] insertSort(int[] arr, int length, int start) {
        for (int i = start; i < length; i++) {
            if (arr[i] < arr[i - start]) {
                int j = i - start;
                int temp = arr[i];
                while (j >= 0 && temp < arr[j]) {
                    arr[j + start] = arr[j];
                    j -= start;
                }
                arr[j + start] = temp;
            }
        }
        return arr;
    }
}
