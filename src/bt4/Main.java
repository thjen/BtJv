/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

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
        
        KhachHangVN kh[] = new KhachHangVN[sl];
        System.out.println("NHAP KHACH HANG");
        for (int i = 0; i < sl; i++) {
            kh[i] = new KhachHangVN();
            kh[i].nhapKhVN();
        }
        
        System.out.printf(String.format("%15s","Ma kh") + String.format("%15s","Ho ten") + String.format("%15s","Ngay ra hd") + String.format("%15s","Doi tuong") + String.format("%15s","So luong") + String.format("%15s","Don gia") + String.format("%15s","Dinh muc") + String.format("%15s","Thanh tien"));
        System.out.println("");
        for (int i = 0; i < sl; i++) {
            System.out.printf(kh[i].toString());
            System.out.println("");
        }
        
        for (int i = 0; i < sl - 1; i++) { 
            for (int j = i + 1; j < sl; j++) {
                if (kh[i].getMak().charAt(0) > kh[j].getMak().charAt(0)) {
                    KhachHangVN temp = kh[i];
                    kh[i] = kh[j];
                    kh[j] = temp;
                } else if (kh[i].getMak().equals(kh[j].getMak())) {
                    if (kh[i].thanhTien() < kh[j].thanhTien()) {
                        KhachHangVN temp = kh[i];
                        kh[i] = kh[j];
                        kh[j] = temp;
                    }
                }
            }
        }
        System.out.println("CHUOI SAU SAP XEP");
        System.out.printf(String.format("%15s","Ma kh") + String.format("%15s","Ho ten") + String.format("%15s","Ngay ra hd") + String.format("%15s","Doi tuong") + String.format("%15s","So luong") + String.format("%15s","Don gia") + String.format("%15s","Dinh muc") + String.format("%15s","Thanh tien"));
        System.out.println("");
        for (int i = 0; i < sl; i++) {
            System.out.printf(kh[i].toString());
            System.out.println("");
        }
    }
}
