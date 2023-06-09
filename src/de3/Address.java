
package de3;

import java.util.Scanner;
import java.util.*;
import java.lang.NullPointerException;
public class Address {
    public String sonha, duong, quan, thanhpho;
    static Scanner sc =new Scanner(System.in);
    public Address() {
    }

    public Address(String sonha, String duong, String quan, String thanhpho) {
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }
    void input()
    {
        System.out.println(" ");
        sc.nextLine();
        System.out.println("Nhap so nha: ");
        setSonha(sc.nextLine());
        System.out.println("Nhap ten duong:");
        setDuong(sc.nextLine());
        System.out.println("Nhap quan:");
        setQuan(sc.nextLine());
        System.out.println("Nhap thanh pho/tinh:");
        setDuong(sc.nextLine());
    }
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s",getSonha(),getDuong(),getQuan(),getThanhpho());
    }
}
