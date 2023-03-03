package assingment;


import java.util.Scanner;

public class menu_assignment {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int chon;
    do{
        System.out.println("+------------------------------MENU-----------------------------------+");
        System.out.println("|  0. Thoat ctrinh                                                    |");       
        System.out.println("|  1. Nhap danh sach nhan vien tu ban phim.                           |");                    
        System.out.println("|  2. Xuat danh sach nhan vien ra man hinh.                           |");
        System.out.println("|  3. Tim va hien thi nhan vien theo ma nhap tu ban phim              |");
        System.out.println("|  4. Xoa nhan vien theo ma nhap tu ban phim                          |");
        System.out.println("|  5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim           |");
        System.out.println("|  6. Tim cac nhan vien theo khoang luong nhap tu ban phim            |");
        System.out.println("|  7. Sap xep nhan vien theo ho va ten                                |");
        System.out.println("|  8. Sap xep nhan vien theo thu nhap                                 |");
        System.out.println("|  9. Xuat 5 nhan vien co thu nhap cao nhat                           |");
        System.out.println("+---------------------------------------------------------------------+");

        System.out.print("Moi chon chuc nang: ");
        chon= sc.nextInt();
        switch(chon){
            case 0:
            System.out.println("Cam on da su dung ctrinh!");
            break;
            case 1:
            System.out.println("Chuc nang 1");
            break;
            case 2:
            System.out.println("Chuc nang 2");
            break;
            case 3:
            System.out.println("Chuc nang 3");
            break;
            case 4:
            System.out.println("Chuc nang 4");
            break;
            case 5:
            System.out.println("Chuc nang 5");
            break;
            case 6:
            System.out.println("Chuc nang 6");
            break;
            case 7:
            System.out.println("Chuc nang 7");
            break;
            case 8:
            System.out.println("Chuc nang 8");
            break;
            case 9:
            System.out.println("Chuc nang 9");
            break;
            default:
                System.out.println("Nhap sai. moi nhap lai");
        }

    }while(chon !=0);

   }
}
