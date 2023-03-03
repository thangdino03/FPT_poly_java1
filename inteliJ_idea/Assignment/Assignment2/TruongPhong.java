package Assignment2;

public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(String maNV, String ten, double luong, double trachNhiem) {
        super(maNV, ten, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    public double getThuNhap(){
        return (this.getLuong()+trachNhiem);
    }
}
