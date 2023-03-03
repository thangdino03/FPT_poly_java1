package Demo.slide6;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String matKhau;
    private String hoTen;
    private String eMail;
    private String soDT;
    private String soXeMay;
    private String cmND;
    private String webSite;
    public SinhVien(String maSV, String matKhau, String hoTen, String eMail, String soDT, String soXeMay, String cmND, String webSite) {
        this.maSV = maSV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.eMail = eMail;
        this.soDT = soDT;
        this.soXeMay = soXeMay;
        this.cmND = cmND;
        this.webSite = webSite;
    }

    public SinhVien() {
        
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        Datavalilation dv= new Datavalilation();
        do {
            System.out.printf("moi nhap ma sv: ");
            maSV = sc.nextLine();
            if (dv.isMa(maSV)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //nhap mk
        do {
            System.out.printf("moi nhap mat khau: ");
            matKhau = sc.nextLine();
            if (dv.isMatkhau(matKhau)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap ho ten: ");
            hoTen = sc.nextLine();
            if (dv.isHoTen(hoTen)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap Email: ");
            eMail = sc.nextLine();
            if (dv.isEmail(eMail)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap SDT: ");
            soDT = sc.nextLine();
            if (dv.isSDT(soDT)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap so xe may: ");
            soXeMay = sc.nextLine();
            if (dv.isXemay(soXeMay)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap so CMND: ");
            cmND = sc.nextLine();
            if (dv.isCMND(cmND)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
        //
        do {
            System.out.printf("moi nhap website: ");
            webSite = sc.nextLine();
            if (dv.isWebsite(webSite)) {
                System.out.println("Nhap dung");
                break;
            } else {
                System.out.println("Nhap sai");
            }
        } while (true);
    }
    public void xuat(){
        this.maSV= maSV;
        this.matKhau=matKhau;
        this.hoTen=hoTen;
        this.eMail=eMail;
        this.soDT=soDT;
        this.soXeMay=soXeMay;
        this.cmND=cmND;
        this.webSite=webSite;

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoXeMay() {
        return soXeMay;
    }

    public void setSoXeMay(String soXeMay) {
        this.soXeMay = soXeMay;
    }

    public String getCmND() {
        return cmND;
    }

    public void setCmND(String cmND) {
        this.cmND = cmND;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
