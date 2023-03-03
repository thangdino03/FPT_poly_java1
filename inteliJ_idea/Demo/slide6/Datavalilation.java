package Demo.slide6;

public class Datavalilation {
    public boolean isMa(String chuoi){
        String regex="[0-9a-zA-Z]";
        return regex.matches(chuoi);
    }
    public boolean isMatkhau(String chuoi){
        String regex=".{6,}";
        return regex.matches(chuoi);
    }
    public boolean isHoTen(String chuoi){
        String regex="[a-zA-Z ]+";
        return regex.matches(chuoi);
    }
    public boolean isEmail(String chuoi){
        String regex="\\w+@\\w+(\\. \\w+){1,2}";
        return regex.matches(chuoi);
    }
    public boolean isSDT(String chuoi){
        String regex="083\\d{7}\n";
        return regex.matches(chuoi);
    }
    public boolean isXemay(String chuoi){
        String regex="5\\d-[A-Z]-((\\d{4})|(\\d{3}\\.{2}))";
        return regex.matches(chuoi);
    }
    public boolean isCMND(String chuoi){
        String regex="\\d{10}";
        return regex.matches(chuoi);
    }
    public boolean isWebsite(String chuoi){
        String regex="http://www\\.\\w+\\.\\w{2,4}";
        return regex.matches(chuoi);
    }
}
