package de2;

import javax.xml.transform.Source;
import java.util.*;

public class quanLyXe {
    Scanner sc = new Scanner(System.in);
    xe []x = new xe[0];
    int soXe;

    public void nhapXe() {
        System.out.println("Moi nhap so xe: ");
        soXe = sc.nextInt();
        for(int i = 0; i< soXe; i++) {
            int choose;
            do{
                System.out.println("1: Xe bus.");
                System.out.println("2: Xe tai.");
                choose = sc.nextInt();
            }while(choose < 1 && choose > 2);

            switch (choose) {
                case 1:
                 x = Arrays.copyOf(x,x.length + 1);
                 x[x.length - 1] = new bus();
                 x[x.length - 1].nhap();
                 break;

                 case 2:
                 x = Arrays.copyOf(x,x.length + 1);
                 x[x.length - 1] = new truck();
                 x[x.length - 1].nhap();
                 break;
            
            }


        }

    }

    public void addXe() {
        int choose;
        int index;
        System.out.println("So xe co trong mang la " + x.length +".");
        x = Arrays.copyOf(x,x.length + 1);

        System.out.println("Nhap vi tri ban muon them xe vao: ");
        index = sc.nextInt();
        if(index < 1) {
            index = 1;
        }

        if(index > x.length) {
            index = x.length;
        }

        for(int i = x.length - 1; i < index - 1; i --) {
            x[i] = x[i-1];
        }


        do{
            System.out.println("1: xe bus");
            System.out.println("2: xe tai");
            choose = sc.nextInt();

        }while(choose < 1 && choose > 2);

        switch(choose) {
            case 1:
            x[index - 1] = new bus();
            x[index - 1].nhap();
            break;
            case 2:
            x[index - 1] = new truck();
            x[index - 1].nhap();
            break;
        }
    }

    public long tinhTienXeQuaTram(){
        long tien = 0;
        for(int i = 0;i < x.length;i++) {
            tien += x[i].tinhTien();
        }
        return tien;
    }

    public void show() {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i].toString());
        }
    }


}
