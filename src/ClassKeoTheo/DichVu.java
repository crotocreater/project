package ClassKeoTheo;

import java.io.Serializable;
import java.util.Scanner;

public class DichVu implements Serializable {
    private String maDv,tenDv;
    private int sLg;
    private double donGia;

    public DichVu(String maDv, String tenDv, int sLg, double donGia) {
        this.maDv = maDv;
        this.tenDv = tenDv;
        this.donGia = donGia;
        this.sLg = sLg;
    }

    public DichVu() {
    }

    public String getMaDv(){
        return maDv;
    }
    public void setMaDv(String maDv){
        this.maDv=maDv;
    }
    public int getSLg(){
        return  sLg;
    }
    public void setSLg(int sLg){
        this.sLg=  sLg;
    }
    public double getDonGia(){
        return  donGia;
    }
    public void setDonGia(double donGia){
        this.donGia=donGia;
    }

    public String getTenDv() {
        return tenDv;
    }

    public int getsLg() {
        return sLg;
    }

    public void setsLg(int sLg) {
        this.sLg = sLg;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public void nhap(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap maDv: ");
            maDv = sc.nextLine();
            System.out.print("Nhap ten DV: ");
            this.tenDv = sc.nextLine();
            System.out.print("Nhap so luong: ");
            sLg = sc.nextInt();
            System.out.print("Nhap don Gia: ");
            donGia = sc.nextDouble();
        }catch (Exception e){
            System.out.println("lỗi: "+e);
        }
    }

    public void xuat(){
        System.out.printf("%10s%20s%10d%20.1f\n", this.getMaDv(), this.getTenDv(), this.getsLg(), this.getDonGia());
    }
}

