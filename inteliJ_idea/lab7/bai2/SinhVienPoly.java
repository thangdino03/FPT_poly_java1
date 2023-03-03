package lab7.bai2;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    abstract double getDiem();

    public String getHocLuc(){
        String hocLuc ;
        double diem= getDiem();
        if(diem>=9){
            hocLuc = "Xuat sac";
        }else if (diem >=7.5){
            hocLuc ="Gioi";
        } else if (diem >=6.5) {
            hocLuc= "kha";
        } else if (diem>=5) {
            hocLuc= "trung binh";
        }else {
            hocLuc = "Yeu"; //để gán cho chuỗi học lực chứ k in ra
        }
        return hocLuc;
    }
}
