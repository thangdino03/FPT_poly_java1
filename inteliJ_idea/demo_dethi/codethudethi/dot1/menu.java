package codethudethi.dot1;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class menu {
    ArrayList<Student> hs = new ArrayList<>();

    public void menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**************************MENU**********************************");
            System.out.println("**1.  Nhập giá trị cho danh sách học sinh.                    **");
            System.out.println("**2.  Xuất danh sách học sinh.                                **");
            System.out.println("**3.  Sắp xếp dshs theo chiều tăng của điểm trung bình.       **");
            System.out.println("**4.  Tìm học sinh có điểm toán cao nhất.                     **");
            System.out.println("**5.  Thoát chương trình.                                     **");
            System.out.println("****************************************************************");
            System.out.print("Mời bạn chọn (1~5): ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapxep();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Cam on da su dung chuong trinh !");
                    System.exit(1);
                default:
                    System.out.println("Nhap sai !");
                    System.out.println("Moi nhap lai");

            }
        } while (true);
    }

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap thong tin sinh vien? (Y/N)");
            String thongTin = sc.nextLine();
            if (thongTin.equalsIgnoreCase("N")) {
                break;
            }
//            String ID;
            do {
                System.out.print("Nhap ma sinh vien: ");
                String ID = sc.nextLine();
                String reiD = "\\w";
                if (!ID.matches(reiD)) {
                    System.out.println("Nhap ma khong dung dinh dang!");
                } else {
                    System.out.println("Nhap thanh cong!");
                    break;
                }
            } while (true);
            // NHập tên
            do {
                System.out.print("Nhap ho ten sinh vien: ");
                String name = sc.nextLine();
                String reName = "[a-zA-z]{5,}";
                if (!name.matches(reName)) {
                    System.out.println("ten khong dung dinh dang !");
                } else {
                    System.out.println("nhao thanh cong");
                    break;
                }
            } while (true);
            //Nhap tuoi

            do {
                System.out.print("Moi nhap tuoi: ");
                String tuoi = sc.nextLine();
                String reTuoi = "\\d{2}";
                if (!tuoi.matches(reTuoi)) {
                    System.out.println("Nhap sai!");
                } else {
                    System.out.println("nhap thanh cong!");
                }
            } while (true);
           // Nhp địa chỉ

                do {
                    System.out.println("Moi nhap dia chi: ");
                     String address =sc.nextLine();
                    String reAddress ="\\w{2,}";
                    if (!address.matches(reAddress)){
                        System.out.println("Nhao sai!");
                    }

                }while (true);


                //nhập điểm

                        System.out.print("Nhap diem toan: ");
                        double diemToan = sc.nextDouble();
                        System.out.print("Nhap diem ly: ");
                        double diemLy = sc.nextDouble();
                        System.out.print("Nhap diem hoa: ");
                        double diemHoa = sc.nextDouble();
                        Student hs1 = new Student(diemToan, diemLy, diemHoa);
                        hs.add(hs1);




        } while (true);
    }

    //xuất
    public void xuat() {
        for (Student hs1 : hs) {
            System.out.println("------------------------");
            System.out.println("Ho ten: " + hs1.getName());
            System.out.println("ID: " + hs1.getiD());
            System.out.println("Tuoi: " + hs1.getAge());
            System.out.println("dia chi email: " + hs1.getAddress());
            System.out.println("Diem toan: " + hs1.getToan());
            System.out.println("Diem ly: " + hs1.getLy());
            System.out.println("Diem hoa: " + hs1.getHoa());
            System.out.println("Diem trung binh: " + hs1.getAverage());
        }
    }

    public void sapxep() {
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverage(), o2.getAverage());
            }
        };
        Collections.sort(hs, comp);
        System.out.println("Xap xep tang dan theo diem");

    }
    public void diemcaonhat(){
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getToan(), o2.getToan());
            }
        };
        Collections.sort(hs, comp);
        System.out.println("Diem toan cao nhat");
        xuat();
    }

    public void loadList() {
        Student hs4 = new Student("ID15", "Trần Anh", 17, "anh@mail.com", 8, 9, 9);
        Student hs1 = new Student("ID55", "Tăng An Hoa", 18, "h@mail.com", 10, 7, 9);
        Student hs5 = new Student("ID35", "Duy Tăng", 18, "tt@mail.com", 7, 5, 5);
        Student hs3 = new Student("ID1", "Hoàng Hiền Hà", 18, "hh@mail.com", 8, 4, 5);
        hs.add(hs4);
        hs.add(hs1);
        hs.add(hs5);
        hs.add(hs3);

    }

}
