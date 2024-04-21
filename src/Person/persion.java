package Person;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author casio
 */
public class persion implements Serializable{
    private String ten, gioiTinh, thongTinLienLac;
    private int tuoi;

    public persion(String ten, String gioiTinh, String thongTinLienLac, int tuoi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.thongTinLienLac = thongTinLienLac;
        this.tuoi = tuoi;
    }

    public persion() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }


    public String getThongTinLienLac(){
        return this.thongTinLienLac;
    }


    // khởi tạo thông tin liên lạc có thể là sdt hoặc có thể là email
    public void setThongTinLienLac(Scanner sc) {
        System.out.print("Nhap thong tin lien lac: ");
        this.thongTinLienLac = sc.nextLine();
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", gioiTinh=" + gioiTinh + ", thongTinLienLac=" + thongTinLienLac + ", tuoi=" + tuoi + '}';
    }
    public void input(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ten: ");
            this.ten = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.tuoi = new Scanner(System.in).nextInt();
            System.out.print("Nhap gioi tinh: ");
            this.gioiTinh = sc.nextLine();
            this.setThongTinLienLac(sc);
        }catch (Exception e){
            System.out.println("lỗi: "+e);
        }

    }
    public void output(){
        System.out.printf("%20s%7d%10s%20s", this.getTen(),this.getTuoi(),this.getGioiTinh(),this.getThongTinLienLac());
    }
}

