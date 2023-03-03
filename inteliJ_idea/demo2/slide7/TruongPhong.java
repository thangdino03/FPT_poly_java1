package demo2.slide7;



public class TruongPhong extends NhanVien {
    double tienTrachNhiem;

    public TruongPhong(String hoTen, double luong, double tienTrachNhiem) {
        super(hoTen, luong);
        this.tienTrachNhiem = tienTrachNhiem;
    }

    double getThuNhap(){
        return lUong+tienTrachNhiem;
    }

    protected void xuat(){
        System.out.println(" ");
         super.xuat();
        System.out.printf("\nTientrachnhiem: %.0f\nThu nhap: %.0f", tienTrachNhiem, getThuNhap() );
    }
}
