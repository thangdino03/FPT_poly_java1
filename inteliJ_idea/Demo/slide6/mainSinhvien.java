package Demo.slide6;

import java.util.ArrayList;
import java.util.Scanner;

public class mainSinhvien {
    public static ArrayList<SinhVien> listSV= new ArrayList<>();
    public static void nhapListSV(){
        for (int i=0; i<2; i++){
            SinhVien sv= new SinhVien();
             sv.nhap();
          listSV.add(sv);
        }
    }
    public static void xuatListSV(){
        for (SinhVien x : listSV){
            x.xuat();
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        nhapListSV();
        xuatListSV();
    }
}
