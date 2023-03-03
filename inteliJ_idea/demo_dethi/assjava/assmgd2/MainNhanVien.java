/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MainNhanVien {

    public static DanhSachNhanVien ds = new DanhSachNhanVien();

    public static void loadList() {
        NhanVien nv1 = new NhanVienHanhChinh("NV0026", "Nam Anh", "Hanh Chinh", 5000);

        NhanVien nv2 = new NhanVienTiepThi("NV001", "Lan anh", "Tiep Thi", 10000, 500, 0.2);

        NhanVien nv3 = new TruongPhong("NV009", "Bui Tuan", "Truong Phong", 20000, 5000);

        NhanVien nv4 = new NhanVienTiepThi("NV0023", "Ngan Ha", "Tiep Thi", 21000, 200, 0.1);

        NhanVien nv5 = new TruongPhong("NV0125", "Tran Thu Nga", "Truong Phong", 15000, 5500);

        NhanVien nv6 = new NhanVienHanhChinh("NV002", "Cao Hoang Linh", "Hanh Chinh", 5500);
        ds.list.add(nv1);
        ds.list.add(nv2);
        ds.list.add(nv3);
        ds.list.add(nv4);
        ds.list.add(nv5);
        ds.list.add(nv6);
    }

    public static void main(String[] args) {
        loadList();
        menu();
    }

    public static void menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("==================================MENU============================");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap danh sach sach nhan vien tu ban phim");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh");
            System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
            System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
            System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("==================================================================");
            System.out.println("Moi ban nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Chao mung ban den voi chuc nang Nhap danh sach nhan vien!");
                    ds.nhap();
                    break;
                case 2:
                    System.out.println("Chao mung ban den voi chuc nang Xuat danh sach nhan vien!");
                    ds.xuat();
                    break;
                case 3:
                    System.out.println("Chao mung ban den voi chuc nang Tim va hien thi nhan vien theo ma!");
                    ds.timVaHienThiTheoMa();
                    break;
                case 4:
                    System.out.println("Chao mung ban den voi chuc nang Xoa nhan vien theo ma!");
                    ds.xoaNhanVienTheoMa();
                    break;
                case 5:
                    System.out.println("Chao mung ban den voi chuc nang Cap nhat thong tin nhan vien theo ma!");
                    ds.capNhatTheoMa();
                    break;
                case 6:
                    System.out.println("Chao mung ban den voi chuc nang Tim cac nhan vien theo khoang luong!");
                    ds.nvTheoKhoangLuong();
                    break;
                case 7:
                    System.out.println("Chao mung ban den voi chuc nang Sap xep nhan vien theo ho va ten!");
                    ds.sapXepTheoHoTen();
                    break;
                case 8:
                    System.out.println("Chao mung ban den voi chuc nang Sap xep nhan vien theo thu nhap!");
                    ds.sapXepTheoThuNhap();
                    break;
                case 9:
                    System.out.println("Chao mung ban den voi chuc nang Xuat 5 nhan vien co thu nhap cao nhat!");
                    ds.xuatTop5();
                    break;
                case 0:

                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Ban nhap sai. Vui long nhap lua chon 0 - 9!");
                    break;
            }
        } while (chon != 0);
    }
}
