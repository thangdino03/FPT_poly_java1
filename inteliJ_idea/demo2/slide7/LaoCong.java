package demo2.slide7;

public class LaoCong extends NhanVien {
    double soGioLamViec;

    public LaoCong(String hoTen, double lUong, double soGioLamViec) {
        super(hoTen, lUong);
        this.soGioLamViec = soGioLamViec;
    }
    //
    double getThuNhap(){
        return lUong*soGioLamViec;
    }

    protected void xuat(){
        super.xuat();
        System.out.println(" ");
        System.out.printf("\nSogio: %.0f\nThuNhap: %.0f", soGioLamViec, getThuNhap() );
    }

}
