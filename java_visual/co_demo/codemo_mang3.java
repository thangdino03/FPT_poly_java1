package co_demo;

import java.util.Arrays;
import java.util.Scanner;

public class codemo_mang3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 5, 7, 6, 8, 9 };
        // SAP XEP MANG GIAM DAN
        for (int i = 0; i < a.length - 1; i++) {//
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    // hoan vi a[i] va a[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            // IN MANG SAU KHI CHAY i
            System.out.println("Voi i= " + i + " thi mang a la:" + Arrays.toString(a));
        }
        System.out.println("MANG SAU KHI SX GIAM DAN: " + Arrays.toString(a));
    }
}
