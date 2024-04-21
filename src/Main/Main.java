package Main;

import ClassKeoTheo.DichVu;
import ClassKeoTheo.Thuoc;
import ClassKeoTheo.hoSoBenhAn;
import Person.BacSI;
import Person.persion;
import Utils.QuanLyHoSo;

import java.text.DateFormat;
import java.util.*;

//"nguyen van a", "nam", "0923123124", 30,"b", "tien si"
public class Main {
    public static void main(String[] args) {
        List<hoSoBenhAn> hoSoBenhAnList = new ArrayList<>();
        hoSoBenhAnList = QuanLyHoSo.docHoSoBenhAn("hosobenhan.dat");
        while (true){

            System.out.println("\n=================================================Menu===============================================");
            System.out.println("1. Nhap Ho So Benh AN");
            System.out.println("2. Xuat Ho So Benh An");
            System.out.println("3. Xuat Danh Sach Ho So Benh An");
            System.out.println("4. Xoa Ho So Benh An Theo Ma");
            System.out.println("5. In thong tin ho so benh an co ma");
            System.out.println("6. Sap xep theo tong chi phi tang dan");
            System.out.println("7. thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            try {


            int lc = new Scanner(System.in).nextInt();
            if (lc == 1){
                hoSoBenhAn hoSoBenhAn = new hoSoBenhAn();
                hoSoBenhAn.taoHoSoBenhAn();
                hoSoBenhAn.themMotLieuThuoc();
                hoSoBenhAn.themMotDichVu();
                hoSoBenhAnList.add(hoSoBenhAn);
            } else if (lc == 2) {
                hoSoBenhAnList.getLast().xuatHoSoBenhAn();
            } else if (lc == 3) {
                System.out.println("Danh sach ho so:");
                for (hoSoBenhAn a: hoSoBenhAnList){
                    a.xuatHoSoBenhAn();
                }
            } else if (lc == 4) {
                System.out.print("Nhap ma ho so");
                String key = new Scanner(System.in).nextLine();
                boolean a = true;
                for (int i = 0 ;i<hoSoBenhAnList.size();i++){
                    if(hoSoBenhAnList.get(i).getMaHS().equals(key)){
                        a = false;
                        hoSoBenhAnList.remove(i);
                    }
                }
                if (a){
                    System.out.println("Ko ton tai");
                }
            } else if (lc == 5) {
                System.out.print("Nhap ma ho so");
                String key = new Scanner(System.in).nextLine();
                boolean a = true;
                for (hoSoBenhAn c: hoSoBenhAnList){
                    if(c.getMaHS().equals(key)){
                        a = false;
                        c.xuatHoSoBenhAn();
                    }
                }
                if (a){
                    System.out.println("Ko ton tai");
                }
            } else if (lc == 6) {

                Comparator <hoSoBenhAn> comp = new Comparator<hoSoBenhAn>() {
                    @Override
                    public int compare(ClassKeoTheo.hoSoBenhAn o1, ClassKeoTheo.hoSoBenhAn o2) {
                        if (o1.getTongDonGia()>o2.getTongDonGia()){
                            return 1;
                        } else if (o1.getTongDonGia()<o2.getTongDonGia()) {
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                };
                Collections.sort(hoSoBenhAnList,comp);
            }else if(lc == 7){
                QuanLyHoSo.ghiHoSoBenhAn(hoSoBenhAnList,"hosobenhan.dat");
                return;
            }else {
                continue;
            } }catch (Exception e){
                System.out.print(e);
            }
        }
    }
}
