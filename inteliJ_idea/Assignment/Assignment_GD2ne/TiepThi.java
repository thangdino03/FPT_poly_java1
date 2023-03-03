package Assignment_GD2ne;
import java.util.Scanner;

public class TiepThi extends NhanVIenNe{
    private double doanhSo;
    private double hoaHong;

    public TiepThi() {
    }

    public TiepThi(String manv, String tennv, double luongCB,double doanhSo, double hoaHong) {
        super(manv, tennv, luongCB);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public void Nhapthongtin() {
        super.Nhapthongtin();
        int kt;
        Scanner sc = new Scanner(System.in);
        do {
            kt = 0;
            System.out.print("Nhap doanh so: ");
            try {
                doanhSo = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Nhap sai,doanh so phai la so!");
                kt = 1;
            }
            sc.nextLine();
        } while (kt == 1);

        do {
            kt = 0;
            System.out.print("Nhap hoa hong: ");
            try {
                hoaHong = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Nhap sai,hoa hong phai la so!");
                kt = 1;
            }
            sc.nextLine();
        } while (kt == 1);

    }


    public void Xuatthongtin() {
        super.Xuatthongtin();
        System.out.println("Doanh so: "+doanhSo);
        System.out.println("Hoa hong: "+hoaHong);
        System.out.println("Thu nhap: "+getThuNhap());
//        System.out.printf("\t--Doanh so: %.0f\t--Hoa hong: %.2f\t--Thu nhap: %.0f", doanhSo, hoaHong, getThuNhap());
    }

    public double getThuNhap() {
        return super.getLuongCB() + doanhSo * hoaHong;
    }
}
