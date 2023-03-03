package lab6.bai2;

import java.util.ArrayList;


public class bai2 {
    public static void main(String[] args) {
        ArrayList<SanPham6> list = new ArrayList<>();
        for (int i=0; i<5; i++){
            SanPham6 sp = new SanPham6();
            sp.nhap();
            list.add(sp);
        }
        for (SanPham6 sp: list){
            if(sp.getHang().equalsIgnoreCase("Nokia")){
                sp.xuat();
                System.out.println("");
            }
        }
    }
}
