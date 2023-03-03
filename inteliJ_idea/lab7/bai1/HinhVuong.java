package lab7.bai1;

public class HinhVuong extends ChuNhat {
    public HinhVuong(double canh){
        super(canh, canh);
        double rong= canh;
    }
    public void xuat(){
        System.out.println("  ");
        System.out.printf("Chu vi hinh vuong: %.2f\nDien tich hinh vuong: %.2f",chuVi(), dienTich());
    }



}
