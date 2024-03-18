package com.Coursework;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random(101);

        int[] arr = new int[10000];
        int start,end,time;


        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt();
        }
        int[] arr1=arr.clone();
        int[] arr2=arr.clone();
        int[] arr3 =arr.clone();


        System.out.println("початок швидкого сортування");

        QuickSort ob = new QuickSort ();
        start= (int) System.currentTimeMillis();
        ob.sort(arr1, 0, arr1.length-1);
        end=(int) System.currentTimeMillis();
        time=end-start;
        System.out.println("сорування зайняло "+time+"  мілісекунд");

        System.out.println("початок швидкого сортування");
        int low = 0;
        int high = arr.length - 1;
        start= (int) System.currentTimeMillis();
        QuickSort.quickSort(arr2,low,high);
        end=(int) System.currentTimeMillis();
        time=end-start;
        System.out.println("сорування зайняло  "+time+" мілісекунд");

        System.out.println("початок швидкого сотування з випалковим опорним елементом");
        start= (int) System.currentTimeMillis();
        ob.quickSortWithRandomKey(arr3, 0, arr.length-1);
        end=(int) System.currentTimeMillis();
        time=end-start;
        System.out.println("сорування зайняло  "+time+" мілісекунд");

    }
}