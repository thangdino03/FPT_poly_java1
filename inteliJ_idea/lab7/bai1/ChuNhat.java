package lab7.bai1;

public class ChuNhat {
    private double dai;
    private double rong;
    protected double chuVi(){
        return 2*(dai+rong);
    }
    protected double dienTich(){
        return dai*rong;
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
//xuat
    public void xuat(){
        System.out.printf("Chieu Dai: %.0f \n Chieu rong: %.0f \n Chu vi: %.0f"+"\nDien Tich: %.0f", dai, rong,chuVi(),dienTich());
        System.out.println(" ");
    }
    //

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
}
