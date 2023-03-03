package lab1;

import java.util.Scanner;

public class Lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap canh cua khoi lap phuong: ");
        int canh = scanner.nextInt();
        int theTich = canh * canh * canh;//hoặc  math.pow
        System.out.println("the tich khoi lap phuong: " + theTich);
    }
}
