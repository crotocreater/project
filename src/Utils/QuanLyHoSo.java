package Utils;

import ClassKeoTheo.hoSoBenhAn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyHoSo {

    public static void ghiHoSoBenhAn(List<hoSoBenhAn> danhSachHoSo, String tenFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tenFile))) {
            for (hoSoBenhAn hoSo : danhSachHoSo) {
                oos.writeObject(hoSo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<hoSoBenhAn> docHoSoBenhAn(String tenFile) {
        List<hoSoBenhAn> danhSachHoSo = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tenFile))) {
            while (true) {
                hoSoBenhAn hoSo = (hoSoBenhAn) ois.readObject();
                danhSachHoSo.add(hoSo);
            }
        } catch (EOFException e) {
            // Kết thúc file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return danhSachHoSo;
    }
}
