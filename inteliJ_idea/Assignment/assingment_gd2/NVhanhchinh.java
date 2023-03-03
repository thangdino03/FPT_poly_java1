package assingment_gd2;

public class NVhanhchinh extends NhanVien {
    private double ngayCong;

    public NVhanhchinh(String ID, String hoTen, double luongCoBan, String phongBan, double ngayCong) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    double getLuong() {
        return luongCoBan*ngayCong;
    }
}
