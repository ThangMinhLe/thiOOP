
package de3;

import static de3.Address.sc;

public class FullName {
    private String ho, ten, tendem;

    public FullName() {
    }

    public FullName(String ho, String ten, String tendem) {
        this.ho = ho;
        this.ten = ten;
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }
    void input()
    {
        System.out.println(" ");
        sc.nextLine();
        System.out.println("Nhap ho: ");
        setHo(sc.nextLine());
        System.out.println("Nhap ten dem:");
        setTendem(sc.nextLine());
        System.out.println("Nhap ten:");
        setTen(sc.nextLine());
    }
    public String toString() {
        return String.format("%-10s %-10s %-10s",getHo(),getTendem(),getTen());
    }
}
