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
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so giao dich dat");
        int sogd = sc.nextInt();
        GiaodichDat gd[] = new GiaodichDat[sogd];
        for (int i = 0; i < sogd; i++) {
            gd[i] = new GiaodichDat();
            gd[i].nhapGdDat();
        }
        
        System.out.printf(String.format("%15s","Ma giao dich") + String.format("%15s","Ngay giao dich") + String.format("%15s","Don gia") + String.format("%15s","Loai dat") + String.format("%15s","Dien tich") + String.format("%15s","Thanh tien"));
        System.out.println("");
        for (int i = 0; i < sogd; i++) {
            System.out.printf(gd[i].toString());
            System.out.println("");
        }
        
        System.out.println("GIAO DICH CO DIEN TICH MAX");
        System.out.printf(String.format("%15s","Ma giao dich") + String.format("%15s","Ngay giao dich") + String.format("%15s","Don gia") + String.format("%15s","Loai dat") + String.format("%15s","Dien tich") + String.format("%15s","Thanh tien"));
        System.out.println("");
        double dtmax = gd[0].getDientich();
        for (int i = 1; i < sogd; i++) {
            if (gd[i].getDientich() > dtmax ) {
                System.out.printf(gd[i].toString());
            }
        }
        System.out.println("");
    }
}
