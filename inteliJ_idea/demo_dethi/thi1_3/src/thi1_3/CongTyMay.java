/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CongTyMay {

    public static ArrayList<CongNhan> listCN = new ArrayList<>();

    public static void loadList() {
        CongNhan cn1 = new CongNhan("Nam Anh", 22, 500, 2.5f);
        CongNhan cn2 = new CongNhan("Van Nam", 22, 600, 0.95f);
        CongNhan cn3 = new CongNhan("Cong Nam", 23, 700, 0.65f);
        CongNhan cn4 = new CongNhan("Ninh", 22, 750, 0.85f);
        CongNhan cn5 = new CongNhan("Ngan", 24, 550, 0.9f);
        CongNhan cn6 = new CongNhan("Thu", 22, 900, 0.5f);
        CongNhan cn7 = new CongNhan("Thu Nga", 25, 1000, 08f);
        CongNhan cn8 = new CongNhan("Na", 22, 2000, 0.6f);
        CongNhan cn9 = new CongNhan("Ngan Thu", 25, 350, 3.5f);
        CongNhan cn10 = new CongNhan("Bui Tuan", 27, 400, 0.5f);
        CongNhan cn11 = new CongNhan("Nguyen Nhu", 29, 4500, 2.5f);
        CongNhan cn12 = new CongNhan("Nguyen", 32, 650, 1.5f);

        ToTruong tt1 = new ToTruong("Nguyen", 35, 250, 1, 5000, 2500);
        ToTruong tt2 = new ToTruong("Nguyen Ngoc", 45, 350, 1.5f, 6000, 3500);

        listCN.add(cn1);
        listCN.add(cn2);
        listCN.add(cn3);
        listCN.add(cn4);
        listCN.add(cn5);
        listCN.add(cn6);
        listCN.add(cn7);
        listCN.add(cn8);
        listCN.add(cn9);
        listCN.add(cn10);
        listCN.add(cn11);
        listCN.add(cn12);
        listCN.add(tt1);
        listCN.add(tt2);
    }

    public static void xuatList() {
        for (CongNhan cn : listCN) {
            if (cn instanceof CongNhan) {
                cn.inRa();
                System.out.println();
            } else {
                cn.inRa();
                System.out.println();
            }
        }
    }

    public static void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tìm: ");
        String tenSearch = sc.nextLine();
        boolean test = false;
        for (CongNhan cn : listCN) {
            if (cn.getHoTen().equalsIgnoreCase(tenSearch)) {
                test = true;
                if (cn instanceof CongNhan) {
                    cn.inRa();
                    System.out.println();
                } else {
                    cn.inRa();
                    System.out.println();
                }
            }
        }
        if (!test) {
            System.out.println("Khong tim thay!");
        }
    }

    public static void sxLuongGD() {
        Comparator<CongNhan> comp = new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan o1, CongNhan o2) {
                return Double.compare(o2.luong(), o1.luong());
            }
        };
        Collections.sort(listCN, comp);
    }

    public static void menu() {
        int chon;
        while (true) {
            System.out.println("=================MENU=================");
            System.out.println("1. Nhap ");
            System.out.println("2. In ra thong tin");
            System.out.println("3. Tim kiem");
            System.out.println("4. Sap xep theo luong giam dan");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("=======================================");
            System.out.println("Moi nhap lua chon: ");
            chon = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (chon) {
                case 1:
                    loadList();
                    break;
                case 2:
                    xuatList();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    sxLuongGD();
                    break;
                case 5:
                    System.out.println("cam on ban da su dung chuong trinh!");
                    System.exit(0);
                default:
                    System.out.println("Nhap khong dung! nhap lai!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
