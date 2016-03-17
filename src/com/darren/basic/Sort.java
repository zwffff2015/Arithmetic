package com.darren.basic;

/**
 * Author: DarrenZeng
 * Date: 2016-03-17
 */
public class Sort {
    /*
        ð������ʱ�临�Ӷ�Ϊn^2
        ��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵������ýϴ�������³�����С������ð������ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
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
        ѡ������
        ��Ҫ�����һ�����У�ѡ����С��������󣩵�һ�������1��λ�õ���������Ȼ����ʣ�µ�������������С��������󣩵����2��λ�õ����������������ƣ�ֱ����n-1��Ԫ�أ������ڶ��������͵�n��Ԫ�أ����һ�������Ƚ�Ϊֹ��
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
        ��������
        ����������õ�˼���Ƿ���˼�롣
        �����������ҳ�һ��Ԫ�أ������Ͽ��������һ������Ϊ��׼(pivot),Ȼ���������з�������,ʹ��׼���Ԫ�ص�ֵ�������ڻ�׼ֵ,��׼�ұߵ�Ԫ��ֵ ����С�ڻ�׼ֵ�������Ϊ��׼��Ԫ�ص�������������ȷλ�á��ݹ�������򣬽�����n-1��Ԫ��Ҳ��������������ȷλ�á����ÿ��Ԫ�ض������������� ȷλ�ã�������ɡ����Կ��������㷨�ĺ����㷨�Ƿ�������������ε�����׼��λ���Լ��������ػ�׼������λ���Ա���εݹ顣
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
        ֱ�Ӳ�������ʱ�临�Ӷ�Ϊn^2
        ��һ����¼���뵽������õ�������У��Ӷ��õ�һ���£���¼����1������������Ƚ����еĵ�1����¼������һ������������У�Ȼ��ӵ�2����¼������в��룬ֱ��������������Ϊֹ��
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
        ���ֲ�������ʱ�临�Ӷ�Ϊn^2
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
        ϣ������
        ���Ǽ򵥴����������У���������d = {n/2 ,n/4, n/8 .....1} nΪҪ�������ĸ���
        �����Ƚ�Ҫ�����һ���¼��ĳ������d��n/2,nΪҪ�������ĸ������ֳ������������У�ÿ���м�¼���±����d.��ÿ����ȫ��Ԫ�ؽ���ֱ�Ӳ�������Ȼ������һ����С��������d/2���������з��飬��ÿ�����ٽ���ֱ�Ӳ������򡣼���������С����ֱ��Ϊ1�����ʹ��ֱ�Ӳ��������������
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
        �鲢����
        �鲢��Merge�������ǽ����������������ϣ������ϲ���һ���µ���������Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ�����������С�
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
        �ϲ���������
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
        ֱ�Ӳ��������һ����ʽ
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
