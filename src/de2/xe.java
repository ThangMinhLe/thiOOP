package de2;
import java.util.*;
public abstract class xe {
    Scanner sc = new Scanner(System.in);
    int bienSo;
    String nhanHieu;
    String mauXe;

    //ham get/set cho bienSo, nhanhieu, mauXe.

    public xe() {

    }

    public xe (int bienSo, String nhanHieu, String mauXe) {
        this.bienSo = bienSo;
        this.nhanHieu = nhanHieu;
        this.mauXe = mauXe;
    }

    public int getBienSo() {
        return bienSo;
    }

    public void setBienSo(int bienSo) {
        this.bienSo = bienSo;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }



    public void nhap(){
        System.out.println("Nhap bien so: ");
        setBienSo(sc.nextInt());
        System.out.println("Nhap nhan hieu: ");
        sc.nextLine();
        setNhanHieu(sc.nextLine());
        System.out.println("Nhap mau xe: ");
        setMauXe(sc.nextLine());


    }


    public String toString () {
        return String.format("%d %s %s", getBienSo(), getNhanHieu(), getMauXe());
    }


    public abstract long tinhTien();

    
    private void hello(){
        System.out.println("Hello");
    }
}
