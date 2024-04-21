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
public class BacSI extends persion implements Serializable {
    private String chuyenMon, trinhDo;

    public BacSI(String ten, String gioiTinh, String thongTinLienLac, int tuoi, String chuyenMon, String diaChi) {
        super(ten, gioiTinh, thongTinLienLac, tuoi);
        this.chuyenMon = chuyenMon;
        this.trinhDo = diaChi;
    }

    public BacSI() {
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    @Override
    public void input(){
        try{
            Scanner sc = new Scanner(System.in);
            super.input();
            System.out.print("Nhap chuyen mon: ");
            this.chuyenMon = sc.nextLine();
            System.out.print("Nhap trinh do: ");
            this.trinhDo = sc.nextLine();
        }catch (Exception e){
            System.out.println("Loi "+ e);
        }
    }
    @Override
    public  void output(){
        super.output();
        System.out.printf("%20s%20s\n", this.getChuyenMon(), this.getTrinhDo());
    }
}
