package Assignment;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(String maNV, String ten, double luong, double doanhSo, double hueHong) {
        super(maNV, ten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getThuNhap() {
        return (this.getLuong() + doanhSo * hueHong);
    }
}
