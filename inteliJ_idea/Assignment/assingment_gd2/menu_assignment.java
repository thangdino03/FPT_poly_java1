package assingment_gd2;



import java.util.Scanner;

public class menu_assignment {
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
       NhanVien nv01 = new NVhanhchinh("NV01", "Cuong",  5000,"Hanh Chinh", 3);
       NhanVien nv02 = new NVhanhchinh("NV02", "Nam",  4000, "Hanh Chinh", 3);
       NhanVien nv03 = new NVhanhchinh("NV03", "Hoang",  7000, "Hanh Chinh", 4);
       NhanVien nv04 = new NVkinhdoanh("NV04", "Trong", 9000, "Kinh Doanh", 50000);
       NhanVien nv05 = new NVkinhdoanh("NV05", "Van", 8966, "Kinh Doanh", 40000);
       NhanVien nv06 = new NVkinhdoanh("NV06", "Dung", 4578, "Kinh Doanh", 20000);
       dsnv.list.add(nv01);
       dsnv.list.add(nv02);
       dsnv.list.add(nv03);
       dsnv.list.add(nv04);
       dsnv.list.add(nv05);
       dsnv.list.add(nv06);
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("+------------------------------MENU-----------------------------------+");
            System.out.println("|  0. Thoat ctrinh                                                    |");
            System.out.println("|  1. Nhap danh sach nhan vien tu ban phim.                           |");
            System.out.println("|  2. Xuat danh sach nhan vien ra man hinh.                           |");
            System.out.println("|  3. Tim va hien thi nhan vien theo ma nhap tu ban phim              |");
            System.out.println("|  4. Xoa nhan vien theo ma nhap tu ban phim                          |");
            System.out.println("|  5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim           |");
            System.out.println("|  6. Tim cac nhan vien theo khoang luong nhap tu ban phim            |");
            System.out.println("|  7. Sap xep nhan vien theo ho va ten                                |");
            System.out.println("|  8. Sap xep nhan vien theo thu nhap                                 |");
            System.out.println("|  9. Xuat 5 nhan vien co thu nhap cao nhat                           |");
            System.out.println("+---------------------------------------------------------------------+");

            System.out.print("Moi chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Cam on da su dung ctrinh!");
                    break;
                case 1:
                    dsnv.nhap();
                    break;
                case 2:
                    dsnv.xuat();
                    break;
                case 3:
                    dsnv.timNV();
                    break;
                case 4:
                    dsnv.xoaNV();
                    break;
                case 5:
                    dsnv.capNhatNV();
                    break;
                case 6:
                    dsnv.chucNangsau();
                    break;
                case 7:
                    dsnv.sapXeptheoTen();
                    break;
                case 8:
                    dsnv.sapXeptheoLuong();
                    break;
                case 9:
                    dsnv.xuat5Caonhat();
                    break;
                default:
                    System.out.println("Nhap sai. moi nhap lai!");
            }

        } while (chon != 0);

    }
}
