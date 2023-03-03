package lab6.bai3;

import Demo.slide6.SinhVien;

import java.util.Scanner;

public class SinhVien6 {
    private String hoTen;
    private String gemail;
    private String soDT;
    private String cmnD;

    public SinhVien6(){
    }
    public SinhVien6(String hoTen){
        super();
        this.hoTen = hoTen;
    }

    public SinhVien6(String hoTen, String gemail, String soDT, String cmnD) {
        super();
        this.hoTen = hoTen;
        this.gemail = gemail;
        this.soDT = soDT;
        this.cmnD = cmnD;
    }

 public void nhap6(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("-------------------------");
            System.out.printf("Moi nhap ten: ");
            hoTen = sc.nextLine();
            String rehoTen="[a-zA-Z]+";
            if(!hoTen.matches(rehoTen)){
                System.out.println("nhap sai dinh dang");
            }else{
                System.out.println("nhap dung!");
                break;
            }
        }while (true);
        //
        do {
            System.out.printf("Moi nhap Email: ");
            String regemail="\\w+@\\w+(\\.\\w+){1,2}";
            gemail = sc.nextLine();
            if(!gemail.matches(regemail)){
                System.out.println("nhap sai dinh dang");
            }else{
                System.out.println("nhap dung!");
                break;
            }
        }while (true);

        do{
            System.out.printf("Moi nhap SDT: ");

            String resoDT="0\\d{9,10}";
            soDT= sc.nextLine();
            if(!soDT.matches(resoDT)){
                System.out.println("nhap sai dinh dang");
            }else{
                System.out.println("nhap dung!");
                break;
            }
        }while (true);
        //
        do{
            System.out.printf("Nhap CMND (10so): ");
            cmnD = sc.nextLine();
            String recmnd="\\d{10}";
            if(cmnD.matches(recmnd)){
                System.out.println("nhap dung");
                break;
            }else{
                System.out.println("nhap sai!");
            }
        }while (true);
    }

    public void xuat6(){
        System.out.println("thong tin sv\n");
        System.out.printf("Ho ten: %s \nEmail: %s\nSDT: %s\nsoCMND: %s", hoTen, gemail, soDT, cmnD);
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGemail() {
        return gemail;
    }

    public void setGemail(String gemail) {
        this.gemail = gemail;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getCmnD() {
        return cmnD;
    }

    public void setCmnD(String cmnD) {
        this.cmnD = cmnD;
    }
}
