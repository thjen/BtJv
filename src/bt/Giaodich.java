/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

import java.util.Scanner;

/**
 *
 * @author thjenit
 */
public class Giaodich {
    private String magd;
    private String ngaygd;
    double dongia;
    Scanner sc = new Scanner(System.in);
    
    public Giaodich() {
    }

    public Giaodich(String magd, String ngaygd, double dongia) {
        this.magd = magd;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
    }

    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    public void nhapGd() {
        System.out.println("Nhap ma giao dich: ");
        while(true) {
            magd = sc.nextLine();
            if (!magd.equals("")) {
                break;
            } else {
                System.out.println("Ma giao dich khong duoc de trong, nhap lai!");
            }
        }     
        System.out.println("Nhap ngay giao dich: ");
        ngaygd = sc.nextLine();
        System.out.println("Nhap don gia: ");
        dongia = sc.nextDouble();
    }
    
    public String toString() {
        return String.format("%15s", magd) + String.format("%15s", ngaygd) + String.format("%15s",dongia);
    }
}
