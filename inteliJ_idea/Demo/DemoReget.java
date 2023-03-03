package Demo;

import java.util.Scanner;

public class DemoReget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //kiem soat nhap cccd
        do{
            System.out.printf("moi nhap cccd 12 so: ");
            String cccD = sc.nextLine();
            String reCCCD = "\\d{12}";
            if (cccD.matches(reCCCD)){
                System.out.println("Nhap dung");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);
        //kiem soat nhap sdt
        do{
            System.out.printf("moi nhap Sdt: ");
            String sDT = sc.nextLine();
            String reSDT = "0\\d{9,10}";
            if (sDT.matches(reSDT)){
                System.out.println("Nhap dung");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);
        //kiem soat nhap bien so xe
        do{

            System.out.printf("moi nhap bien so xe: ");
            String bSoxe = sc.nextLine();
            String rebienSo = "7\\d-[A-Z]-((\\d{4})|(\\d{3}\\.\\d{2}))}";
            if (bSoxe.matches(rebienSo)){
                System.out.println("Nhap dung");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);
    }
}
