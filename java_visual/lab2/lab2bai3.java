package lab2;
import java.util.Scanner;

public class lab2bai3 {
    public static void main(String[] args) {
        int soDien, tien;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so dien: ");
        soDien = sc.nextInt();
        if (soDien < 50){
            tien= soDien *1000;
        }else {
            tien= 50* 1000 + (soDien-50)*1200;
        }
        System.out.println("so tien phai tra: " + tien + " VND");
    }
        
}
