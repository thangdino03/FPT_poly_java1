package lab5.bai3;

import javax.sound.midi.Soundbank;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {
    private ArrayList<SanPham> list = new ArrayList<>();

    public void nhap(){
        int i=1;
        System.out.println("Nhap sanh sach san pham");
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Nhap ten san pham thu %d: ",i);
            String ten= scanner.nextLine();
            if( ten == null || ten.equals("")){
                //System.out.println("Nhap xong !");
                break;
            }
            i++;
            System.out.print("Gia san pham: ");
            double gia = scanner.nextDouble();
            list.add(new SanPham(ten, gia));
        }while (true);
        System.out.println("Nhap xong !");
    }

    public void xuat(){
        System.out.println("Danh sach san pham");
        System.out.println("Ten\t\t|Gia \t\t");
        for (SanPham sp: list){
            System.out.printf(" %s | %.2f VND \n", sp.getTenSP(), sp.getGia());
        }
    }

    public void sapXep(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(),o2.getGia());
            }
        };
        Collections.sort(list,comp);
        Collections.reverse(list); //xóa dòng này để tăng dần
        xuat();
    }

    public void timVaXoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham can tim: ");
        String ten= sc.nextLine();

        SanPham sp = null;

        for (SanPham sp1: list){
            if(sp1.getTenSP().equals(ten)){
                sp= sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Da xoa san pham");
        }else {
            System.out.println("Khong tim thay san pham! ");
        }
    }

    public void tinhgiaTB(){
        double avg = 0, sum =0;
        for (SanPham sp: list){
            sum += sp.getGia();
        }
        avg = sum / list.size(); //trong array list có sẵn
        System.out.printf("Gia trung binh la: %.2f VND",avg);
    }



    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int chon;
        do{
            System.out.println("\n------------------------MENU------------------------");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| 1. Nhap danh sach san pham                       |");
            System.out.println("| 2. Xuat danh sach vua nhap                       |");
            System.out.println("| 3. Sap xep giam dan theo gia                     |");
            System.out.println("| 4. Tim va xoa san pham                           |");
            System.out.println("| 5. Xuat gia trung binh cua san pham              |");
            System.out.println("| 0. Thoat chuong trinh                            |");
            System.out.println("+--------------------------------------------------+");
            System.out.print("moi ban chon chuc nang (0-5): ");
            chon= scanner.nextInt();
            //if(chon !=0) {
                switch (chon) {
                    case 0:
                        System.out.println(" cam on da su dung ctrinh");
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        sapXep();
                        break;
                    case 4:
                        timVaXoa();
                        break;
                    case 5:
                        tinhgiaTB();
                        break;
                    default:
                        System.out.println("Nhap sai !, moi nhap lai ");

                }
           // }

        }while( chon != 0);
    }
}
