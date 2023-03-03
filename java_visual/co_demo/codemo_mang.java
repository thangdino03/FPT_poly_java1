package co_demo;

import java.util.Scanner;

public class codemo_mang {
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        int n;
        double tong =0;
        System.out.print("moi nhap so phan tu cua mang n= ");
        n=nhap.nextInt();
        int[]a=new int[n];
        //nhập mảng cộng vào tổng
         for(int i=0; i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=nhap.nextInt();
            tong+= a[i];
         }
         //in ra mảng vừa nhập
         System.out.println("Mang vua nhap la: ");
         for(int x:a){
            System.out.println(x+"--"+x+"^3="+Math.pow(x, 3));
         }
         System.out.printf("trung binh cong cua cac so trong mang la: %.2f",(tong/n));
    }
}
