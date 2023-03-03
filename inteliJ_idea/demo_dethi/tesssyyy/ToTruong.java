/**
 * ToTruong
 */
public class ToTruong extends CongNhan {
    protected int LuongtrachNhiem;
    protected int TienThuong;

    public ToTruong(String hoTen, int age, int luongtrachNhiem, int tienThuong) {
        super(hoTen, age, luongtrachNhiem, tienThuong);
        LuongtrachNhiem = luongtrachNhiem;
        TienThuong = tienThuong;
    }

    public ToTruong(int luongtrachNhiem, int tienThuong) {
        LuongtrachNhiem = luongtrachNhiem;
        TienThuong = tienThuong;
    }

    public int getLuongtrachNhiem() {
        return LuongtrachNhiem;
    }

    public void setLuongtrachNhiem(int luongtrachNhiem) {
        LuongtrachNhiem = luongtrachNhiem;
    }

    public int getTienThuong() {
        return TienThuong;
    }

    public void setTienThuong(int tienThuong) {
        TienThuong = tienThuong;
    }

    public int tienLuong() {
        return LuongtrachNhiem + TienThuong;
    }

    public void inRa() {
        System.out.println("Ho ten: " + getHoTen() + " Tuoi: " + getAge() + " Luong trach nhiem: "
                + getLuongtrachNhiem() + " Tien thuong: " + getTienThuong());
    }

}