import java.util.Scanner;

public class Student extends Persion {
    private double diemToan;
    private double diemly;
    private double diemHoa;

    Double getAverage() {
        return (diemToan + diemly + diemHoa) / 3;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {
            System.out.println("Nhap diem toan");
            this.diemToan = Double.parseDouble(sc.nextLine());
            if (this.diemToan >= 0 && this.diemToan <= 10) {
                break;
            }
        } while (true);
        do {
            System.out.println("Nhap diem ly: ");
            this.diemly = Double.parseDouble(sc.nextLine());
            if (this.diemly >= 0 && this.diemly <= 10) {
                break;
            }
        } while (true);
        do {
            System.out.println("Nhap diem Hoa: ");
            this.diemHoa = Double.parseDouble(sc.nextLine());
            if (this.diemHoa >= 0 && this.diemHoa <= 10) {
                break;
            }
        } while (true);

    }
    public void xuat(){
        super.xuat();
        System.out.println("| Diem toan: %.1f | Diem Ly: %.1f | Diem hoa: %.1f | Diem trung binh: %.1f "+this.diemToan+this.diemly+this.diemHoa+getAverage());
}

    public Student() {
    }

    public Student(String id, String name, int tuoi, String diaChi, double diemToan, double diemly, double diemHoa) {
        super(id, name, tuoi, diaChi);
        this.diemToan = diemToan;
        this.diemly = diemly;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemly() {
        return diemly;
    }

    public void setDiemly(double diemly) {
        this.diemly = diemly;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
}
