package lab5.bai2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    private ArrayList<String> ds = new ArrayList<>();


    public void nhap2() {
        //ds.clear(); // khi nhập ds mới sẽ xóa ds cũ
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap danh sach ho ten ");
        while (true) {
            System.out.print("Nhap ho ten: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) {
                System.out.println("Nhap thanh cong");
                break;
            }
            ds.add(ten);
        }
    }
    public void xuat2(){
        System.out.println("");
        for (String item: ds){
            System.out.println(item);
        }
    }
    public void xuatNgauNhien(){
        System.out.println("");
        System.out.println("Danh sach ngau nhien");
        Collections.shuffle(ds);
        xuat2();
    }
    public void sapxepGiamDan(){
        System.out.println("");
        System.out.println("Sap xep giam dan");
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat2();
    }

    public void xoa(){
        System.out.println("");
        System.out.println(" tim va Xoa ho ten !");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten muon xoa: ");
        String hoTen = scanner.nextLine();
         for (String item: ds){
             if(item.equalsIgnoreCase(hoTen)){ // ko phân biệt chữ thường chữ hoa
                 ds.remove(item);
                 System.out.println("Xoa ho ten thanh cong");
             }
         }
    }

}