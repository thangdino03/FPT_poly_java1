/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1_tranthithuha;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student extends Person {

    private double diemToan;
    private double diemLy;
    private double diemHoa;

    double getAverage() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {

            System.out.println("Nhap diem toan: ");
            this.diemToan = Double.parseDouble(sc.nextLine());
            if (this.diemToan >= 0 && this.diemToan <= 10) {
                break;
            }
        } while (true);
        do {
            System.out.println("Nhap diem ly: ");
            this.diemLy = Double.parseDouble(sc.nextLine());
            if (this.diemLy >= 0 && this.diemLy <= 10) {
                break;
            }
        } while (true);
        do {
            System.out.println("Nhap diem Hoa: ");
            this.diemHoa = Double.parseDouble(sc.nextLine());
            if (this.diemHoa >= 0 && this.diemHoa <= 10) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        super.xuat();
        System.out.printf(" | Diem toan: %.1f | Diem Ly: %.1f | Diem Hoa: %.1f | Diem trung binh: %.1f", this.diemToan, this.diemLy, this.diemHoa, getAverage());
    }

    public Student() {
    }

    public Student(String ma, String ten, String tuoi, String diaChi, double diemToan, double diemLy, double diemHoa) {
        super(ma, ten, tuoi, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

}
