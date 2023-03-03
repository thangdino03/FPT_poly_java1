package demo_code_java;
import java.util.Scanner;


public class codecoban {
    public static void main(String[] args) {
        System.out.println("hello");
        int a;
        double b;
        String c;
        Scanner sc = new Scanner (System.in);
        System.out.print("Moi nhap a= ");
        a=Integer.parseInt(sc.nextLine());
        System.out.print("Moi nhap b= ");
        b=Double.parseDouble(sc.nextLine());
        System.out.print("Moi nhap c= ");
        c=sc.nextLine();
        System.out.println("a="+a+" b= "+b+" c= "+c);

    }
}
