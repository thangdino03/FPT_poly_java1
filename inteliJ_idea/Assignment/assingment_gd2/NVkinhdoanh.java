package assingment_gd2;

public class NVkinhdoanh extends NhanVien {
    private double luongKinhDoanh;

    public NVkinhdoanh(String ID, String hoTen, double luongCoBan, String phongBan, double luongKinhDoanh) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.luongKinhDoanh = luongKinhDoanh;
    }

    public double getLuongKinhDoanh() {
        return luongKinhDoanh;
    }

    public void setLuongKinhDoanh(double luongKinhDoanh) {
        this.luongKinhDoanh = luongKinhDoanh;
    }

    @Override
    double getLuong() {
        return luongCoBan+luongKinhDoanh;
    }
}
