package assmgd2;

public abstract class NhanVien {
    protected String maNV, hoTen, phongBan;
    protected double luong;
    abstract double getThuNhap();
    double getThueTN(){
        double thueTN;
        if (getThuNhap() < 9000) {
            thueTN = 0;
        } else if (getThuNhap() <= 15000) {
            thueTN = getThuNhap() * 0.1;
        } else {
            thueTN = (15000 - 9000) * 0.1 + (getThuNhap() - 15000) * 0.12;
        }
        return thueTN;
    }

    public NhanVien(String maNV, String hoTen, String phongBan, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
  
    public void xuat(){
        System.out.printf("Ma NV: %s | Ho ten: %s | Phong ban: %s | Luong: %.0f",maNV, hoTen, phongBan,luong);
    }
    
}
