package ClassKeoTheo;

import java.io.Serializable;
import java.util.Scanner;

public class Thuoc implements Serializable {
    private String maThuoc, tenThuoc;
    private int soLuong;
    private double donGia;

    public Thuoc(String maThuoc, String tenThuoc, int soLuong, double donGia) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public Thuoc() {
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public void input(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma Thuoc: ");
            this.maThuoc = scanner.nextLine();
            System.out.print("Nhap ten thuoc: ");
            this.tenThuoc = scanner.nextLine();
            System.out.print("Nhap so luong: ");
            this.soLuong = scanner.nextInt();
            System.out.print("Nhap don gia: ");
            this.donGia = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Loi: "+e);
        }
    }
    public void output(){
        System.out.printf("%10s%20s%20.1f%10d\n", this.getMaThuoc(), this.getTenThuoc(), this.getDonGia(),this.getSoLuong());
    }
}
