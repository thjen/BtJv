/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import java.util.Scanner;

/**
 *
 * @author thjenit
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguoi: ");
        int sl = sc.nextInt();
        ConNguoi cn[] = new ConNguoi[sl]; // cấp phát bộ nhớ
        System.out.println("NHAP NGUOI");
        for (int i = 0; i < sl; i++) {
            cn[i] = new ConNguoi(); // khởi tạo từng đối tượng
            cn[i].nhapNguoi();
        }
        
        System.out.printf(String.format("%15s","Ho ten") + String.format("%15s","Ngay sinh") + String.format("%15s","Dia chi") + String.format("%15s","Dia chi truong") + String.format("%15s","Luong") + String.format("%15s","Chieu cao"));
        System.out.println("");
        for (int i = 0; i < sl; i++) {
            System.out.printf(cn[i].toString());
            System.out.println("");
        }
        
        System.out.println("Nhap dia chi 1 nguoi: ");
        String dc = sc.next();
        for (int i = 0; i < sl; i++) {
            if (cn[i].getDiachi().equals(dc)) {
                System.out.println("Nhap ho ten: ");
                cn[i].setHoten(sc.next());
                System.out.println("Nhap ngay thang nam: ");
                cn[i].setNgaySinh(new NgayThang(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                System.out.println("Nhap dia chi: ");
                cn[i].setDiachi(sc.next());
                System.out.println("Nhap dia chi truong: ");
                cn[i].setDctruong(sc.nextLine());
                System.out.println("Nhap luong: ");
                cn[i].setLuong(sc.nextDouble());
                System.out.println("Nhap chieu cao: ");
                cn[i].setChieuCao(sc.nextInt());
            }
        }
        
        System.out.printf(String.format("%15s","Ho ten") + String.format("%15s","Ngay sinh") + String.format("%15s","Dia chi") + String.format("%15s","Dia chi truong") + String.format("%15s","Luong") + String.format("%15s","Chieu cao"));
        System.out.println("");
        for (int i = 0; i < sl; i++) {
            System.out.printf(cn[i].toString());
            System.out.println("");
        }
    }
}
