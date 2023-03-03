/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

/**
 *
 * @author Administrator
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh(String maNV, String hoTen, String phongBan, double luong) {
        super(maNV, hoTen, phongBan, luong);
    }

    @Override
    double getThuNhap() {
        return luong - getThueTN();
    }

    @Override
    double getThueTN() {
        double thueTN;
        if (luong < 9000) {
            thueTN = 0;
        } else if (luong <= 15000) {
            thueTN = (int) (luong * 0.1);
        } else {
            thueTN = (int) ((15000 - 9000) * 0.1 + (luong - 15000) * 0.12);
        }
        return thueTN;
    }  
    public void xuat(){
        super.xuat();
        System.out.printf("| Thue Thu Nhap: %.0f | Thu Nhap: %.0f\n",getThueTN(), getThuNhap());
    }
}
