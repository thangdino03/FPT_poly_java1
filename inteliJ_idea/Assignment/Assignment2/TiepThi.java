package Assignment2;

public class TiepThi extends NhanVien{
    private  double doanhSo;
    private double hoaHong;

    public TiepThi() {
    }

    public TiepThi(String maNV, String ten, double luong, double doanhSo, double hoaHong) {
        super(maNV, ten,luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getThuNhap(){
        return (this.getLuong() + doanhSo*hoaHong);
    }
}
