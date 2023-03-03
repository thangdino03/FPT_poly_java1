package lab7.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSV {
    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhap ho ten sv: ");
            String hoTen = sc.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                break;
            }
            System.out.printf("Nhap ten nganh (IT/Biz):  ");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.printf("Diem Java: ");
                double diemJava = sc.nextDouble();
                System.out.printf("Nhap diem CSS: ");
                double diemCSS = sc.nextDouble();
                System.out.printf("Nhap diem HTML: ");
                double diemHtml = sc.nextDouble();
                //tạo đối tượng
                SinhVienPoly newSv = new SinhVienIT(hoTen, nganh, diemJava, diemCSS, diemHtml);
                list.add(newSv);
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.printf("Nhap diem Marketting: ");
                double diemMarketting = sc.nextDouble();
                System.out.printf("Nhap diem sales: ");
                double diemSales = sc.nextDouble();
                SinhVienPoly newSv = new SinhVienBiz(hoTen, nganh, diemMarketting, diemSales);
                list.add(newSv);
            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.println("--------------------------------------");
            System.out.println("Ho ten: "+sv.getHoTen());
            System.out.println("Nganh: "+sv.getNganh());
            System.out.println("Diem TB: "+sv.getDiem());
            System.out.println("Hoc luc: "+sv.getHocLuc());

        }
    }

    public void xuatGioi() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                System.out.println("--------------------------------------");
                System.out.println("Ho ten: "+sv.getHoTen());
                System.out.println("Nganh: "+sv.getNganh());
                System.out.println("Diem TB: "+sv.getDiem());
                System.out.println("Hoc luc: "+sv.getHocLuc());
            }
        }
    }

    Comparator<SinhVienPoly> comp= new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };
    public void sapxepTheoDiem(){
        Collections.sort(list, comp);
        System.out.println("Sap xep tang dan theo diem");
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("++----------------------Menu------------------------++");
            System.out.println("|  1.Nhap danh sach sinh vien                        |");
            System.out.println("|  2.Xuat thong tin danh sach sinh vien              |");
            System.out.println("|  3.Xuat danh sach sinh vien co hoc luc gioi        |");
            System.out.println("|  4.Sap xep danh sach sinh vien theo diem           |");
            System.out.println("|  5.Thoat                                           |");
            System.out.println("++--------------------------------------------------++");
            System.out.printf("Moi ban chon: ");
            chon = s.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatGioi();
                    break;
                case 4:
                    sapxepTheoDiem();
                    break;
                case 5:
                    System.out.printf("Cam on da su dung ctrinh");
                    break;
                default:
                    System.out.println("Nhap sai!");
            }
        } while (chon != 5);
    }
}
