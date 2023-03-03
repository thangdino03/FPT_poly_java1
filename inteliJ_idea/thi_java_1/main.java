import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static ArrayList<Student> list = new ArrayList<>();
//    public  Scanner sc = new Scanner(System.in);

    public static void nhapHS(){
        do {
            Scanner sc = new Scanner(System.in);
            Student hs = new Student();
            hs.nhap();
            list.add(hs);
            System.out.println("ban co muon nhap tiep khong? (y/n): ");
            if (sc.nextLine().equalsIgnoreCase("n")){
                break;
            }

        }while (true);
    }

    public void xuatHS(){
        for (Student hs: list){
            hs.xuat();
            System.out.println("---------------------------------");
        }
    }

    public void hsTuoi(){
        for (int i =0; i< list.size() -1; i++){
            for ( int j= i+1; j<list.size(); j++){
                if (list.get(i).getTuoi() >20){
                }
            }
        }
        for (int i =0; i<list.size(); i++){
            list.get(i).xuat();
            System.out.println("-----------------------");
        }
    }

    public void timSV(){

    }
    public  void menu(){
        int chon;
        Scanner scc = new Scanner(System.in);
        do {
            System.out.println("++------------------MeNu---------------------------++");
            System.out.println("| 1.Nhap danh sach hoc sinh                         |");
            System.out.println("| 2.Xuat danh sach hoc sinh                         |");
            System.out.println("| 3.Hien thi tat ca hoc sinh co tuoi >20            |");
            System.out.println("| 4.Tim tat ca sinh vien co ho 'Nguyen'             |");
            System.out.println("| 5.Thoat ctrinh                                    |");
            System.out.println("++-------------------------------------------------++");
            chon =sc.nextInt();
            switch (chon){
                case 1:
                    break;
                case 2:
                    xuatHS();
                    break;
                case 3:
                    hsTuoi();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("cam on da su dung ctrinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("lua chon k hop le");
                    System.out.println("moi chon lai");
            }
        }while (true);
    }

    public static void loadList() {
        Student hs4=new Student("ID15", "Trần Anh",17, "anh@mail.com", 8, 9, 9);
        Student hs1=new Student("ID55", "Tăng An Hoa",18, "h@mail.com", 10, 7, 9);
        Student hs5=new Student("ID35", "Duy Tăng",18, "tt@mail.com", 7, 5, 5);
        Student hs3=new Student("ID1", "Hoàng Hiền Hà",18, "hh@mail.com", 8, 4, 5);
        list.add(hs4);
        list.add(hs1);
        list.add(hs5);
        list.add(hs3);

    }

    public static void main(String[] args) {





    }
}

