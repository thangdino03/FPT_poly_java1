package Assignment_GD2ne;

public class NVHanhChinh extends NhanVIenNe {
    public NVHanhChinh() {
    }

    public NVHanhChinh(String manv, String tennv, double luongCB) {
        super(manv, tennv, luongCB);
    }


    public double getThuNhap() {
        return super.getLuongCB();
    }
}
