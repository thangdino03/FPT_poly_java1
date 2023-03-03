package lab2;
import java.util.Scanner;

public class lab2bai2 {
    public static void main(String[] args) {
        double x, x1, x2, delta;
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap a: ");
        a = sc.nextDouble();
        System.out.print("moi nhap b: ");
        b = sc.nextDouble();
        System.out.print("moi nhap c: ");
        c = sc.nextDouble();
        if (a == 0) {
            x = -b / a;
        } else {
            if (a != 0) {
                delta = (b * b) - 4 * a * c;
                if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Ptrinh co hai nghiem phan biet x1= %.2f va x2= %.2f", x1, x2);
                } else if (delta == 0) {
                    x1 = x2 = -b / (2 * a);
                    System.out.printf("PTrinh co nghiem kep: x1=x2= %.2f ", x1 = x2);
                } else {
                    System.out.println("PT vo nghiem");
                }
            }
        }
    }
}
