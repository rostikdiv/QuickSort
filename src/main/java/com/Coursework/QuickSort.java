package com.Coursework;
import java.util.Arrays;
import java.util.Random;
public class QuickSort {
    Random random=new Random();
    int partition (int arr[], int first, int last) {
        int pivot = arr[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;
        return i + 1;
    }
    void sort(int arr[], int first, int last) {
        if (first < last) {
            int pi = partition(arr, first, last);
            sort(arr, first, pi - 1);
            sort(arr, pi + 1, last);
        }
    }
    public static void quickSort(int[] arr, int first, int last) {
        if (arr.length == 0)
            return;
        if (first >= last)
            return;
        int middle = first + (last - first) / 2;
        int opora = arr[middle];

        int i = first, j = last;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (first < j)
            quickSort(arr, first, j);
        if (last > i)
            quickSort(arr, i, last);
    }
    public void quickSortWithRandomKey(int[] arr, int first, int last) {
        if (arr.length == 0)
            return;
        if (first >= last)
            return;
        int middle = first+random.nextInt(last-first+1);
        int opora = arr[middle];

        int i = first, j = last;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (first < j)
            quickSortWithRandomKey(arr, first, j);
        if (last > i)
            quickSortWithRandomKey(arr, i, last);
    }

}
