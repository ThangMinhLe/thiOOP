package dethi;

public class nuocHoa extends sanPham implements thueDacBiet{
    private int dungTich;

    public nuocHoa() {
        
    }

    public nuocHoa(String maSP, String tenSP, double donGia, double soLuong, int dungTich){
        super(maSP, tenSP, donGia, soLuong);
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return dungTich;
    }

    public int setDungTich(int dungTich) {
        return this.dungTich = dungTich;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhap dung tich nuoc hoa: ");
        sc.nextLine();
        setDungTich(sc.nextInt());
    }

    public String toString() {
        return super.toString() + String.format(" %d",this.getDungTich());
    }

    public double tinhThanhTien() {
        return tinhThueDacBiet() + getSoLuong() * getDonGia() + tinhThueVAT();
    }

    public double tinhThueDacBiet() {
        return 0.2 * getSoLuong() * getDonGia();
    }

    public double tinhThueDacBietSum() {
        return tinhThueDacBiet();
    }


    
}
