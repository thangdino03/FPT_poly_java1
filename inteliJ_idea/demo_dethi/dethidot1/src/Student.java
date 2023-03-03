public class Student extends Person{
    private double toan;
    private double ly;
    private double hoa;

    double getTinhtrungbih(){
        return (toan + ly + hoa)/3;
    }

    public Student(double toan, double ly, double hoa) {
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public Student(String id, String name, int tuoi, String diachi, double toan, double ly, double hoa) {
        super(id, name, tuoi, diachi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}
