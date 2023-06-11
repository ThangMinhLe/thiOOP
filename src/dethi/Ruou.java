package dethi;

public class Ruou extends sanPham implements thueDacBiet{
    private int nongDo;

    public Ruou() {

    }

    public Ruou (String maSP, String tenSP, double donGia, double soLuong, int nongDo) {
        super(maSP, tenSP, donGia, soLuong);
        this.nongDo = nongDo;
    }

    public int getNongDo() {
        return nongDo;
    }

    public int setNongDo(int nongDo) {
        return this.nongDo = nongDo;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhap nong do ruou: ");
        sc.nextLine();
        setNongDo(sc.nextInt());
    }

    public String toString() {
        return super.toString() + String.format(" %d",this.getNongDo());
    }

    public double tinhThueDacBiet() {
        return 0.2 * getSoLuong() * getDonGia();
    }

    public double tinhThanhTien() {
        return tinhThueVAT() + getSoLuong()*getDonGia() + tinhThueDacBiet() ;
    }
    

    public double tinhThueDacBietSum() {
        return tinhThueDacBiet();
    }
}
