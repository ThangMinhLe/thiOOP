package de2;

public class main {
    
    public static void main(String[] args) {
        quanLyXe x = new quanLyXe();

        x.nhapXe();

        x.addXe();
        
        x.show();

        System.out.printf("Tong tien xe qua tram la: %d", x.tinhTienXeQuaTram());
    }

}
