package lab6.bai3;

import java.util.ArrayList;

public class Data6 {
    ArrayList<SinhVien6> list = new ArrayList<>();
    public void nhap(){
        for (int i =0; i<5; i++){
            SinhVien6 sv= new SinhVien6();
            sv.nhap6();
            list.add(sv);
        }

    }

    public void xuat(){
        System.out.println("--------------------------------");
        for (SinhVien6 item : list) {
            item.xuat6();
        }
    }
}
