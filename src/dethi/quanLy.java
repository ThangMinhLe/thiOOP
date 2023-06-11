package dethi;
import java.util.*;


public class quanLy {
    sanPham sp[] = new sanPham[0]; 
    Scanner sc = new Scanner(System.in);

    public void add() {
        sp = Arrays.copyOf(sp,sp.length + 1);
        int choose;
        do{
            System.out.println("1:Quan ao.");      
            System.out.println("2:Ruou.");           
            System.out.println("3:Nuoc hoa.");
            choose = sc.nextInt();
           
        } while (choose < 1 || choose > 3);

        switch(choose) {
             case 1:
             sp[sp.length-1] = new quanAo();
             sp[sp.length - 1].nhapTT();
             break;

              case 2:
             sp[sp.length-1] = new Ruou();
             sp[sp.length - 1].nhapTT();
             break;

              case 3:
             sp[sp.length-1] = new nuocHoa();
             sp[sp.length - 1].nhapTT();
             break;
        }
    }

    public double tinhTongThueDacBiet() {
        double tong = 0;

        for(int i = 0; i < sp.length; i++) {
            if(sp[i] instanceof nuocHoa || sp[i] instanceof Ruou) { 
            tong += sp[i].tinhThueDacBietSum();
            }
        }

        return tong;
    }

    public void xuat() {
        for(sanPham x : sp) {
            System.out.println(x.toString());
            System.out.println("===========================================================");
        }
    }

    public static void main(String[] args) {
        quanLy x = new quanLy();
        x.add();
        x.xuat();

        System.out.println(x.tinhTongThueDacBiet());

        

    }
    
}
