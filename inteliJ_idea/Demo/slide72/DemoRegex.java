package Slide6;

import java.util.Scanner;

public class DemoRegex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Regex CMND
        do {
            System.out.println("Nhap cmnd: ");
            String cmnd = sc.nextLine();
            String reCMND = "[0-9]{9}";
            if (cmnd.matches(reCMND)) {
                System.out.println("cmnd hop le");
                break;
            } else {
                System.out.println("CMND ko hop le");
            }
        } while (true);
        do {
            //Regex sdt
            System.out.println("Nhap sdt: ");
            String sdt = sc.nextLine();
            String reSDT = "0[0-9]{9,10}";
            if (sdt.matches(reSDT)) {
                System.out.println("sdt hop le");
                break;
            } else {
                System.out.println("NHap ko dung sdt");
            }
        } while (true);
        do {
            //Regex email
            System.out.println("Nhap email: ");
            String email = sc.nextLine();
            String reEmail = "\\w+@\\w+\\.\\w+";
            if (email.matches(reEmail)) {
                System.out.println("email hop le");
                break;
            } else {
                System.out.println("email KO hop le");
            }
        } while (true);
        do {
            //Regex sdt Hue: 
            System.out.println("Nhap sdt Hue: ");
            String sdtHue = sc.nextLine();
            String reSdtHue = "0543\\d{6}";
            if (sdtHue.matches(reSdtHue)) {
                System.out.println("sdt Hue hop le");
                break;
            } else {
                System.out.println("sdt Hue KO hop le");
            }
        } while (true);

    }

}
