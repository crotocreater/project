/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author casio
 */
public class BenhNhan extends persion implements Serializable {
    private String soTheBHYT, diaChi;

    public BenhNhan(String ten, String gioiTinh, String thongTinLienLac, int tuoi, String soTheBHYT, String diaChi) {
        super(ten, gioiTinh, thongTinLienLac, tuoi);
        this.soTheBHYT = soTheBHYT;
        this.diaChi = diaChi;
    }

    public BenhNhan() {
    }

    public String getSoTheBHYT() {
        return soTheBHYT;
    }

    public void setSoTheBHYT(String soTheBHYT) {
        this.soTheBHYT = soTheBHYT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public void input(){
        try {
            Scanner sc = new Scanner(System.in);
            super.input();
            System.out.print("Nhap  so the BHYT: ");
            this.soTheBHYT = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            this.diaChi = sc.nextLine();
        }catch (Exception e) {
            System.out.println("Loi: " + e);
        }
    }
    @Override
    public void  output(){
        super.output();
        System.out.printf("%20s%20s\n", this.getDiaChi(), this.getSoTheBHYT());
    }
}
