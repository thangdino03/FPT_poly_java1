package lab4;

import java.util.Scanner;

public class sanPham {
    private String tenSP;
    private Double donGia;
    private Double giamGia;
    // file này kiêm bài 1 và 4

    public String gettenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getdongia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getgiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public sanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public sanPham(String tenSP, Double donGia) {
        this.tenSP= tenSP;
        this.donGia= donGia; 
    }

    public sanPham() {
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ten san pham: ");
        this.tenSP = sc.nextLine();
        System.out.print("Moi nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.print("moi nhap giam gia: ");
        this.giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.print("\n--------------------------------------------");
        System.out.printf("\nTen sp: %s \nGia SP: %.1f VND\nGiam Gia: %.1f VND \nThue nhap khau: %.1f VND", this.tenSP,
                this.donGia, this.giamGia, this.getThueNhapKhau());
    }

}
