package de2;

public class bus extends xe{
    long loTrinh;

    public bus () {

    }
    
    public bus (int bienSo, String nhanHieu, String mauXe, long trongTai, long loTrinh){
        super(bienSo, nhanHieu, mauXe);
        this.loTrinh = loTrinh;
    }

    public long getLoTrinh() {
        return this.loTrinh;
    }

    public long setLoTrinh(long loTrinh) {
        return this.loTrinh = loTrinh;
    }


    public  void nhap() {
        super.nhap();
        System.out.println("Nhap lo trinh cho xe bus: ");
        setLoTrinh(sc.nextLong());
    }

    public String toString() {
        return super.toString() + String.format("%d", getLoTrinh());
    }

    public long tinhTien() {
        if(loTrinh > 20) {
            return  10000;
        } else {
            return  5000;
        }
       
    }


    
}
