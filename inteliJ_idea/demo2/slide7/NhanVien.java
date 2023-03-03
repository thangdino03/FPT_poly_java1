package demo2.slide7;

public class NhanVien {
    protected String hoTen;
    protected double lUong;

    public NhanVien(String hoTen, double lUong) {
        this.hoTen = hoTen;
        this.lUong = lUong;
    }

    double getThuNhap(){
        return lUong;
    }

    protected void xuat(){

        System.out.printf("\nHo ten: %s \nLuong: %.0f\nThuNhap: %.0f", hoTen, lUong, getThuNhap());

    }
}
