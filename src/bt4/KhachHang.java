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
public class KhachHang {
    private String mak, hoten, ngayrahd;
    Scanner sc = new Scanner(System.in);

    public KhachHang() {
    }  
    
    public KhachHang(String mak, String hoten, String ngayrahd) {
        this.mak = mak;
        this.hoten = hoten;
        this.ngayrahd = ngayrahd;
    }

    public String getMak() {
        return mak;
    }

    public void setMak(String mak) {
        this.mak = mak;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgayrahd() {
        return ngayrahd;
    }

    public void setNgayrahd(String ngayrahd) {
        this.ngayrahd = ngayrahd;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public void nhapKh() {
        System.out.println("Nhap ma khach: ");
        while (true) {
            mak = sc.next();
            if (!mak.equals("")) {
                break;
            } else {
                System.out.println("Nhap lai: ");
            }
        }        
        System.out.println("Nhap ho ten: ");
        hoten = sc.next();
        System.out.println("Nhap ngay ra hd: ");
        ngayrahd = sc.next();
    }
    
    public String toString() {
        return String.format("%15s", mak) + String.format("%15s", hoten) + String.format("%15s", ngayrahd);
    }
}
