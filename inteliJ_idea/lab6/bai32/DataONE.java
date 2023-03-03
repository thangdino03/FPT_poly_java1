package lab6.bai32;

public class DataONE {
    public boolean isHoten(String chuoi){
        String regex="[a-zA-Z]+";
        return regex.matches(chuoi);
    }
    //
    public boolean isEMAIL(String chuoi){
        String regex="\\w+@\\w+(\\. \\w+){1,2}";
        return regex.matches(chuoi);
    }
    //
    public boolean isSDT(String chuoi){
        String regex="0\\d{9,10}";
        return regex.matches(chuoi);
    }
    public boolean iscmnd(String chuoi){
        String regex="\\d{10}";
        return regex.matches(chuoi);
    }

}
