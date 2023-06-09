package de2;

public class truck extends xe { 

        long trongTai;

        public truck(){

        }

        public truck(int bienSo, String nhanHieu, String mauXe, long trongTai) {
            super(bienSo, nhanHieu, mauXe);
            this.trongTai = trongTai;

        }

        public long getTrongTai() {
            return this.trongTai;
        }

        public long setTrongTai(long trongTai) {
            return this.trongTai = trongTai;
        }

        public void nhap() {
            super.nhap();
            System.out.println("Nhap trong tai: ");
            setTrongTai(sc.nextLong());
            
            
        }

        public String toString() {
            return super.toString() + String.format("%d",getTrongTai());
        }

        public long tinhTien() {
            if(trongTai < 3) return 15000;
            else return 30000;
        }


    
}
