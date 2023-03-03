package lab5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc ");
        while(true){
            System.out.print("Nhap so: ");
            Double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.print("Nhap tiep du lieu (Y/N): ");
            if (sc.nextLine().equals("N")){
                break;
            }
        }
    }

    public  void xuat(){
        System.out.println("Cac gtri cua mang");
        for (Double item: list){
            System.out.print(" \t "+item);
        }
    }

    public void tinhTong(){
    double tong =0;
    for (Double item: list){
        tong += item;
    }
        System.out.println(" ");
        System.out.println(" Tong: "+ tong);
    }
}
