package ClassKeoTheo;

import Person.BacSI;
import Person.BenhNhan;


import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class hoSoBenhAn implements Serializable {
    private String maHS, ngayLap, ChuanDoan, GhiChu;
    private BacSI bacSI;
    private BenhNhan benhNhan;
    private List<DichVu> dichVuList;
    private List<Thuoc> thuocList;

    private double tong;

    public hoSoBenhAn(String maHS, String ngayLap, BacSI bacSI, BenhNhan benhNhan, List<DichVu> dichVuList, List<Thuoc> thuocList) {
        this.maHS = maHS;
        this.benhNhan = benhNhan;
        this.bacSI = bacSI;
        this.dichVuList = dichVuList;
        this.ngayLap = ngayLap;
        this.thuocList = thuocList;
        tong = 0;
    }

    public hoSoBenhAn() {
        this.bacSI = new BacSI();
        this.benhNhan = new BenhNhan();
        this.thuocList = new ArrayList<>();
        this.dichVuList = new ArrayList<>();
        this.setNgayLap();
        tong = 0;
    }

    public String getMaHS() {
        return maHS;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public BacSI getBacSI() {
        return bacSI;
    }

    public void setBacSI(BacSI bacSI) {
        this.bacSI = bacSI;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public List<DichVu> getDichVuList() {
        return dichVuList;
    }

    public List<Thuoc> getThuocList() {
        return thuocList;
    }

    public void setThuocList(List<Thuoc> thuocList) {
        this.thuocList = thuocList;
    }

    public void setDichVuList(List<DichVu> dichVuList) {
        this.dichVuList = dichVuList;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public void setNgayLap() {
        Date currentDate = new Date();
        this.ngayLap = DateFormat.getInstance().format(currentDate);
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }


    public String getChuanDoan() {
        return  this.ChuanDoan;
    }

    public String getGhiChu() {
        return this.GhiChu;
    }

    public void setChuanDoan(String chuanDoan) {
        ChuanDoan = chuanDoan;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public  void themMotLieuThuoc(){
        System.out.println("Nhap so lung thuoc can them: ");
        int size = new Scanner(System.in).nextInt();
        for (int i = 0;i<size;i++){
            Thuoc a = new Thuoc();
            a.input();
            this.thuocList.add(a);
        }
        System.out.println("Thanh cong: ");
    }
    public void themMotDichVu(){
        System.out.println("Nhap so Dich Vu can them: ");
        int size = new Scanner(System.in).nextInt();
        for (int i=0;i<size;i++){
            DichVu a = new DichVu();
            a.nhap();
            this.dichVuList.add(a);
        }
        System.out.println("Thanh cong: ");
    }

    public  void xuatDSDV(){
        System.out.printf("%10s%20s%10s%20s\n", "Ma DV", "Ten DV", "So Luong", "Dom gia");
        for (DichVu a:this.dichVuList){
            a.xuat();
        }
    }
    public void xuatDSThuoc(){
        System.out.printf("%10s%20s%20s%10s\n","Ma thuoc", "Ten thuoc", "Don gia", "So luong");
        for (Thuoc thuoc:this.thuocList){
            thuoc.output();
        }
    }
    // tao hsba
    public  void taoHoSoBenhAn(){
        System.out.printf("%85s\n","HỒ SƠ BỆNH ÁN");
        System.out.printf("%97s\n","CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM");
        System.out.printf("%94s\n","Độc lập - Tự do - Hạnh phúc");
        System.out.printf("%87s\n","---------------");
        System.out.print("Ma Benh an: ");
        this.maHS = new Scanner(System.in).nextLine();
        System.out.printf("%150s\n", "Ngay lap:   "+this.getNgayLap());
        this.benhNhan.input();
        System.out.println("Chuan doan:");
        this.ChuanDoan = new Scanner(System.in).nextLine();
        System.out.println("Ghi chu qua trinh: ");
        this.GhiChu = new Scanner(System.in).nextLine();
        this.bacSI.input();
        this.getTongDonGia();
    }

    public  void xuatHoSoBenhAn(){
        System.out.printf("%85s\n","HỒ SƠ BỆNH ÁN");
        System.out.printf("%97s\n","CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM");
        System.out.printf("%94s\n","Độc lập - Tự do - Hạnh phúc");
        System.out.printf("%87s\n","---------------");
        System.out.print("Ma Benh an: " + this.getMaHS());
        System.out.printf("%150s\n", "Ngay lap:   "+this.getNgayLap());
        System.out.println("Ho va ten:   "+ this.getBenhNhan().getTen());
        System.out.println("Tuoi:   "+this.getBenhNhan().getTuoi());
        System.out.println("Gioi Tinh"+ this.getBenhNhan().getTuoi());
        System.out.println("Ma so the BHYT:   "+ this.getBenhNhan().getSoTheBHYT());
        System.out.println("Thong tin lien lac: "+this.getBenhNhan().getThongTinLienLac());
        System.out.println("Dia chi: "+ this.getBenhNhan().getDiaChi());
        System.out.println("Vao vien luc: " +  this.getNgayLap());
        System.out.println("Chuan doan: "+ this.getChuanDoan());
        System.out.println("Ghi chu qua trinh: " + this.getGhiChu());
        System.out.println("Bac si: " + this.getBacSI().getTen());
        System.out.println("Chuyen mon: " + this.getBacSI().getChuyenMon());
        System.out.println("Trinh do: " + this.getBacSI().getTrinhDo());
        System.out.println("Danh sacj thuoc duoc ke don: ");
        this.xuatDSThuoc();
        System.out.println("Danh sach dich vu dc dung:");
        this.xuatDSDV();
        System.out.printf("%5s%40s\n","Tong tien thanh toan ", this.tong);
        System.out.printf("%105s%40s\n","HỒ SƠ BỆNH ÁN  "+this.getChuanDoan() , "Ngay: "+this.getNgayLap());
    }

    public double getTongDonGia() {
        for (DichVu dv:dichVuList){
            this.tong += dv.getDonGia();
        }
        for (Thuoc thuoc:thuocList){
            this.tong +=thuoc.getDonGia();
        }
        return tong;
    }
}
