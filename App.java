public class App {
    public static void main(String[] args) throws Exception {
       hinhtron ht = new hinhtron();
       hinhchunhat hcn = new hinhchunhat();
       ht.nhapBanKinh();
       ht.tinhChuVi();
       ht.tinhDienTich();
       ht.inChuVi();
       ht.tinhDienTich();
       
      
       hcn.nhap();
       hcn.hienThi();
       hcn.tinhChuVi();
       hcn.tinhDienTich();
       hcn.hienThiChuViVaDienTich();
    } 
}
