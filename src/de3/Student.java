
package de3;

import static de3.Address.sc;

public class Student
{
    private Address diachi;
    private FullName hoten;
    private String mssv;

    public Student() {
    }

    public Student(Address diachi, FullName hoten, String mssv) {
        this.diachi = diachi;
        this.hoten = hoten;
        this.mssv = mssv;
    }

    public Address getDiachi() {
        return diachi;
    }

    public void setDiachi(Address diachi) {
        this.diachi = diachi;
    }

    public FullName getHoten() {
        return hoten;
    }

    public void setHoten(FullName hoten) {
        this.hoten = hoten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public void nhapTT() {
    
        System.out.println("Nhap mssv: ");
        setMssv(sc.nextLine());
        FullName hoten=new FullName();
        System.out.print("Nhap ho sinh vien: ");
        hoten.setHo(sc.nextLine());
        setHoten(hoten);
        System.out.print("Nhap ten dem sinh vien: ");
        hoten.setTendem(sc.nextLine());
        setHoten(hoten);
        System.out.print("Nhap ten sinh vien: ");
        hoten.setTen(sc.nextLine());
        setHoten(hoten);
        Address diachi= new Address();
        System.out.print("Nhap so nha: ");
        diachi.setSonha(sc.nextLine());
        setDiachi(diachi);
        System.out.print("Nhap ten duong: ");
        diachi.setDuong(sc.nextLine());
        setDiachi(diachi);
        System.out.print("Nhap quan: ");
        diachi.setQuan(sc.nextLine());
        setDiachi(diachi);
        System.out.print("Nhap thanh pho: ");
        diachi.setThanhpho(sc.nextLine());
        setDiachi(diachi);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s | %s %s %s %s", 
        hoten.getHo(), hoten.getTendem(), hoten.getTen(),
        diachi.getSonha(), diachi.getDuong(), diachi.getQuan(), diachi.getThanhpho());
    }
    void output()
    {
        System.out.println(toString());
    }
    public static void main(String[] args) {
        Student sv= new Student();
        sv.nhapTT();
        sv.output();
    }
}
