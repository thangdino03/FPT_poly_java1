package demo_code_java;

import java.util.Scanner;

import lab2.lab2bai1;
import lab2.lab2bai2;
import lab2.lab2bai3;

public class lab2bai4_cachgoilket {
    private static int chon;

    public static void menu() {
        do {
            System.out.println("\n+--------------------------------------------------+");
            System.out.println("| 1. Giai phuong trinh bac nhat                    |");
            System.out.println("| 2. Giai phuong trinh bac hai                     |");
            System.out.println("| 3. Tinh tien dien                                |");
            System.out.println("| 4. Thoat Chuong trinh                            |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("moi ban chon chuc nang (1-4): ");
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    lab2bai1.main(null);
                    break;
                case 2:
                    lab2bai2.main(null);
                    break;
                case 3:
                    lab2bai3.main(null);
                    break;
                case 4:
                    System.out.println("cam on da su dung chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhap sai!");
                    System.out.println();
            }
        } while (chon != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
