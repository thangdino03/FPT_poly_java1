package Assignment_GD2ne;
import java.util.Scanner;
import Assignment2.NhanVien;

public class TruongPhong extends NhanVIenNe {
    private double luongTN;

    public TruongPhong() {
    }

    public TruongPhong( String manv, String tennv, double luongCB,double luongTN) {
        super(manv, tennv, luongCB);
        this.luongTN = luongTN;
    }

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }


    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        super.Nhapthongtin();
        int kt;
        do {
            kt = 0;
            System.out.print("Nhap luong trach nhiem: ");
            try {
                luongTN = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Nhap sai,luong trach nhiem phai la so!");
                kt = 1;
            }
            sc.nextLine();
        } while (kt == 1);

    }

    public void Xuatthongtin() {
        super.Xuatthongtin();
        System.out.println("Luong trach nhiem: "+luongTN);
        System.out.println("Thu Nhap: "+getThuNhap());
//        System.out.printf("\t--Luong trach nhiem: %.0f\t--Thu nhap: %.0f",luongTN,getThuNhap());
    }



    public double getThuNhap() {
        return super.getLuongCB() + luongTN;

    }
}
