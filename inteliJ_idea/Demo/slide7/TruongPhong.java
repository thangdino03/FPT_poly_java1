package Demo.slide7;

public class TruongPhong extends NhanVien{
    public double tienTrachNhiem;

    public TruongPhong(String hoTen, double luong, double tienTrachNhiem) {
        super(hoTen,luong);
        this.tienTrachNhiem = tienTrachNhiem;
    }
    void xuat (){
        System.out.printf("%s--%f--%f", hoTen, luong, tienTrachNhiem);
        }
    }


