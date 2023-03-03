package Assignment_GD2ne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;
public class DanhSachNhanVien {
    ArrayList<NhanVIenNe> listNV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void DanhSachnee() {
        NhanVIenNe nv1 = new NVHanhChinh("ID3345", "Nguyen Dinh Nghi", 15000000);
        NhanVIenNe nv2 = new TiepThi("ID3347", "Huynh Ngoc Hoai Thuong", 10000000, 20000000, 0.1);
        NhanVIenNe nv3 = new NVHanhChinh("ID3349", "Nguyen Thu Thu Ha", 8000000);
        NhanVIenNe nv4 = new TruongPhong("ID3440", "Thu Huyen", 10000000, 5000000);
        NhanVIenNe nv5 = new NVHanhChinh("ID4444", "Nguyen Chi Linh", 12000000);
        listNV.add(nv1);
        listNV.add(nv2);
        listNV.add(nv3);
        listNV.add(nv4);
        listNV.add(nv5);
    }

    //Y1: Nhap danh sach
    public void NhapDanhSach() {
        do {
            System.out.println("1.Nhan vien hanh chinh \n2.Truong phong \n3.Nhan vien tiep thi \n0.Ket thuc chon");
            System.out.println("Moi chon:");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    NVHanhChinh nvhc = new NVHanhChinh();
                    nvhc.Nhapthongtin();
                    listNV.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.Nhapthongtin();
                    listNV.add(tp);
                    break;
                case 3:
                    TiepThi nvtt = new TiepThi();
                    nvtt.Nhapthongtin();
                    listNV.add(nvtt);
                    break;
            }

            if (chon == 0) {
                break;
            }
        } while (true);

    }

    //y2
    public void XuatDanhSach() {
        for (NhanVIenNe nv : listNV) {
            if (nv instanceof NVHanhChinh) { //neu nv thuoc NhanVienHanhChinh
                ((NVHanhChinh) nv).Xuatthongtin(); //ép nv về nhân viên hành chính
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).Xuatthongtin();
            } else if (nv instanceof TiepThi) {
                ((TiepThi) nv).Xuatthongtin();
            }
        }
    }

    //y3 tim nhan vien theo ma
    public void TimNhanVienTheoMa() {
        sc.nextLine();
        System.out.print("\nNhap ma nhan vien can tim: ");
        String ma = sc.nextLine();
        boolean ktra = false;
        for (NhanVIenNe nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                ktra = true;
                if (nv instanceof NVHanhChinh) {
                    ((NVHanhChinh) nv).Xuatthongtin();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).Xuatthongtin();
                } else if (nv instanceof TiepThi) {
                    ((TiepThi) nv).Xuatthongtin();
                }
                break;
            }

            if (ktra == false) {
                System.out.println("Khong tim thay nhan vien");
            }
        }
    }

    //y4
    public void XoaNhanVien() {
        sc.nextLine();
        System.out.print("\nNhap ma nhan vien can xoa: ");
        String ma = sc.nextLine();
        boolean ktra = false;

        for (NhanVIenNe nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                ktra = true;
                listNV.remove(nv);
                System.out.println("Xoa thanh cong !");
                break;
            }
            if (ktra == false) {
                System.out.println("Khong tim thay nhan vien");
            }
        }
    }

    //y5
    public void CapNhatNhanVien() {
        sc.nextLine();
        System.out.print("\nNhap ma nhan vien can sua: ");
        String ma = sc.nextLine();
        boolean ktra = false;
        for (NhanVIenNe nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                ktra = true;
                if (nv instanceof NVHanhChinh) {
                    ((NVHanhChinh) nv).Nhapthongtin();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).Nhapthongtin();
                } else if (nv instanceof TiepThi) {
                    ((TiepThi) nv).Nhapthongtin();
                }
                break;
            }

            if (ktra == false) {
                System.out.println("Khong tim thay nhan vien");
                break;
            }
        }
    }

    //y6
    public void TimNhanVienTheoKhoangLuong() {
        double bd;
        double kt;
        do {
            System.out.print("\nNhap khoang luong bat dau: ");
            bd = sc.nextDouble();
            System.out.print("\nNhap khoang luong ket thuc ");
            kt = sc.nextDouble();

            if (bd > kt) {
                System.out.println("Nhap lai!");
            } else {
                break;
            }

        } while (true);

        boolean ktra = false;
        for (NhanVIenNe nv : listNV) {
            if (nv.getThuNhap() >= bd && nv.getThuNhap() <= kt) {
                ktra = true;
                if (nv instanceof NVHanhChinh) {
                    ((NVHanhChinh) nv).Xuatthongtin();
                } else if (nv instanceof TruongPhong) {
                    ((TruongPhong) nv).Xuatthongtin();
                } else if (nv instanceof TiepThi) {
                    ((TiepThi) nv).Xuatthongtin();
                }
                break;

            }

            if (ktra == false) {
                System.out.println("Khong tim thay nhan vien");
            }
        }
    }

    //y7
    public void SapXepTheoTen() {

//        Collections.sort(listNV, (nv1, nv2) -> (int) (nv1.getTennv().compareTo(nv2.getTennv())));
        Comparator<NhanVIenNe> comp = new Comparator<NhanVIenNe>() { //nếu sx các phần tử có kiểu là các lớp ng dùng tự tạo thì phải sd comparator , (sap xep doi tuong)
            @Override
            public int compare(NhanVIenNe o1, NhanVIenNe o2) {
                return o1.SapXepTheoTenNV().compareTo(o2.SapXepTheoTenNV());
            }
        };
        Collections.sort(listNV, comp);
        XuatDanhSach();

    }

    public void SapXepTheoThuNhap() {

        Comparator<NhanVIenNe> comp = new Comparator<NhanVIenNe>() { //nếu sx các phần tử có kiểu là các lớp ng dùng tự tạo thì phải sd comparator , (sap xep doi tuong)
            @Override
            public int compare(NhanVIenNe o1, NhanVIenNe o2) {
                return Double.compare(o1.getThuNhap(), o2.getThuNhap());
            }
        };
        Collections.sort(listNV, comp);
        XuatDanhSach();

    }

    public void Xuat5NhanVien() {
        SapXepTheoThuNhap();
        Collections.reverse(listNV);
        if (listNV.size() < 5) {
            System.out.println("\nlist co:" + listNV.size() + "NV:");
            for (int i = 0; i < listNV.size(); i++) {
                listNV.toString();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                //listNV.get(i).Xuatthongtin();
                if (listNV.get(i) instanceof NVHanhChinh) {
                    ((NVHanhChinh) listNV.get(i)).Xuatthongtin();
                } else if (listNV.get(i) instanceof TruongPhong) {
                    ((TruongPhong) listNV.get(i)).Xuatthongtin();
                } else if (listNV.get(i) instanceof TiepThi) {
                    ((TiepThi) listNV.get(i)).Xuatthongtin();
                }
            }
        }
    }

    public void Menu() {
        int chon;
        System.out.println("+-----------------------------MENU----------------------------+");
        System.out.println("| 0.Thoat Ctrinh                                              |");
        System.out.println("| 1.Nhap danh sach nhan vien tu ban phim.                     |");
        System.out.println("| 2.Xuat danh sach nhan vien ra man hinh.                     |");
        System.out.println("| 3.Tim va hien thi nhan vien theo ma nhap tu ban phim.       |");
        System.out.println("| 4.Xoa nhan vien theo ma nhap tu ban phim.                   |");
        System.out.println("| 5.Cap nhat thong tin nhan vien theo ma nhap tu ban phim.    |");
        System.out.println("| 6.Tim cac nhan vien theo khoang luong nhap tu ban phim.     |");
        System.out.println("| 7.Sap xep nhan vien theo ten.                               |");
        System.out.println("| 8.Sap xep nhan vien theo thu nhap.                          |");
        System.out.println("| 9.Xuat 5 nhan vien co thu nhap cao nhat.                    |");
        System.out.println("+-------------------------------------------------------------+");
        do {
            System.out.println("");
            System.out.print("Moi ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    NhapDanhSach();
                    break;
                case 2:
                    DanhSachnee();
                    XuatDanhSach();
                    break;
                case 3:
                    TimNhanVienTheoMa();
                    break;
                case 4:
                    XoaNhanVien();
                    break;
                case 5:
                    CapNhatNhanVien();
                    break;
                case 6:
                    TimNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    SapXepTheoTen();
                    break;
                case 8:
                    SapXepTheoThuNhap();
                    break;
                case 9:
                    Xuat5NhanVien();
                    break;
                case 10:
                    System.out.println("Ket thuc!");
                    break;
                default: //tùy chọn
                    System.out.println("Ban nhap sai!");

            }
        } while (chon != 10);
        System.out.println("Cam on da dung chuong trinh");

    }
}
