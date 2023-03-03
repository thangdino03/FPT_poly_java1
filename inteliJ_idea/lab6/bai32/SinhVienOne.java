package lab6.bai32;

import java.util.Scanner;

public class SinhVienOne {
    private String tenSV;
    private String email;
    private String soDT;
    private String cmnd;

    public SinhVienOne(String tenSV, String email, String soDT, String cmnd) {
        this.tenSV = tenSV;
        this.email = email;
        this.soDT = soDT;
        this.cmnd = cmnd;
    }

    public SinhVienOne(){}

    //
    public void Nhapone(){
        Scanner sc= new Scanner(System.in);
        DataONE dv= new DataONE();
        do {
            System.out.println("Moi nhap ten: ");
            tenSV= sc.nextLine();
            if(dv.isHoten(tenSV)){
                System.out.println("Nhap dung");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);

        do {
            System.out.println("Nhap email");
            email= sc.nextLine();
            if (dv.isEMAIL(email)){
                System.out.println("nhap dung");
                break;
            }else{
                System.out.println("nhap sai");
            }
        }while (true);
        //
    do{
        System.out.println("Nhap SDT: ");
        soDT= sc.nextLine();
        if (dv.isSDT(soDT)){
            System.out.println("nhap dung");
            break;
        }else{
            System.out.println("nhap sai");
        }
        }while (true);
    //
        do{
            System.out.println("Nhap CMND (10 so): ");
            cmnd= sc.nextLine();
            if (dv.iscmnd(cmnd)){
                System.out.println("nhap dung");
                break;
            }else{
                System.out.println("nhap sai");
            }
        }while (true);
    }

    //
    public void Xuatone(){
        this.tenSV= tenSV;
        this.email= email;
        this.soDT= soDT;
        this.cmnd= cmnd;
    }


    //

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}
