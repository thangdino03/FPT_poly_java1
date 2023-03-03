package demo_code_java;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        double thue,luong=9.5, thuong=3, thuNhap;
        Scanner sc = new Scanner(System.in);
        thuNhap= luong+thuong;
        if(thuNhap<9) thue=0;
        else if ((thuNhap>=9)&&(thuNhap<15)) thue=0.1*thuNhap;
        else if (thuNhap<30) thue=0.15*thuNhap;
        else thue = 0.2*thuNhap;
        
    }
}
