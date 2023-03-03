package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3bai4 {
    public static void main(String[] args) {
        String tenSV[] = new String[2];
        double diemSV[] = new double[2];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 2; i++){
                System.out.printf("Nhap ten cho sinh vien thu %d: ", i + 1);
                tenSV[i] = scanner.nextLine();
                System.out.printf("Nhap diem cho hoc sinh thu %d: ", i + 1);
                diemSV[i] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
        System.out.println("======================================");
        System.out.println("--> Du lieu vua nhap <--");
        System.out.println("Mang SV: "+ Arrays.toString(tenSV));
        System.out.println("Mang diem SV: "+Arrays.toString(diemSV));
        //Sap xếp điểm tăng dần 
       for(int i =0; i< tenSV.length -1 ;i++){
            for(int j =i+1; j< tenSV.length; j++){
                if(diemSV[i]> diemSV[j]){
                Double temp= diemSV[i];
                    diemSV[i]= diemSV[j];
                    diemSV[j]= temp;
                    String svTemp = tenSV[i];
                    tenSV[i]= tenSV[j];
                    tenSV[j]= svTemp;
                }
            }

        }
        //họcc lực
        for(int i =0; i<2;i++){
            System.out.println("+-----------------------------------------");
            System.out.println("|Sinh vien: "+ tenSV[i]);
            System.out.println("|Diem: "+ diemSV[i]);
            if(diemSV[i]>=9){
                System.out.println("|Hoc luc: Xuat Sac!");
            }else if (diemSV[i]>=8){
                System.out.println("|Hoc luc: Gioi");
            }else if(diemSV[i]>=6.5){
                System.out.println("|Hoc luc: Kha");
            }else if(diemSV[i]>=5){
                System.out.println("|Hoc luc: Trung Binh");
            }else{
                System.out.println("|Hoc Luc: Yeu! \n");
            }
        }

    }
}
