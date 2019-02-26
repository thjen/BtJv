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
public class NgayThang {
    private int ngay,thang,nam;

    public NgayThang() {
    }

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void nhapNtN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
    }
    
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
