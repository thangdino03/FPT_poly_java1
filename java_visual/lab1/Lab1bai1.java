package lab1;

import java.util.Scanner;

public class Lab1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("moi nhap diem TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f diem", hoTen, diemTB);
    }
}
