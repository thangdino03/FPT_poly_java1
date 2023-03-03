package demo2.slide7;

public class MainKeThua {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Nguyen nv", 15000);
        nv.xuat();
        TruongPhong tp = new TruongPhong("Nguyen tp", 20000, 5000);
        tp.xuat();
        LaoCong lc= new LaoCong("Phan Lao", 50, 150);
        lc.xuat();

    }
}
