/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class assignment {

    public static ArrayList<NhanVien> listNV = new ArrayList<>();

    public static void main(String[] args) {
        loadlist();
        Menu();
    }

    public static void loadlist() {
        NhanVien nv1 = new NhanVien("NV001", "thuong", 10);
        NhanVien nv2 = new TiepThi("NV002", "huyen", 10, 20, 0.1);
        NhanVien nv3 = new TruongPhong("NV003", "linh", 20, 5);
        listNV.add(nv1);
        listNV.add(nv2);
        listNV.add(nv3);
    }

    public static void xuat5NVThuNhapMax() {
        SXTheoThuNhap();
        Collections.reverse(listNV);
        if (listNV.size() < 5) {
            System.out.println("list co" + listNV.size() + "NV:");
            for (int i = 0; i < listNV.size(); i++) {
                listNV.get(i).xuat();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                listNV.get(i).xuat();
            }
        }
    }

    public static void NhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap maNV: ");
        String maNV = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi nhap ma");
        double luong = sc.nextDouble();
        int chon = 0;
        System.out.println("Tao NV Hành Chính(1)--TiepThi(2)--TruongPhong(3)");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                NhanVien nv = new NhanVien(maNV, ten, luong);
                listNV.add(nv);
                break;

            case 2:
                System.out.println("Moi nhap doanh so cho nvTiepThi:");
                double doanhSo = sc.nextDouble();
                System.out.println("Moi nhap hue Hong cho nvTiepThi:");
                double hueHong = sc.nextDouble();
                nv = new TiepThi(maNV, ten, luong, doanhSo, hueHong);
                listNV.add(nv);
                break;

            case 3:
                System.out.println("Moi nhap tien trach nhiem cho truong phong:");
                double trachNhiem = sc.nextDouble();
                nv = new TruongPhong(maNV, ten, luong, trachNhiem);
                listNV.add(nv);
                break;
        }
    }

    public static void xuatNhapDS() {
        for (NhanVien sv : listNV) {
            sv.xuat();
        }
    }

    public static void TimNV_TheoMaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap maNV can tim:");
        String maTimKiem = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(maTimKiem)) {
                System.out.println("Da tim thay NV");
                listNV.get(i).xuat();
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Ko tim thay NV" + maTimKiem + "trong DS");
        }
    }

    public static void TimNV_TheoLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap Luong can tren:");
        double luongMin = sc.nextDouble();
        System.out.println("Moi nhap Luong can duoi:");
        double luongMax = sc.nextDouble();
        int flag = 0;
        for (int i = 0; i < listNV.size(); i++) {
            double luongNV = listNV.get(i).getLuong();
            if (luongNV >= luongMin & luongNV <= luongMax) {
                System.out.println("Da tim thay NV");
                listNV.get(i).xuat();
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Ko tim thay NV trong DS");
        }
    }

    public static void XoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap maNV can tim:");
        String maTimKiem = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(maTimKiem)) {
                System.out.println("Da xoa thanh  NV");
                listNV.remove(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Ko tim thay NV" + maTimKiem + "trong DS");
        }
    }

    public static void SuaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap maNV can tim:");
        String maTimKiem = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(maTimKiem)) {
                System.out.println("Da tim thay thanh  NV" + maTimKiem);
                System.out.println("Moi nhap ten can sua: ");
                String ten = sc.nextLine();
                System.out.println("Moi nhap luong can sua");
                double luong = sc.nextDouble();
                int chon = 0;
                System.out.println("CHON: NV Hành Chính(1)--TiepThi(2)--TruongPhong(3)");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        NhanVien nv = new NhanVien(maTimKiem, ten, luong);
                        listNV.set(i, nv);
                        break;

                    case 2:
                        System.out.println("Moi nhap doanh so cho nvTiepThi:");
                        double doanhSo = sc.nextDouble();
                        System.out.println("Moi nhap hue Hong cho nvTiepThi:");
                        double hueHong = sc.nextDouble();
                        nv = new TiepThi(maTimKiem, ten, luong, doanhSo, hueHong);
                        listNV.set(i, nv);
                        break;

                    case 3:
                        System.out.println("Moi nhap tien trach nhiem cho truong phong:");
                        double trachNhiem = sc.nextDouble();
                        nv = new TruongPhong(maTimKiem, ten, luong, trachNhiem);
                        listNV.set(i, nv);
                        break;
                }
                if (flag == 0) {
                    System.out.println("Ko tim thay NV" + maTimKiem + "trong DS");
                }
            }
        }
    }

    public static void SXTheoTen() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTen().compareTo(o2.getTen());

            }
        };
        Collections.sort(listNV, comp);
    }

    public static void SXTheoThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.getLuong(), o2.getLuong());
            }
        };
        Collections.sort(listNV, comp);
    }

    public static void Menu() {
        int chon;
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**********Menu**********");
            System.out.println("1.Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2.Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4.Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7.Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8.Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9.Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("10.EXIT.");
            System.out.println("Moi ban chon cv:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    NhapDS();
                    break;
                case 2:
                    xuatNhapDS();
                    break;
                case 3:
                    TimNV_TheoMaNV();
                case 4:
                    XoaNV();
                    break;
                case 5:
                    SuaNV();
                    break;
                case 6:
                    TimNV_TheoLuong();
                    break;
                case 7:
                    SXTheoTen();
                    break;
                case 8:
                    SXTheoThuNhap();
                    break;
                case 9:
                    xuat5NVThuNhapMax();
                    break;
                case 10:
                    System.out.println("cam on da su dung chuong trinh .tam biet");
                    break;
                default:
                    System.out.println("chon sai  cv(0-9)");
                    break;
            }
        } while (!(chon == 0));
        System.out.println("Cam on ban da dung chuong trinh cua minh!");

    }

}
