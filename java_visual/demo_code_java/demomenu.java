package demo_code_java;
import java.util.Scanner;

public class demomenu {
    /**
     */
    public static void main(String[] args) {
        int chon, a=5,b=10;
        Scanner sc = new Scanner(System.in);
        //cấu trúc lặp 
        do{
            System.out.println("===================MENU================");
            System.out.println("**0. Thoat ctrinh**");
            System.out.println("**1. Tinh tong**");
            System.out.println("**2. Tinh hieu**");
            System.out.println("Moi ban chon cv: (0,1,2) ");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                System.out.println("a+b= "+(a+b));
                    break;
                case 2:
                System.out.println("a-b= "+(a-b));
                    break;
                default:
                    System.out.println("Nhap 0, 1 ,2 ban oi");
            }
        }while(chon !=0 );
        System.out.println("cam on da su dung ctrinh! ");
    }
}
