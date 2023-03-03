package lab2;

import java.util.Scanner;

public class lab2bai4 {
    public static void ptbac1() {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap so a: ");
        a = sc.nextDouble();
        System.out.print("moi nhap so b: ");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem!");
            } else {
                System.out.println("pt vo nghiem!");
            }
        } else {
            x = -b / a;
            System.out.printf("nghiem cua pt: %.2f", x);
        }
    }

    public static void ptbac2() {
        double x, x1, x2, delta;
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap a: ");
        a = sc.nextDouble();
        System.out.print("moi nhap b: ");
        b = sc.nextDouble();
        System.out.print("moi nhap c: ");
        c = sc.nextDouble();
        if (a == 0) {
            x = -b / a;
        } else {
            if (a != 0) {
                delta = (b * b) - 4 * a * c;
                if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Ptrinh co hai nghiem phan biet x1= %.2f va x2= %.2f", x1, x2);
                } else if (delta == 0) {
                    x1 = x2 = -b / (2 * a);
                    System.out.printf("PTrinh co nghiem kep: x1=x2= %.2f ", x1 = x2);
                } else {
                    System.out.println("PT vo nghiem");
                }
            }
        }
    }

    public static void tinhtienDien() {
        int soDien, tien;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so dien: ");
        soDien = sc.nextInt();
        if (soDien < 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("so tien phai tra: " + tien + " VND");
    }
    public static void menu(){
        int chon;
        do{
        System.out.println("\n------------------------MENU------------------------");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| 1. Giai phuong trinh bac nhat                    |");
        System.out.println("| 2. Giai phuong trinh bac hai                     |");
        System.out.println("| 3. Tinh tien dien                                |");
        System.out.println("| 4. Thoat Chuong trinh                            |");
        System.out.println("+--------------------------------------------------+");
        System.out.print("moi ban chon chuc nang (1-4): ");
        Scanner sc = new Scanner(System.in);
        chon = sc.nextInt();
        switch (chon){
            case 1:
                ptbac1();
                break;
            case 2:
                ptbac2();
                break;
            case 3:
                tinhtienDien();
                break;
            case 4:
            break;
            default:
                System.out.println("nhap sai!");
                System.out.println("xin moi chon lai");
        }
    }while(chon != 4);
    System.out.println(" Cam on da su dung chuong trinh! ");
    }
    public static void main(String[] args) {
        menu();
    }
}
