package Demo.slide7;

public class NhanVien {
    public String hoTen;
    protected double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    void xuat(){
        System.out.printf("Ho Ten: %s -- luong: %f" +this.hoTen +this.luong);
    }
}
