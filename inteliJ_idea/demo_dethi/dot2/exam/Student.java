package exam;

public class Student extends Preson {
	private double toan;
	private double ly;
	private double hoa;

	double getDiemTB() {
		return (toan + ly + hoa) / 3;
	}


	public Student(String id, String name, int age, String address,double toan, double ly, double hoa) {
		super();
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public Student(double toan, double ly, double hoa) {
		super();
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
