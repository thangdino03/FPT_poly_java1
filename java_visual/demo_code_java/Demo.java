package demo_code_java;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String hoTen;
        int tuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi nhap ten: ");
        hoTen = scanner.nextLine();
        System.out.print("moi nhap tuoi: ");
        tuoi = scanner.nextInt();
        System.out.println("chao ban " + hoTen + " co phai ban" + tuoi + " khong?");
        System.out.printf("chao ban %s co phai ban %d tuoi khong?", hoTen, tuoi);
        double so = Math.random() + (12 - 5) + 5;
        System.out.println("so =" + so);
    }
}
