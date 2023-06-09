package de1;
import java.util.*;
import java.util.Arrays;

public class mainMonter {
        monter mt[] = new monter[0];
        int n = mt.length;
        Scanner sc = new Scanner(System.in);

        //Add mot monter
        public void add() {
            mt = Arrays.copyOf(mt, mt.length + 1);
            int choose;
            do{
                System.out.println("1: Fire Monter!!!");
                System.out.println("2: Water Monter!!!");
                System.out.println("3: Stone Monter!!!");
                System.out.println("Moi nhap lua chon!");
                choose = sc.nextInt();
                sc.nextLine(); // Đọc ký tự xuống dòng sau khi đọc số nguyên

            }while(choose < 1 || choose > 3);

            switch(choose) {
                case 1: 
                    mt[mt.length-1] = new fireMonter();
                    System.out.print("Nhap ten cho Monter: ");
                    mt[mt.length-1].setName(sc.nextLine());
                    break;

                    case 2: 
                    mt[mt.length-1] = new waterMonter();
                    System.out.print("Nhap ten cho Monter: ");
                    mt[mt.length-1].setName(sc.nextLine());
                    break;

                    case 3: 
                    mt[mt.length-1] = new stoneMonter();
                    System.out.print("Nhap ten cho Monter: ");
                    mt[mt.length-1].setName(sc.nextLine());
                    break;

            }
            choose = 0;

        }


        //Tim kiem mot monter
        public void find (String name) {
            boolean flag = false;
            for(monter x:mt) {
                if(x.getName().equalsIgnoreCase(name)) {
                    System.out.println("Co " + x.getName() + " Trong mang monter!!!" );
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
                }
                if(flag) {
                    System.out.println("Khong co ten " + name + " trong danh sach monter!!!");
                }
            }

        //Call tat ca ham attack cua cac monter hien co trong mang
        public void callAttack() {
            for(monter x:mt) {
                System.out.println(x.attack());
            }
        }

        public void show(){
            System.out.printf("%s\n","--------------------------------------------" );
            for(monter x:mt) {
            System.out.printf("%s\n", x.getName() );
            }
        }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            mainMonter m = new mainMonter();
            int choose1;
            for(;;){
            do{
                System.out.println("1: Nhap TT.");
                System.out.println("0: Exit.");
                choose1 = sc.nextInt();
                sc.nextLine();
                }while(choose1 < 0 || choose1 > 1);
                if(choose1 == 1){
                m.add();
                }
                if(choose1 == 0) break;
            }
            
            // m.show();


            // System.out.println("Find name a monter");
            // m.find(sc.nextLine());

            for(;;) {
                int choose;
                do{
                System.out.println("Ban co muon call attack monter!!!"); 
                System.out.println("1:Call.");
                System.out.println("2:Exit.");
                System.out.print("Nhap lua chon: ");
                choose = sc.nextInt();
                } while(choose < 1 || choose > 2);
                   
                    if(choose == 1) {
                            System.out.println("Call attack Monter!!!");
                            m.callAttack(); 
                            break;    }       
                       
                    else {
                        break; 
                    }

            }

        }

}
