package lab3;

public class lab3bai2 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            System.out.println("BANG CUU CHUONG "+i);
            for(int j=1; j<=10;j++){
                System.out.printf("%d * %d = %d \n", i, j, i*j);
            }
        }
    }
}
