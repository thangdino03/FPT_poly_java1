/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

/**
 *
 * @author Administrator
 */
public class NhanVienTiepThi extends NhanVien{
    private double doanhSo, hueHong;

    public NhanVienTiepThi(String maNV, String hoTen, String phongBan, double luong, double doanhSo, double hueHong) {
        super(maNV, hoTen, phongBan, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

   

    @Override
    double getThuNhap() {
        return luong + doanhSo * hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    public void xuat(){
        super.xuat();
        System.out.printf("| Doanh so: %.0f | Hue Hong: %.2f | Thue Thu Nhap: %.0f | Thu Nhap: %.0f\n",doanhSo, hueHong, getThueTN(), getThuNhap());
    }
}
