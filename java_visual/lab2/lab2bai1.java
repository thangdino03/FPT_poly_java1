package lab2;

import java.util.Scanner;

public class lab2bai1 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap so a: ");
        a= sc.nextDouble();
        System.out.print("moi nhap so b: ");
        b= sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("pt co vo so nghiem!");
            }else{
                System.out.println("pt vo nghiem!");
            }
        }else{
            x=-b/a;
            System.out.printf("nghiem cua pt: %.2f",x);
        }
    }
}
