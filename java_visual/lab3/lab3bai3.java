package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Moi nhap so phan tu cua mang: ");
        n = scan.nextInt();
        int mang[] = new int[n];
        // vong lap nhap
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] = ", i);
            // hoặc System.out.print("a["+i+"]= ");
            mang[i] = scan.nextInt();
        }
        // xuất mảng vừa nhập
        System.out.println("Mang vua nhap la:");
        for (int x : mang) {
            System.out.println("" + x);
        }
        // sắp xếp
        Arrays.sort(mang);
        System.out.println("Mang sau khi duoc sap xep: " + Arrays.toString(mang));
        // tìm phần tử nhỏ nhất
        int min = mang[0];
        for (int i = 0; i < n; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        System.out.println("Phan tu nho nhat la: " + min);
        // tính và xuất các phần tử chia hết cho 3
        int tong = 0;
        double count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0){
                tong+=mang[i];
                count++;
            }
        }
        double avg = tong / count;
        System.out.println("Trung binh cong cac phan tu chia het cho 3 la: " + avg);
    }
}
