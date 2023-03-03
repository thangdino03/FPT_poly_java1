package lab3;

import java.util.Scanner;

public class lab3bai1 { //sô nguyên tố
    public static void main(String[] args) {
        int n, i; //n là dữ liệu ng dùng nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so: ");
        n = sc.nextInt();
        if (n<2){
            System.out.printf("So %d Khong phai la SNT!",n);
        }else{
            boolean ktra=true;
            for(i= 2; i<n; i++){
                if(n% i==0){//ktra n có chia hết cho i, i có phải là ước của n ko.
                    System.out.printf("So %d khong phai la SNT", n);
                    ktra=false;
                    break;//câu lệnh break dừng công việc đang thực hiện

                }
            }
            if(ktra)System.out.printf("So %d la SNT", n);
        }

    }
}
