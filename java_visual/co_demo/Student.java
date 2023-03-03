package co_demo;

import java.util.Scanner;


    public class Student {
        private String hoTen;
        private double diem;

        public void nhap() {
            Scanner in = new Scanner(System.in);
            System.out.print("Moi nhap ten: ");
            this.hoTen = in.nextLine();
            System.out.print("moi nhap diem: ");
            this.diem = in.nextDouble();
        }

        public void xuat() {
            System.out.println("Ten: " + this.hoTen + " -- Diem: " + this.diem +" --Xep loai : "+xepLoai() );
        }

        public String xepLoai() {
            String xloai = " ";
            if (diem >= 9) {
                xloai = "Xuat Sac!";
            } else if (diem >= 8) {
                xloai = "Gioi";
            } else if (diem >= 7) {
                xloai = "Kha";
            } else if (diem >= 5) {
                xloai = "TB";
            } else {
                xloai = "Yeu";
            }
            return xloai;
        }

    }
