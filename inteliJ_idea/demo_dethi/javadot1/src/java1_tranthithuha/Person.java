/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1_tranthithuha;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {

    private String ma;
    private String ten;
    private String tuoi;
    private String diaChi;

    public Person() {
    }

    public Person(String ma, String ten, String tuoi, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ma: ");
            this.ma = sc.nextLine();
            String reMa = "\\w+";
            if (this.ma.matches(reMa)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!");
            }
        } while (true);
        do {
            System.out.println("Nhap ten: ");
            this.ten = sc.nextLine();
            String reTen = "[a-zA-Z ]{2,}";
            if (this.ten.matches(reTen)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!");
            }
        } while (true);
       
        do {

            System.out.println("Nhap tuoi: ");
            this.tuoi= sc.nextLine();
            String reTuoi = "\\d{1,}";
            if (this.tuoi.matches(reTuoi)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!");
            }
        } while (true);
        do {

            System.out.println("Nhap dia chi: ");
            this.diaChi = sc.nextLine();
            String reDiaChi = "\\w+";
            if (this.ma.matches(reDiaChi)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!");
            }
        } while (true);
    }

    public void xuat() {
        System.out.printf("Ma: %s | Ten: %s | Tuoi: %s | Dia chi: %s", this.ma, this.ten, this.tuoi, this.diaChi);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
