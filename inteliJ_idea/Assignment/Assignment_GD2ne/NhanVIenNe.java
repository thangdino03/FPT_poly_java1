package Assignment_GD2ne;
import java.util.Scanner;
public class NhanVIenNe {
    private String maNV;
    private String tenNV;
    private double luongCB;

    public NhanVIenNe() {
    }

    public NhanVIenNe(String maNV, String tenNV, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setManv(String maNV) {
        this.maNV = maNV;
    }

    public String getTennv() {
        return tenNV;
    }

    public void setTennv(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public void Nhapthongtin(){
        Scanner sc = new Scanner(System.in);

        String reTenNV = "[a-zA-Z ]+";
        String reMaNV = "\\w{1,10}";

        do {
            System.out.println("Nhap ho va ten nhan vien: ");
            tenNV = sc.nextLine();
            if (tenNV.matches(reTenNV)) {
                break;
            } else {
                System.out.println("Moi nhap lai,ban nhap khong dung dang ten!");
            }
        } while (true);

        do {
            System.out.println("Nhap ma nhan vien: ");
            maNV = sc.nextLine();
            if (maNV.matches(reMaNV)) {
                break;
            } else {
                System.out.println("Moi nhap lai,ban nhap khong dung dang ma!");
            }
        } while (true);

        int kt;
        do {
            kt=0;
            System.out.println("Nhap luong: ");
            try {
                luongCB = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Nhap sai,luong phai la so!");
                kt=1;
            }
            sc.nextLine();// xoa bo nho
        } while (kt==1);


//        System.out.print("Nhap ma nhan vien: ");
//        manv = sc.nextLine();
//        System.out.print("Nhap ten nhan vien: ");
//        tennv = sc.nextLine();
//        System.out.print("Nhap luong: ");
//        luongCB = sc.nextDouble();
    }

    public void Xuatthongtin(){
        System.out.println("------------------------------------------------------");
        System.out.println("Ma nhan vien: "+maNV.toUpperCase());
        System.out.println("Ten nhan vien: "+tenNV.toUpperCase());
        System.out.println("Luong co ban: "+luongCB);
        System.out.println("Thue thu nhap: "+getThuethunhap());
//        System.out.printf("\nMa nhan vien: %s\t---Ten nhan vien: %s\t---Luong co ban: %.0f\t--Thue: %.0f",maNV.toUpperCase(),tenNV.toUpperCase(),luongCB,getThuethunhap());
    }

    public  double getThuNhap(){
        return this.luongCB;
    }

    public double getThuethunhap(){
        double thue = 0;
        if(getThuNhap() < 9000000){
            thue = 0;
        }else if(getThuNhap() <= 15000000 ){
            thue = getThuNhap() *0.1;
        }else if(getThuNhap() >= 15000000){
            thue = 0.1*15000000 + (getThuNhap()-15000000)* 0.12;
        }
        return thue;
    }

    public String SapXepTheoTenNV(){
        String ten;
        ten = this.tenNV.substring(tenNV.lastIndexOf(" ")+1);
        return  ten ;
    }
}
