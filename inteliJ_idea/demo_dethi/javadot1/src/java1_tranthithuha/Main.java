/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1_tranthithuha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static ArrayList<Student> listHS = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void nhapHS() {
        do {
            Student hs = new Student();
            hs.nhap();
            listHS.add(hs);
            System.out.println("Ban co muon nhap tiep khong? (Y/N) ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    public static void xuatHS() {
        for (Student hs : listHS) {
            hs.xuat();
            System.out.println();
        }
    }

    public static void sapXepTangDan() {
        for (int i = 0; i < listHS.size() - 1; i++) {
            for (int j = i + 1; j < listHS.size(); j++) {
                if (listHS.get(i).getAverage() > listHS.get(j).getAverage()) {
                    Collections.swap(listHS, i, j);
                }
            }
        }
        System.out.println("Sap xep thanh cong!");
    }

    public static void diemToanMax() {
        for (int i = 0; i < listHS.size() - 1; i++) {
            for (int j = i + 1; j < listHS.size(); j++) {
                if (listHS.get(i).getDiemToan() < listHS.get(j).getDiemToan()) {
                    Collections.swap(listHS, i, j);
                }
            }
        }
        for (int i = 0; i < listHS.size(); i++) {
            listHS.get(i).xuat();
            System.out.println();
            break;
        }
    }

    public static void menu() {
        int chon;
        while (true) {
            System.out.println("==================MENU==================");
            System.out.println("1. Nhap danh sach hoc sinh");
            System.out.println("2. In ra danh sach");
            System.out.println("3. Sap xep theo chieu tang dan cua diem trung binh");
            System.out.println("4. Hoc sinh co diem toan cao nhat");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("==========================================");
            System.out.println("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhapHS();
                    break;
                case 2:
                    xuatHS();
                    break;
                case 3:
                    sapXepTangDan();
                    break;
                case 4:
                    diemToanMax();
                    break;
                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong chinh xac! Vui long nhap lai!");

            }
        }
    }

    public static void loadList() {
        Student hs1 = new Student("SV023", "Nam", "23", "004 Nam Cao", 8.2, 9.6, 7.5);
        Student hs2 = new Student("SV025", "Dung", "24", "774 Binh Dinh", 8.7, 7.6, 6.5);
        Student hs3 = new Student("SV020", "Mai", "18", "Da Nang", 7.2, 8.6, 8.5);
        Student hs4 = new Student("SV021", "Quynh", "19", "Quang Binh", 8.6, 8.6, 7.5);
        Student hs5 = new Student("SV053", "Lan", "20", "Nguyen Van Linh", 9.6, 7.2, 7.8);
        Student hs6 = new Student("SV086", "Thu", "22", "002 Nam Cao", 8.2, 7.6, 8.5);
        listHS.add(hs1);
        listHS.add(hs2);
        listHS.add(hs3);
        listHS.add(hs4);
        listHS.add(hs5);
        listHS.add(hs6);
    }

    public static void main(String[] args) {
        loadList();
        menu();
    }
}
