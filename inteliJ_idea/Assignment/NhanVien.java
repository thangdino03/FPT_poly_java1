package Assignment;

public class NhanVien {
    private String maNV;
    private String ten;
    private double luong;
    public double getThuNhap(){
        return luong;
    }
    public double getThueTN(){
        if(luong<9)return 0;
        else if(luong<=15)return(0.1*luong);
        else return(0.1 *15+(luong-15)*0.12);
    }
public void xuat(){
    System.out.printf("\nMa:%s--HoTen:%s--Luong:%.0f--ThuNHap:%.0f",maNV,ten,luong,getThuNhap(),getThueTN());
}
    public NhanVien(){
    }
    
    public NhanVien(String maNV, String ten,double luong){
        this.maNV = maNV;
        this.ten = ten;
        this.luong = luong;           
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
