//package Slide6;
//
//
//import java.util.Scanner;
//
//public class NhanVien {
//
//    private String maNV;
//    private String matKhau;
//    private String hoTen;
//    private String email;
//    private String sdt;
//    private String soXeMay;
//    private String cmnd;
//    private String website;
//
//    public NhanVien() {
//    }
//
//    public NhanVien(String maNV, String matKhau, String hoTen, String email, String sdt, String soXeMay, String cmnd, String website) {
//        this.maNV = maNV;
//        this.matKhau = matKhau;
//        this.hoTen = hoTen;
//        this.email = email;
//        this.sdt = sdt;
//        this.soXeMay = soXeMay;
//        this.cmnd = cmnd;
//        this.website = website;
//    }
//
//    public void xuatNV() {
//        System.out.printf("\n%s - %s - %s - %s - %s - %s -%s - %s ", maNV, matKhau, hoTen,email ,sdt,soXeMay,cmnd,website    );
//    }
//
//    public void nhapNV(Scanner sc) {
//        DataValidation dv = new DataValidation();
//        do {
//            System.out.println("Nhap maNV: (5KYTUHOA) ");
//            maNV = sc.nextLine();
//            if (dv.isMaNV(maNV)) {
//                break;
//            } else {
//                System.out.println("Ma NV ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap matKhau: (it nhat 6 ky tu) ");
//            matKhau = sc.nextLine();
//            if (dv.ismatKhau(matKhau)) {
//                break;
//            } else {
//                System.out.println("MatKhau ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap hoTen: (chu thuong, HOA, dau cach ");
//            hoTen = sc.nextLine();
//            if (dv.isHoTen(hoTen)) {
//                break;
//            } else {
//                System.out.println("HoTen ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap email: ");
//            email = sc.nextLine();
//            if (dv.isEmail(email)) {
//                break;
//            } else {
//                System.out.println("Email ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap sdt: 083 va 7so");
//            sdt = sc.nextLine();
//            if (dv.isSdt(sdt)) {
//                break;
//            } else {
//                System.out.println("Sdt ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap So Xemay: (5so-CHUHOA-(4so hoac 3so.2so)");
//            soXeMay = sc.nextLine();
//            if (dv.isSoXeMay(soXeMay)) {
//                break;
//            } else {
//                System.out.println("soXeMay ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap CMND (10 chu so): ");
//            cmnd = sc.nextLine();
//            if (dv.isCMND(cmnd)) {
//                break;
//            } else {
//                System.out.println("CMND ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//        do {
//            System.out.println("Nhap So Website(http://www\\.\\w+\\.\\w{2,4}) : ");
//            website = sc.nextLine();
//            if (dv.isWeb(website)) {
//                break;
//            } else {
//                System.out.println("Website ko hop le. Vui long nhap lai");
//            }
//        } while (true);
//    }
//
//    public String getMaNV() {
//        return maNV;
//    }
//
//    public void setMaNV(String maNV) {
//        this.maNV = maNV;
//    }
//
//    public String getMatKhau() {
//        return matKhau;
//    }
//
//    public void setMatKhau(String matKhau) {
//        this.matKhau = matKhau;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    public void setHoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSdt() {
//        return sdt;
//    }
//
//    public void setSdt(String sdt) {
//        this.sdt = sdt;
//    }
//
//    public String getSoXeMay() {
//        return soXeMay;
//    }
//
//    public void setSoXeMay(String soXeMay) {
//        this.soXeMay = soXeMay;
//    }
//
//    public String getCmnd() {
//        return cmnd;
//    }
//
//    public void setCmnd(String cmnd) {
//        this.cmnd = cmnd;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//}
