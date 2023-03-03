package lab6;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String sHoVaTen, sHo, sTen, sTenDem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ho va ten: ");
        sHoVaTen = sc.nextLine();
        sHo= sHoVaTen.substring(0, sHoVaTen.indexOf(" ")).toUpperCase();
        // họ đc cắt từ họ và tên, cắt từ kí tự đầu tiên đến khoáng trắng xuất hiện đầu tiên trong họ và tên
        sTen= sHoVaTen.substring(sHoVaTen.lastIndexOf(" "), sHoVaTen.length()).trim().toUpperCase();
        //tên = họ và tên cắt chuỗi từ kí tự trắng cuối cùng tìm thấy trong họ và tên, cho đến độ dài của họ của họ và tên
        sTenDem= sHoVaTen.substring(sHoVaTen.indexOf(" "), sHoVaTen.lastIndexOf(" ")).trim();
        //tên đệm lấy từ khoảng trắng tìm thấy thứ nhất cho tới khoảng trắng tìm thấy cuối cùng
        //trim xóa bỏ khỏảng trống ..
        System.out.println("Ho: "+sHo);
        System.out.println("Ten dem: "+sTenDem);
        System.out.println("Ten: "+sTen);

    }
}
