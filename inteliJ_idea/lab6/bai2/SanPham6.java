package lab6.bai2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SanPham6 {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten san pham: ");
        tenSP= sc.nextLine();
        System.out.printf("Nhap don gia: ");
        donGia= sc.nextDouble();
        //xử lí tránh nhập bị dính
        // cách 1 dùng: sc.nextline();
        //cách 2: sửa thành hang= new Scanner(System.in).nextLine();
        sc.nextLine();
        System.out.printf("Nhap hang: ");
        hang= sc.nextLine();
    }

    public void xuat(){
        System.out.println("***");
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia+"VND");
        System.out.println("Hang: "+hang);
    }
}
