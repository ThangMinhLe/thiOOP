package dethi;

import java.util.*;

public abstract class sanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private double soLuong;

    Scanner sc = new Scanner(System.in);

    public sanPham() {

    }

    public sanPham(String maSP, String tenSP, double donGia, double soLuong){

        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;

    }

    public String getMaSanPham() {
        return maSP;
    }

    public String setMaSanPham(String maSP){
        return this.maSP = maSP;
    }
    
    public String getTenSP() {
        return tenSP;
    }

    public String setTenSP(String tenSP) {
        return this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public double setDonGia(double donGia) {
        return this.donGia = donGia; 
    }

    public double getSoLuong() {
        return soLuong;
    }

    public double setSoLuong(double soLuong) {
        return this.soLuong = soLuong;
    }



    public double tinhThueVAT() {
        return 0.1*donGia*soLuong;
    }

    public abstract double tinhThanhTien();

    public abstract double tinhThueDacBietSum();


    public void nhapTT() {
        System.out.print("Nhap ma SP: ");
        setMaSanPham(sc.nextLine());
        System.out.print("Nhap ten sp: ");
        setTenSP(sc.nextLine());
        System.out.print("Nhap don gia SP: ");
        setDonGia(sc.nextDouble());
        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextDouble());

    }

    public String toString() {
        return String.format("%s | %s | %10.2f | %10.2f |",
        this.getMaSanPham(), this.getTenSP(), this.getDonGia(), this.getSoLuong());
    }
   
}
