
package thi1_3;

import java.util.Scanner;


public class CongNhan {
    private String hoTen;
    private int tuoi;
    private int soLuongSanPham;
    private float donGia;

    public int tienLuong(){
        return (int) (soLuongSanPham * donGia);
    }
    public int luong(){
        if(tienLuong() < 6000){
            return 6000;
        }else{
            return tienLuong();
        }
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Tuoi: ");
        this.tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("So luong SP: ");
        this.soLuongSanPham = Integer.parseInt(sc.nextLine());
        System.out.println("Don gia: ");
        this.donGia = Float.parseFloat(sc.nextLine());
    }
    public void inRa(){
        System.out.printf("Ho ten: %s | Tuoi: %d | So luongSp: %d | Don gia: %.1f | Luong: %d",this.hoTen, this.tuoi, this.soLuongSanPham, this.donGia, luong());
    }
    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, int soLuongSanPham, float donGia) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soLuongSanPham = soLuongSanPham;
        this.donGia = donGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
}
