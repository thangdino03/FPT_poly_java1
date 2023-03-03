package co_demo;

import java.util.Scanner;

public class codemo_mangbai4lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diem = {5, 7, 9};
        String[] ten = {"Binh", "An", "Mai"};
        //SAP XEP MANG GIAM DAN
        for (int i = 0; i < diem.length - 1; i++) {//
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] < diem[j]) {
                    //hoan vi a[i] va a[j]
                    int temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    //hoan vi ten
                    String t = ten[i];
                    ten[i] = ten[j];
                    ten[j] = t;
                }
            }
        }
        System.out.println("MANG SAU KHI SX GIAM DAN THEO DIEM: ");
        for(int i=0;i<3;i++){
            System.out.printf("Ten: %s --  diem: %d -- Xep loai: %s",ten[i],diem[i],xepLoai(diem[i]));
            System.out.println("");
        }
    }

    public static String xepLoai(int diem) {
        if (diem >= 9) {
            return "XS";
        } else if (diem >= 8) {
            return "Gioi";
        } else if (diem >= 7) {
            return "Kha";
        } else if (diem >= 5) {
            return "TB";
        } else {
            return "Yeu";
        }
    }
}
