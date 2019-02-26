/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

/**
 *
 * @author thjenit
 */
public class GiaodichDat extends Giaodich{
    private String loaiDat;
    private double dientich;

    GiaodichDat() {
        super();
    }

    GiaodichDat(String loaiDat, double dientich, String magd, String ngaygd, double dongia) {
        super(magd, ngaygd, dongia);
        this.loaiDat = loaiDat;
        this.dientich = dientich;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public void nhapGdDat() {
        super.nhapGd();          
        while(true) {
            loaiDat = sc.nextLine();
            if (loaiDat.equals("A") || loaiDat.equals("B") || loaiDat.equals("C")) {
                break;
            } else {
                System.out.println("Nhap loai dat A hoac B hoac C: ");
            }
        }
        System.out.println("Nhap dien tich: ");
        dientich = sc.nextDouble();
        if (dientich == 0) {
            System.out.println("Khong duoc nhap dien tich = 0");
            return;
        }
    }
    
    private double thanhTien() {
        if (loaiDat.equals("B") || loaiDat.equals("C")) {
            return this.dientich*this.dongia;
        } else {
            return this.dientich*this.dongia*1.5;
        }
    }
    
    public String toString() {
        return super.toString() + String.format("%15s", loaiDat) + String.format("%15s", dientich) + String.format("%15s", thanhTien()); 
    }

}
