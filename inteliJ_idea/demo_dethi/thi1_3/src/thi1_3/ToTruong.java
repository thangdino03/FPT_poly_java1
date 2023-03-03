/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi1_3;

/**
 *
 * @author Administrator
 */
public class ToTruong extends CongNhan{
    private int luongTN;
    private int tienThuong;
    public int tienLuong(){
        return this.luongTN + this.tienThuong;
    }
    public int luong(){
        if(tienLuong() < 9000){
            return 9000;
        }else{
            return tienLuong();
        }
    }
    public void inRa(){
        super.inRa();
        System.out.printf(" | Luong trach nhiem: %d | Tien thuong: %d", this.luongTN, this.tienThuong);
    }
    public ToTruong() {
    }

    public ToTruong(int luongTN, int tienThuong) {
        this.luongTN = luongTN;
        this.tienThuong = tienThuong;
    }

    public ToTruong(String hoTen, int tuoi, int soLuongSanPham, float donGia,int luongTN, int tienThuong) {
        super(hoTen, tuoi, soLuongSanPham, donGia);
        this.luongTN = luongTN;
        this.tienThuong = tienThuong;
    }
   
}
