package dethi;

public class quanAo extends sanPham {
    
    private String theLoai;
    public quanAo() {

    }

    public quanAo(String maSP, String tenSP, double donGia, double soLuong) {
        super(maSP, tenSP, donGia, soLuong);
        this.theLoai = theLoai;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String setTheLoai(String theLoai) {
        return this.theLoai = theLoai;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhap the loai: ");
        sc.nextLine();
        setTheLoai(sc.nextLine());
    }

    public String toString () {
        return super.toString() + String.format(" %s\n", this.getTheLoai() );
    }

    public double tinhThanhTien() { 
     
        return tinhThueVAT() * getSoLuong() * getDonGia();

    }

    public double tinhThueDacBietSum() {
        return 0.0;
    }

    
}
