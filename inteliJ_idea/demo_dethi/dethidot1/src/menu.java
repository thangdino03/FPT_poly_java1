import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    ArrayList<Student> hs = new ArrayList<>();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("++-------------------MeNu----------------------++");
            System.out.println("| 1: nhap danh sach hoc sinh                    |");
            System.out.println("| 2: Xuat danh sach hoc sinh                    |");
            System.out.println("| 3: Sap xep ds hoc sinh                        |");
            System.out.println("| 4: Xuat hoc sinh có diem toan cao nhat        |");
            System.out.println("| 5: Thoat chuong trinh                         |");
            System.out.println("++---------------------------------------------++");
            System.out.print("Moi ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("cam on da su dung ctrinh!");
                    System.exit(0);
                default:
                    System.out.println("nhap sai!");
                    System.out.println("moi nhap lại");
            }
        } while (true);

    }

    public void nhap() {
        System.out.println("Nhap thong tin hoc sinh!");
        Scanner input = new Scanner(System.in);
        do {
            do {

                System.out.print("Nhap id: ");
                Scanner in = new Scanner(System.in);
                String ID = in.nextLine();
                if (ID == null || ID.equals("")) {
                    break;
                }
                System.out.println("nhap thanh cong !");
                break;
            } while (true);
            System.out.print("nhao ten hoc sinh: ");
            String ten = input.nextLine();
            System.out.print("nhap tuoi: ");
            String tuoi = input.nextLine();

            System.out.print("Nhap dia chi: ");
            String diachi = input.nextLine();
            //nhập điểm
            System.out.print("Nhap diem toan: ");
            double diemToan = input.nextDouble();
            System.out.print("Nhap diem ly: ");
            double diemLy = input.nextDouble();
            System.out.print("Nhap diem hoa: ");
            double diemHoa = input.nextDouble();
            Student hsne = new Student(diemToan, diemLy, diemHoa);
            hs.add(hsne);
        } while (true);
    }
}
