/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

/**
 *
 * @author Administrator
 */
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong(String maNV, String hoTen, String phongBan, double luong, double luongTrachNhiem) {
        super(maNV, hoTen, phongBan, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    double getThuNhap() {
        return luong + luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public void xuat() {
        super.xuat();
        System.out.printf("| Luong trach nhiem: %.0f | Thue Thu Nhap: %.0f | Thu Nhap: %.0f\n", luongTrachNhiem, getThueTN(), getThuNhap());
    }

}
