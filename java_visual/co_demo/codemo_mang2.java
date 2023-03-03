package co_demo;

import java.util.Scanner;

public class codemo_mang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dem = 0;
        double tong = 0;
        System.out.println("Moi nhap so phan tu cua mang n= ");
        n = sc.nextInt();
        int[] a = new int[n];
        // NHAP MANG, cong vao tong
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                tong += a[i];// tong các so chan
                dem++;// dem co bao nhieu so chan
            }
        }
        System.out.println("MANG MOI NHAP LA:");
        for (int x : a) {
            System.out.println(x + "---" + x + "^3 = " + Math.pow(x, 3));
        }
        System.out.printf("Trung binh các so CHAN trong mang la: %.2f", (tong / n));
    }
}
