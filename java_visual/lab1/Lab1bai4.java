package lab1;
import java.util.Scanner;

public class Lab1bai4 {
    public static void main(String[] args) {
        double a, b, c;
        double delta;
        double can;// căn bậc 2
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("moi nhap he so b: ");
        b = sc.nextDouble();
        System.out.print("moi nhap he so c: ");
        c = sc.nextDouble();
        delta = (b * b) - 4 * a * c;
        can = Math.sqrt(delta);
        System.out.printf("Can delta: %.2f ", can);
    }
}
