package lab6.bai32;

import java.util.ArrayList;

public class Mainbai3 {
    public static ArrayList<SinhVienOne> list= new ArrayList<>();
    public static void nhaplistSV(){
        for (int i= 0; i<5; i++){
            SinhVienOne sv= new SinhVienOne();
            list.add(sv);
        }
    }
    public static void xuatlistSV(){
        for(SinhVienOne x: list){
            x.Xuatone();
            System.out.println("   ");
        }
    }

    public static void main(String[] args) {
        nhaplistSV();
        xuatlistSV();
    }
}
