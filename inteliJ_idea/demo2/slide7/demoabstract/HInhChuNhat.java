package demo2.slide7.demoabstract;

public class HInhChuNhat extends Hinh{
    double dai, rong;

    public HInhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    double getChuVi() {
        return 2*(dai+rong);
    }

    @Override
    double getDienTich() {
        return dai*rong;
    }
    void xuat(){
        System.out.printf("CDai: %.0f\n CRong: %.0f \nChuvi: %.0f \nDienTich: %.0f", dai, rong,getChuVi(), getDienTich());
        
    }
}
