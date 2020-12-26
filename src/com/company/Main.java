package com.company;

import java.util.Scanner;

public class Main {
    public static void sortt(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private static void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]) {
                    int t = array[j];
                    array[j] = array[j - h];
                    array[j - h] = t;
                }
                else
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n;i++){
            ar[i] = in.nextInt();
        }
        System.out.print("\n");
        sortt(ar);
        for (int j : ar) {
            System.out.print(j + "  ");
        }
    }
}
