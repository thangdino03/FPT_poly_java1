
package Slide6;

public class DataValidation {
    public boolean isMaNV(String st){
        String pattern="[A-Z]{5}";
        return st.matches(pattern);
    }
    public boolean ismatKhau(String st){
        String pattern=".{6,}";
        return st.matches(pattern);
    }
    public boolean isHoTen(String st){
        String pattern="[a-zA-Z ]+";
        return st.matches(pattern);
    }
    public boolean isEmail(String st){
        String pattern="\\w+@\\w+(\\.\\w+){1,2}";
        return st.matches(pattern);
    }
    public boolean isSdt(String st){
        String pattern="083\\d{7}";
        return st.matches(pattern);
    } 
    public boolean isSoXeMay(String st){
        String pattern="5\\d-[A-Z]-((\\d{4})|([0-9]{3}\\.{2}))";
        return st.matches(pattern);
    }
    public boolean isCMND(String st){
        String pattern="\\d{10}";
        return st.matches(pattern);
    }
    public boolean isWeb(String st){
        String pattern="http://www\\.\\w+\\.\\w{2,4}";
        return st.matches(pattern);
    }
}
