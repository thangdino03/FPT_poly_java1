package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
	//ArrayList<Preson> hs = new ArrayList<>();
	ArrayList<Student> hS = new ArrayList<>();

	void menu() {
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
			System.out.println("**************************MENU**********************************");
			System.out.println("**1.  Nhập giá trị cho danh sách học sinh.                    **");
			System.out.println("**2.  Xuất danh sách học sinh.                                **");
			System.out.println("**3.  Sắp xếp dshs theo chiều tăng của điểm trung bình.       **");
			System.out.println("**4.  Tìm học sinh có điểm toán cao nhất.                     **");
			System.out.println("**5.  Thoát chương trình.                                     **");
			System.out.println("****************************************************************");
			System.out.println("Mời bạn chọn (1~5): ");
			chon = sc.nextInt();
			switch (chon) {
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
				timMax();
				break;
			case 5:
				System.out.println("Thoát chương trình!!");
				System.out.println("Xin cảm ơn và hẹn gặp lại!");
				break;
			default:
				System.out.println("Nhập sai!!");
				System.out.println("Vui lòng nhập lại!!");
				System.out.println("");
			}
		} while (true);

	}

	public void nhap() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập thông tin học sinh:(Y/N)");
			String thongTin = sc.nextLine();
			if (thongTin.equalsIgnoreCase("N")) {
				break;
			}
			String ID;
			do {
				System.out.println("Nhập mã học sinh: ");
				ID = sc.nextLine();
				String reid = "\\w+";
				if (!ID.matches(reid)) {
					System.out.println("Mã học sinh không đúng định dạng!!");
				} else {
					System.out.println("Đã nhập đúng");
					break;
				}
			} while (true);

			String name;
			do {
				System.out.println("Nhập họ tên học sinh: ");
				name = sc.nextLine();
				String reName = "[a-zA-Z á à ả ã ạ ă ắ ằ ẳ ẵ ặ â ấ ầ ẩ ẫ ậ é è ẻ ẽ ẹ ê ế ề ể ễ ệ "
						+ "í ì ỉ ĩ ị ó ò ỏ õ ọ ô ố ồ ổ ỗ ộ ơ ớ ờ ở ỡ ợ ú ù ủ ũ ụ ư ứ ừ ử ữ ự " + "ý ỳ ỷ ỹ ỵ đ Đ ]+";
				if (name.matches(reName)) {
					System.out.println("Tên không đúng định dạng!!");
				} else {
					System.out.println("Đã nhập đúng");
					break;
				}
			} while (true);

			String tuoi = sc.nextLine();
			do {
				System.out.println("Nhập tuổi: ");
				tuoi = sc.nextLine();
				String reTuoi = "\\d{2}";
				if (!tuoi.matches(reTuoi)) {
					System.out.println("Tuổi không đúng định dạng!!");
				} else {
					System.out.println("Đã nhập đúng");
					break;
				}
			} while (true);

			String address;
			do {
				System.out.println("Nhập địa chỉ: ");
				address = sc.nextLine();
				String reAddress = "[\\w+@\\w+(\\.\\w+){1,2}]+";
				if (!address.matches(reAddress)) {
					System.out.println("Địa chỉ không đúng định dạng!!");
				} else {
					System.out.println("Đã nhập đúng");
					break;
				}
			} while (true);
			System.out.printf("Nhập điểm Toán: ");
			double diemToan = sc.nextDouble();
			System.out.printf("Nhập điểm Lý: ");
			double diemLy = sc.nextDouble();
			System.out.printf("Nhập điểm Hóa: ");
			double diemHoa = sc.nextDouble();
			Student hs1 = new Student(diemToan, diemLy, diemHoa);
			hS.add(hs1);
		} while (true);
	}

	public void xuat() {
		for (Student hs1 : hS) {
			System.out.println(" ");
			System.out.println("Họ tên: " + hs1.getName());
			System.out.println("ID: " + hs1.getId());
			System.out.println("Tuổi: " + hs1.getAge());
			System.out.println("Địa chỉ: " + hs1.getAddress());
			System.out.println("Điểm toán: " + hs1.getToan());
			System.out.println("Điểm lý: " + hs1.getLy());
			System.out.println("Điểm hóa: " + hs1.getHoa());
			System.out.println("Điểm trung bình: " + hs1.getDiemTB());
		}
	}

	public void sapXep() {
		Comparator<Student> comp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getDiemTB(), o2.getDiemTB());
			}
		};
		Collections.sort(hS, comp);
		System.out.println("*Sắp xếp điểm tăng dần*");
		xuat();
	}

	public void timMax() {
		Comparator<Student> comp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getToan(), o2.getToan());
			}
		};
		Collections.sort(hS, comp);
		System.out.println("*HS có điểm toán cao nhất*");
		xuat();
	}
	public void loadList() {
		Student hs4=new Student("ID15", "Trần Anh",17, "anh@mail.com", 8, 9, 9);
		Student hs1=new Student("ID55", "Tăng An Hoa",18, "h@mail.com", 10, 7, 9);
		Student hs5=new Student("ID35", "Duy Tăng",18, "tt@mail.com", 7, 5, 5);
		Student hs3=new Student("ID1", "Hoàng Hiền Hà",18, "hh@mail.com", 8, 4, 5);
		hS.add(hs4);
		hS.add(hs1);
		hS.add(hs5);
		hS.add(hs3);
		
	}
}
