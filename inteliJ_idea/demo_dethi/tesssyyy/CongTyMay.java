import java.util.ArrayList;

public class CongTyMay {
    public static void main(String[] args) {
        ArrayList<CongNhan> listcn = new ArrayList<CongNhan>();
        listcn.add(new CongNhan("Nguyen1", 13, 8, 60000) {
        });
        listcn.add(new CongNhan("Nguyen2", 17, 1, 540000) {
        });
        listcn.add(new CongNhan("Nguyen3", 18, 7, 30000) {
        });
        listcn.add(new CongNhan("Nguyen4", 21, 6, 540000) {
        });
        listcn.add(new CongNhan("Nguyen5", 23, 2, 54000) {
        });
        listcn.add(new CongNhan("Nguyen6", 34, 3, 123000) {
        });
        listcn.addAll(listcn);
    }
}
