import java.util.Scanner;

public class Persion {
    private String id;
    private String name;
    private int tuoi;
    private String diaChi;

    public Persion() {
    }

    public Persion(String id, String name, int tuoi, String diaChi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ma: ");
            this.id =sc.nextLine();
            String reiD ="\\w";
            if(this.id.matches(reiD)){
                System.out.println("nhap thanh cong");
                break;

            }else {
                System.out.println("nhap sai!");
            }
        }while (true);
        do {
            System.out.println("Nhap ten: ");
            this.name =sc.nextLine();
            String reName ="[a-zA-Z]{2,}";
            if (this.name.matches(reName)){
                System.out.println("Nhap thanh cong");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);

        do {
            System.out.println("Nhap tuoi: ");
            this.tuoi = sc.nextInt();
            break;

        }while (true);

        do {
            System.out.println("Nhap dia chi: ");
            this.diaChi = sc.nextLine();
            String reDiachi ="\\w";
            if (this.name.matches(reDiachi)){
                System.out.println("Nhap thanh cong");
                break;
            }else {
                System.out.println("Nhap sai");
            }
        }while (true);
    }

    public void xuat(){
        System.out.println("Ma: %s | Ten: %s | Tuoi: %d | Dia chi: %s "+this.id +this.name+this.tuoi+this.diaChi);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
