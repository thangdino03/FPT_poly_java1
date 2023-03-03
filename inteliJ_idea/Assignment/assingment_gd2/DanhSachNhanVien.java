package assingment_gd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("") || ID == null) {
                break;
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = sc.nextLine();
            System.out.print("Luong co ban: ");
            double luongCoBan = Double.parseDouble(sc.nextLine());
            System.out.print("Ban thuoc phong ban nao (Hanh chinh/kinh doanh): ");
            String phongBan = new Scanner(System.in).nextLine(); //thêm new Scanner (system.in) để làm trống bộ nhớ tạm
            if (phongBan.equalsIgnoreCase("Hanh Chinh")) {
                System.out.print("Nhap ngay cong: ");
                double ngayCong = sc.nextDouble();
                NhanVien newNV = new NVhanhchinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Kinh Doanh")) {
                System.out.print("Nhap luong kinh doanh: ");
                double luongKinhDoanh = sc.nextDouble();
                NhanVien newNV = new NVkinhdoanh(ID, name, luongCoBan, phongBan, luongKinhDoanh);
                list.add(newNV);
            }
//            else System.out.printf("vui long nhap lai!");
        } while (true);
    }

    //xuat
    public void xuat() {
        for (NhanVien nv : list) {
            System.out.println("----------------------------------------");
            System.out.println("Ma nhan vien: " + nv.getID());
            System.out.println("Ho ten:" + nv.getHoTen());
            System.out.println("Phong ban: " + nv.getPhongBan());
            System.out.println("Luong: " + nv.getLuong());

        }
    }

    //tim kiem
    public void timNV() {
        Scanner timnv = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String id = timnv.nextLine();
        boolean check = false;
        for (NhanVien nv : list) {
            if (id.equalsIgnoreCase(nv.getID())) {
                System.out.println("Ma nhan vien: " + nv.getID());
                System.out.println("Ho ten:" + nv.getHoTen());
                System.out.println("Phong ban: " + nv.getPhongBan());
                System.out.println("Luong: " + nv.getLuong());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai!");
        }
    }

    public void xoaNV() {
        Scanner timnv = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String id = timnv.nextLine();
        boolean check = false;
        for (NhanVien nv : list) {
            if (id.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai!");
        } else {
            System.out.println("Xoa thanh cong!");
        }
    }
    //cap nhat nhan vien
    public void capNhatNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String IDFind = sc.nextLine();
        NhanVien found = null;
        int index = 0;
        for (NhanVien nv : list) {
            if (IDFind.equalsIgnoreCase(nv.getID())) {
                found = nv;
                index = list.indexOf(nv);
                break;//khong co truong hop trung id
            }
        }
        if (found != null) {
            System.out.print("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("") || ID == null) {
                ID = found.getID();
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = sc.nextLine();
            if (name.equals("") || name == null) {
                name = found.getHoTen();
            }
            System.out.print("Nhap luong co ban: ");
            String luongCoBan = sc.nextLine();
            if (luongCoBan.equals("") || luongCoBan == null) {
                luongCoBan = String.valueOf(found.getLuongCoBan());
            }
            if (found instanceof NVhanhchinh) {
                System.out.print("Nhap ngay cong: ");
                String ngayCong = sc.nextLine();
                if (ngayCong.equals("") || ngayCong == null) {
                    ngayCong = String.valueOf(((NVhanhchinh) found).getNgayCong());
                }
                NhanVien nv = new NVhanhchinh(ID, name, Double.parseDouble(luongCoBan), "Hanh Chinh", Double.parseDouble(ngayCong));
                list.set(index, nv);
            }
            if (found instanceof NVkinhdoanh) {
                System.out.print("Nhap luong kinh doanh: ");
                String luongKinhDoanh = sc.nextLine();
                if (luongKinhDoanh.equals("") || luongKinhDoanh == null) {
                    luongKinhDoanh = String.valueOf(((NVkinhdoanh) found).getLuongKinhDoanh());
                }
                NhanVien nv = new NVkinhdoanh(ID, name, Double.parseDouble(luongCoBan), "Kinh doanh", Double.parseDouble(luongKinhDoanh));
                list.set(index, nv);
            }
        }else {
            System.out.println("Nhan vien khong ton tai !");
        }
    }

    //chucnang6
    public void chucNangsau() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim nhan vien theo khoang luong");
        System.out.println("Luong thap nhat: ");
        double min =sc.nextDouble();
        System.out.println("Nhap luong cao nhat: ");
        double max = sc.nextDouble();
        boolean test = false;
        for(NhanVien nv: list){
            if(nv.getLuong() >=min && nv.getLuong() <= max){
                test = true;
                System.out.println("----------------------------------------");
                System.out.println("Ma nhan vien: " + nv.getID());
                System.out.println("Ho ten:" + nv.getHoTen());
                System.out.println("Phong ban: " + nv.getPhongBan());
                System.out.println("Luong: " + nv.getLuong());
                System.out.println("");
            }
        }
        if(test ==false){
            System.out.println("Khong co khoang nhan vien trong khoang can tim");
        }
    }
    //chsc năng 7
    public void sapXeptheoTen(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        };
        Collections.sort(list,comp);
        xuat();
    }

    public void sapXeptheoLuong(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.getLuong()> nv2.getLuong()) return 1; //muốn giảm dần thì để dấu <
                else return -1;

            }
        };
        Collections.sort(list,comp);
        xuat();
    }


    //yc9: Xuất 5 nhân viên có thu nhập cao nhất.
    public void xuat5Caonhat(){
        Collections.sort(list,(a,b) -> (int) (b.getLuong() - a.getLuong()));
        for (int i=0; i<5;i++){
            System.out.println("----------------------------------------");
            System.out.println("Ma nhan vien: " + list.get(i).getID());
            System.out.println("Ho ten:" + list.get(i).getHoTen());
            System.out.println("Phong ban: " + list.get(i).getPhongBan());
            System.out.println("Luong: " + list.get(i).getLuong());
        }
    }

//    public void capnhatNV() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap ma nhan vien can cap nhat: ");
//        String proifleID = sc.nextLine();
//        NhanVien found = null; // chưa từng tồn tại, ko tồn tại
//        int index =0;
//        for (NhanVien nv : list) {
//            if (proifleID.equalsIgnoreCase(nv.getID())) {
//                found = nv;
//                index = list.indexOf(nv); //gán giá trị index hiện tại cho biến index kia
//                break;//khong co truong hợp trùng id
//            }
//        }
//        if (found == null) {
//            System.out.print("Nhap ma nhan vien: ");
//            String ID = sc.nextLine();
//            if (ID.equals("") || ID == null) {
//                ID = found.getID();//khi ng dùng k nhập gì. câu lệnh này giúp gán lại thông tin cũ.
//            }
//            System.out.print("Nhap ho ten nhan vien: ");
//            String name = sc.nextLine();
//            if (name.equals("") || name == null) {
//                name = found.getHoTen();//khi ng dùng k nhập gì. câu lệnh này giúp gán lại thông tin cũ.
//            }
//            System.out.print("Luong co ban: ");
//            //double luongCoBan = sc.nextDouble();
//            String luongCoBan = sc.nextLine();
//            if (luongCoBan.equals("") || luongCoBan == null) {
//                luongCoBan = String.valueOf(found.getLuongCoBan());//khi ng dùng k nhập gì. câu lệnh này giúp gán lại thông tin cũ.
//            }
//            if (found instanceof NVhanhchinh) {
//                System.out.print("Nhap ngay cong: ");
//                String ngayCong = sc.nextLine();
//                if (ngayCong.equals("") || ngayCong == null) {
//                    ngayCong = String.valueOf(((NVhanhchinh) found).getNgayCong());
//                }
//                NhanVien NV = new NVhanhchinh(ID, name, Double.parseDouble(luongCoBan), "Hanh Chinh", Double.parseDouble(ngayCong));
//                list.set(index,NV);
//            }
//            if (found instanceof NVkinhdoanh){
//                System.out.print("Nhap luon kinh doanh: ");
//                String luongKinhDoanh= sc.nextLine();
//                if(luongKinhDoanh.equals("")||luongKinhDoanh==null){
//                    luongKinhDoanh=String.valueOf(((NVkinhdoanh)found).getLuongKinhDoanh());
//                }
//                NhanVien nv= new NVkinhdoanh(ID, name, Double.parseDouble(luongCoBan), "Kinh Doanh", Double.parseDouble(luongKinhDoanh));
//                list.set(index,nv);
//            }
//
//            System.out.println("Cap nhat thanh cong!");
//        } else {
//            System.out.println("Nhan vien khong ton tai!");
//        }
//    }

    //menu
//    public void menu(){
//        Scanner sc= new Scanner(System.in);
//        int chon;
//        do{
//            System.out.println("+------------------------------MENU-----------------------------------+");
//            System.out.println("|  0. Thoat ctrinh                                                    |");
//            System.out.println("|  1. Nhap danh sach nhan vien tu ban phim.                           |");
//            System.out.println("|  2. Xuat danh sach nhan vien ra man hinh.                           |");
//            System.out.println("|  3. Tim va hien thi nhan vien theo ma nhap tu ban phim              |");
//            System.out.println("|  4. Xoa nhan vien theo ma nhap tu ban phim                          |");
//            System.out.println("|  5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim           |");
//            System.out.println("|  6. Tim cac nhan vien theo khoang luong nhap tu ban phim            |");
//            System.out.println("|  7. Sap xep nhan vien theo ho va ten                                |");
//            System.out.println("|  8. Sap xep nhan vien theo thu nhap                                 |");
//            System.out.println("|  9. Xuat 5 nhan vien co thu nhap cao nhat                           |");
//            System.out.println("+---------------------------------------------------------------------+");
//
//            System.out.print("Moi chon chuc nang: ");
//            chon= sc.nextInt();
//            switch(chon){
//                case 0:
//                    System.out.println("Cam on da su dung ctrinh!");
//                    break;
//                case 1:
//                    nhap();
//                    break;
//                case 2:
//                    xuat();
//                    break;
//                case 3:
//                    System.out.println("Chuc nang 3");
//                    break;
//                case 4:
//                    System.out.println("Chuc nang 4");
//                    break;
//                case 5:
//                    System.out.println("Chuc nang 5");
//                    break;
//                case 6:
//                    System.out.println("Chuc nang 6");
//                    break;
//                case 7:
//                    System.out.println("Chuc nang 7");
//                    break;
//                case 8:
//                    System.out.println("Chuc nang 8");
//                    break;
//                case 9:
//                    System.out.println("Chuc nang 9");
//                    break;
//                default:
//                    System.out.println("Nhap sai. moi nhap lai");
//            }
//
//        }while(chon !=0);
//
//    }

}
