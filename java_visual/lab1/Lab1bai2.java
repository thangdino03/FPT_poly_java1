package lab1;
import java.util.Scanner;

public class Lab1bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        int dai = sc.nextInt();
        System.out.print("Chieu rong: ");
        int rong = sc.nextInt();
        // tính chu vi
        int chuVi = (dai + rong) * 2;
        int dienTich = dai * rong;
        int canhNhoNhat = Math.min(dai, rong);
        // xuat kqua
        System.out.println("chu vi HCN: " + chuVi);
        System.out.println("Dien tich HCN: " + dienTich);
        System.out.println("Canh nho nhat: " + canhNhoNhat);
    }
}
