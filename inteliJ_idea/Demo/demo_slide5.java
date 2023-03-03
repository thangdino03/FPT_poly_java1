package Demo;

import java.util.ArrayList;

public class demo_slide5 {
    public static void main(String[] args) {
        ArrayList <Double> a= new ArrayList<>();
        a. add(7.0);
        a.add(9.0);
        a.add(10.0);
        //moi nhap list
        // tinh tong
        //cach 1
        double tong=0;
        for(double x:a){
            tong+=x;
        }
        //cach 2
        for (int i=0; i<a.size(); i++) tong+=a.get(i);
        System.out.println("tong= "+tong);
    }
}
