/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.management.StringValueExp;

public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();
    Datavalidation data = new Datavalidation();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            String ID;
            do {
                System.out.println("Nhap ma nhan vien: ");
                ID = sc.nextLine();
                if (data.isMa(ID)) {
                    System.out.println("Nhap dung!");
                    break;
                } else if (ID.equals("") || ID == null) {
                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            if (ID.equals("") || ID == null) {
                break;
            }
            String name;
            do {

                System.out.println("Nhap ho ten nhan vien: ");
                name = sc.nextLine();
                if (data.isHoTen(name)) {
                    System.out.println("Nhap dung!");
                    break;
//                } else if (name.equals("") || name == null) {
//                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            String luong;
            do {
                System.out.println("Nhap luong: ");
                luong = sc.nextLine();
                if (data.isLuong(luong)) {
                    System.out.println("Nhap dung!");
                    break;
//                } else if (luong.equals("") || luong == null) {
//                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            String phongBan;
            do {
                System.out.print("Ban thuoc phong ban nao (Hanh chinh / Tiep thi / Truong phong): ");
                phongBan = sc.nextLine();
                if (data.isPhongBan(phongBan)) {
                    System.out.println("Nhap dung!");
                    break;
//                } else if (phongBan.equals("") || phongBan == null) {
//                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            if (phongBan.equalsIgnoreCase("Hanh chinh")) {
                NhanVien newNV = new NhanVienHanhChinh(ID, name, phongBan, Double.parseDouble(luong));
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Tiep thi")) {
                String doanhSo, hueHong;
                do {
                    System.out.println("Nhap vao Doanh so: ");
                    doanhSo = sc.nextLine();
                    if (data.isDoanhSo(doanhSo)) {
                        System.out.println("Nhap dung!");
                        break;
//                    } else if (doanhSo.equals("") || doanhSo == null) {
//                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                do {
                    System.out.println("Nhap vao Hue hong: ");
                    hueHong = sc.nextLine();
                    if (data.isHueHong(hueHong)) {
                        System.out.println("Nhap dung!");
                        break;
//                    } else if (hueHong.equals("") || hueHong == null) {
//                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                NhanVien newNV = new NhanVienTiepThi(ID, name, phongBan, Double.parseDouble(luong), Double.parseDouble(doanhSo), Double.parseDouble(hueHong));
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Truong phong")) {
                String luongTN;
                do {
                    System.out.println("Nhap vao luong trach nhiem: ");
                    luongTN = sc.nextLine();
                    if (data.isLuongTN(luongTN)) {
                        System.out.println("Nhap dung!");
                        break;
//                    } else if (luongTN.equals("") || luongTN == null) {
//                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                NhanVien newNV = new TruongPhong(ID, name, phongBan, Double.parseDouble(luong), Double.parseDouble(luongTN));
                list.add(newNV);
            } else {
                System.out.println("Vui long nhap lai phong ban va cac thong tin khac!");
            }
        } while (true);
    }

    public void xuat() {
//        for (NhanVien nv : list) {
//            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | luong: %.2f | Thue thu nhap: %.2f | Thu nhap: %.2f", nv.getMaNV(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong(), nv.getThueTN(), nv.getThuNhap());
//            System.out.println();
//        }
        for (NhanVien nv : list) {
            if (nv instanceof NhanVienHanhChinh) {
                nv.xuat();
            } else if (nv instanceof NhanVienTiepThi) {
                nv.xuat();
            } else {
                nv.xuat();
            }
        }
    }

    public void timVaHienThiTheoMa() {
        Scanner sc = new Scanner(System.in);
        String ID;
        do {
            System.out.println("Nhap ma nhan vien can tim: ");
            ID = sc.nextLine();
            if (data.isMa(ID)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!Vui long nhap lai!");
            }
        } while (true);
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getMaNV())) {
                nvFound = nv;
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | luong: %.2f | Thue thu nhap: %.2f | Thu nhap: %.2f", nv.getMaNV(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong(), nv.getThueTN(), nv.getThuNhap());
                System.out.println();
                break;
            }
        }
        if (nvFound == null) {
            System.out.println("Khong tim thay nhan vien co ma " + ID);
        }
    }

    public void xoaNhanVienTheoMa() {
        Scanner sc = new Scanner(System.in);
        String ID;
        do {
            System.out.println("Nhap ma nhan vien can tim: ");
            ID = sc.nextLine();
            if (data.isMa(ID)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!Vui long nhap lai!");
            }
        } while (true);
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getMaNV())) {
                nvFound = nv;
                list.remove(nv);
                System.out.println("Da xoa thanh cong");
                break;
            }
        }
        if (nvFound == null) {
            System.out.println("Khong tim thay nhan vien co ma " + ID + " trong danh sach");
        }
    }

    public void capNhatTheoMa() {
        Scanner sc = new Scanner(System.in);
        String maNV;
        do {
            System.out.println("Nhap ma nhan vien can cap nhat: ");
            maNV = sc.nextLine();
            if (data.isMa(maNV)) {
                System.out.println("Nhap dung!");
                break;
            } else {
                System.out.println("Nhap sai!Vui long nhap lai!");
            }
        } while (true);
        //null chưa từng tồn tại
        NhanVien nvFound = null;
        int index = 0;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                nvFound = nv;
                //vị trí đầu của nv trong danh sách
                index = list.indexOf(nv);
                break;//không có trường hợp trừng ID
            }
        }
        if (nvFound != null) {
            String ID;
            do {
                System.out.println("Nhap ma nhan vien: ");
                ID = sc.nextLine();
                if (data.isMa(ID)) {
                    System.out.println("Nhap dung!");
                    break;
                } else if (ID.equals("") || ID == null) {
                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            if (ID.equals("") || ID == null) {
                ID = nvFound.getMaNV();
            }
            String name;
            do {

                System.out.println("Nhap ho ten nhan vien: ");
                name = sc.nextLine();
                if (data.isHoTen(name)) {
                    System.out.println("Nhap dung!");
                    break;
                } else if (name.equals("") || name == null) {
                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            if (name.equals("") || name == null) {
                name = nvFound.getHoTen();
            }
            String luong;
            do {
                System.out.println("Nhap luong: ");
                luong = sc.nextLine();
                if (data.isLuong(luong)) {
                    System.out.println("Nhap dung!");
                    break;
                } else if (luong.equals("") || luong == null) {
                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            //nếu lương không nhập vào giá trị trộng thì gán lại giá trị vào lương
            if (luong.equals("") || luong == null) {
                luong = String.valueOf(nvFound.getLuong());
            }
            String phongBan;
            do {
                System.out.print("Nhap vao phong ban: ");
                phongBan = sc.nextLine();
                if (data.isPhongBan(phongBan)) {
                    System.out.println("Nhap dung!");
                    break;
                } else if (phongBan.equals("") || phongBan == null) {
                    break;
                } else {
                    System.out.println("Nhap sai!Vui long nhap lai!");
                }
            } while (true);
            if (phongBan.equals("") || phongBan == null) {
                phongBan = String.valueOf(nvFound.getPhongBan());
            }
            if (nvFound instanceof NhanVienHanhChinh) {
                NhanVien nv = new NhanVienHanhChinh(ID, name, phongBan, Double.parseDouble(luong));
                list.set(index, nv);//cập nhật thay đôi thay thế
            } else if (nvFound instanceof NhanVienTiepThi) {
                String doanhSo, hueHong;
                do {
                    System.out.println("Nhap vao Doanh so: ");
                    doanhSo = sc.nextLine();
                    if (data.isDoanhSo(doanhSo)) {
                        System.out.println("Nhap dung!");
                        break;
                    } else if (doanhSo.equals("") || doanhSo == null) {
                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                if (doanhSo.equals("") || doanhSo == null) {
                    doanhSo = String.valueOf(((NhanVienTiepThi) nvFound).getDoanhSo());
                }
                do {
                    System.out.println("Nhap vao Hue hong: ");
                    hueHong = sc.nextLine();
                    if (data.isHueHong(hueHong)) {
                        System.out.println("Nhap dung!");
                        break;
                    } else if (hueHong.equals("") || hueHong == null) {
                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                if (hueHong.equals("") || hueHong == null) {
                    hueHong = String.valueOf(((NhanVienTiepThi) nvFound).getHueHong());
                }
                NhanVien nv = new NhanVienTiepThi(ID, name, phongBan, Double.parseDouble(luong), Double.parseDouble(doanhSo), Double.parseDouble(hueHong));
                list.set(index, nv);//cập nhật thay đôi thay thế nv tại index(vị trí)
            } else if (nvFound instanceof TruongPhong) {
                String luongTN;
                do {
                    System.out.println("Nhap vao luong trach nhiem: ");
                    luongTN = sc.nextLine();
                    if (data.isLuongTN(luongTN)) {
                        System.out.println("Nhap dung!");
                        break;
                    } else if (luongTN.equals("") || luongTN == null) {
                        break;
                    } else {
                        System.out.println("Nhap sai!Vui long nhap lai!");
                    }
                } while (true);
                if (luongTN.equals("") || luongTN == null) {
                    luongTN = String.valueOf(((TruongPhong) nvFound).getLuongTrachNhiem());
                }
                NhanVien nv = new TruongPhong(ID, name, phongBan, Double.parseDouble(luong), Double.parseDouble(luongTN));
                list.set(index, nv);//cập nhật thay đôi thay thế nv tại index(vị trí)
            }
            System.out.println("Cap Nhat thanh cong!");
        } else {
            System.out.println("Nhan vien khong ton tai!");
        }
    }

    public void nvTheoKhoangLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim nhan vien theo khoang luong: ");
        System.out.println("Nhap luong thap nhat: ");
        double min = sc.nextDouble();
        System.out.println("Nhap luong cao nhat: ");
        double max = sc.nextDouble();

        boolean test = false;

        for (NhanVien nv : list) {
            if (nv.getLuong() >= min && nv.getLuong() <= max) {
                test = true;
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | luong: %.2f | Thue thu nhap: %.2f | Thu nhap: %.2f", nv.getMaNV(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong(), nv.getThueTN(), nv.getThuNhap());
                System.out.println();
            }
        }
        if (test == false) {
            System.out.println("Khong co nhan vien nao nam trong khoang luong can tim.");
        }
    }

    public void sapXepTheoHoTen() {
        //list.size()-1 tìm tđược phần tử nhỏ nhất hoặc lơn 

        //sap xep theo ho
//        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
////                for (NhanVien nv : list) {
////                    String[] hoTen = nv.getHoTen().split(" ");
//                    return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
////                }
//                
//            } 
//        };
//        Collections.sort(list, comp);
//            
//        
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                //so sánh sx tăng dần
                if (list.get(i).getHoTen().substring(list.get(i).getHoTen().lastIndexOf(" ") + 1).compareToIgnoreCase((list.get(j).getHoTen().substring(list.get(j).getHoTen().lastIndexOf(" ") + 1))) > 0) {
                    Collections.swap(list, i, j);
                }
            }

        }
        System.out.println("Sap xep thanh cong!");
    }

    public void sapXepTheoThuNhap() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                //tăng dần
                if (list.get(i).getThuNhap() > list.get(j).getThuNhap()) {
                    Collections.swap(list, i, j);
                }
            }
        }
        System.out.println("Sap xep thanh cong!");
    }

    public void xuatTop5() {
        //Java Lambda Expressions(hai tham số) -> thực thi -so sánh
        Collections.sort(list, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
        //đã được sắp xếp giảm dần mới được
        if (list.size() < 5) {
            System.out.println("Danh sach cua ban co " + list.size() + " nhan vien");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | luong: %.2f | Thue thu nhap: %.2f | Thu nhap: %.2f", list.get(i).maNV, list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong(), list.get(i).getThueTN(), list.get(i).getThuNhap());
                System.out.println();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | luong: %.2f | Thue thu nhap: %.2f | Thu nhap: %.2f", list.get(i).maNV, list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong(), list.get(i).getThueTN(), list.get(i).getThuNhap());
                System.out.println();
            }
        }
    }
}
