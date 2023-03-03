/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assmgd2;

/**
 *
 * @author Administrator
 */
public class Datavalidation {

    public boolean isHoTen(String chuoi) {
        String regex = "[a-zA-Z ]{5,}";
        return chuoi.matches(regex);
    }

    public boolean isMa(String chuoi) {
        String regex = "\\w+";
        return chuoi.matches(regex);
    }

    public boolean isPhongBan(String chuoi) {
        String regex = "[a-zA-Z ]{5,}";
        return chuoi.matches(regex);
    }

    public boolean isLuong(String chuoi) {
        String regex = "\\d{4,}";
        return chuoi.matches(regex);

    }

    public boolean isDoanhSo(String chuoi) {
        String regex = "\\d{1,}";
        return chuoi.matches(regex);
    }

    public boolean isHueHong(String chuoi) {
        String regex = "\\d|\\d\\.\\d{1,}";
        return chuoi.matches(regex);
    }

    public boolean isLuongTN(String chuoi) {
        String regex = "\\d{4,}";
        return chuoi.matches(regex);
    }
}
