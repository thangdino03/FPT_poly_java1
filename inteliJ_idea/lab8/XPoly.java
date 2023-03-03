package lab8;

import java.util.Locale;

public class XPoly {
    public static  double sum(double... nums){
        double tong = 0;
        for (double item : nums){
            tong +=item;
        }
        return tong;
    }

    public static double min(double ...nums){
        double min= nums[0];
        for (double item: nums){
            min = Math.min(min, item);
        }
        return min;
    }

    public static double max(double ...nums){
        double max= nums[0];
        for (double item: nums){
            max = Math.max(max, item);
        }
        return max;
    }

    //bai3
    public static String toUpperFirstChar (String name){
        String[] ars = name.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<ars.length; i++) {
            String item = ars[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        //main bai1
        double sum = sum(5,6,4,4,8);
        System.out.println("tong sum: "+sum);
        //main bai2
        double ketqua;
        ketqua = min(5,6,8,8,9,1);
        System.out.println("min la: "+ketqua);
        ketqua = max(5,9,7,12,55,0);
        System.out.println("Max la: "+ketqua);
        //main bai3
        String ten= toUpperFirstChar("nguyen  quang   thang");
        System.out.printf(ten);
    }
}
