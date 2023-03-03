package Assignment2;

public class NhanVien {
    private String maNV;
    private String ten;
    private double luong;

    public double getThuNhap(){
        return luong;
    }
    public double getThueThuNhap(){
        if(luong<9) return 0;
        else if(luong <=15) return (0.1 * luong); //10%
        else return (0.1*15 + (luong-15)*0.12);
    }
    public void xuat(){
        System.out.println("Ma: "+maNV);
        System.out.println("Ho ten: "+ten);
        System.out.println("Luong: "+luong);
        System.out.println("Thu nhap: "+getThuNhap());
        System.out.println("Thue: "+getThueThuNhap());
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, double luong) {
        this.maNV = maNV;
        this.ten = ten;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
