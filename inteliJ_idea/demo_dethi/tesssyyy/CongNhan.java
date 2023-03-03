/**
 * CongNhan
 */
public abstract class CongNhan {
    protected String hoTen;
    protected int age;
    private int soLuongSanPham;
    private float donGiaSanPham;

    public CongNhan(String hoTen, int age, int soLuongSanPham, float donGiaSanPham) {
        this.hoTen = hoTen;
        this.age = age;
        this.soLuongSanPham = soLuongSanPham;
        this.donGiaSanPham = donGiaSanPham;
    }

    public CongNhan() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    public float getDonGiaSanPham() {
        return donGiaSanPham;
    }

    public void setDonGiaSanPham(float donGiaSanPham) {
        this.donGiaSanPham = donGiaSanPham;
    }

    public int tienLuong() {
        return (int) (soLuongSanPham * donGiaSanPham);
    }

    public void inRa() {
        System.out
                .println("[hoTen=" + hoTen + ", age=" + age + ", soLuongSanPham=" + soLuongSanPham + ", donGiaSanPham="
                        + donGiaSanPham + "]");
    }
}