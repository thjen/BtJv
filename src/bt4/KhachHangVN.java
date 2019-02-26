/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

public class KhachHangVN extends KhachHang{

    private String dtkh;
    private int soluong, dinhmuc;
    private double dongia;

    public KhachHangVN() {
        super();
    }

    public KhachHangVN(String dtkh, int soluong, double dongia, int dinhmuc, String mak, String hoten, String ngayrahd) {
        super(mak, hoten, ngayrahd);
        this.dtkh = dtkh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
    }

    public String getDtkh() {
        return dtkh;
    }

    public void setDtkh(String dtkh) {
        this.dtkh = dtkh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    
    public double thanhTien() {
        if (soluong <= dinhmuc) {
            return this.soluong*this.dongia;
        } else {
            return this.soluong*this.dongia*this.dinhmuc + (soluong-dinhmuc)*dongia*2.5;
        }
    }
    
    public void nhapKhVN() {
        super.nhapKh();
        System.out.println("Chon doi tuong khach hang: ");
        System.out.println("1: Sinh hoat");
        System.out.println("2: Kinh doanh");
        System.out.println("3: San xuat");
        while (true) {
            int i = sc.nextInt();
            if (i == 1) {
                setDtkh("Sinh hoat");
                break;
            } else if (i == 2) {
                setDtkh("Kinh doanh");
                break;
            } else if (i == 3) {
                setDtkh("San xuat");
                break;
            } else {
                System.out.println("Nhap lai: ");
            }
        }
        System.out.println("Nhap so luong: ");
        soluong = sc.nextInt();
        System.out.println("Nhap don gia: ");
        dongia = sc.nextDouble();
        System.out.println("Nhap dinh muc: ");
        dinhmuc = sc.nextInt();
    }
    
    public String toString() {
        return super.toString() + String.format("%15s", dtkh) + String.format("%15s", soluong) + String.format("%15s", dongia) + String.format("%15s", dinhmuc) + String.format("%15s", thanhTien());
    }
}
