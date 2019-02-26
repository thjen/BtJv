package bt3;

import java.util.Scanner;

public class ConNguoi implements DongVat {
    private String hoten, diachi, dctruong;
    private NgayThang ngayt = new NgayThang();
    private double luong;
    private int chieucao;
    Scanner sc = new Scanner(System.in);
       
    @Override
    public void setNgaySinh(NgayThang d) {
       this.ngayt = d;
    }

    @Override
    public void setChieuCao(int i) {
        this.chieucao = i;
    }

    public ConNguoi() {
    }

    public ConNguoi(String hoten, String diachi, String dctruong, NgayThang ngayt, double luong, int chieucao) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.dctruong = dctruong;
        this.ngayt = ngayt;
        this.luong = luong;
        this.chieucao = chieucao;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDctruong() {
        return dctruong;
    }

    public void setDctruong(String dctruong) {
        this.dctruong = dctruong;
    }

    public NgayThang getNgayt() {
        return ngayt;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getChieucao() {
        return chieucao;
    }
    
    public void nhapNguoi() {
        ngayt.nhapNtN();
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        if (hoten.equals("")) {
            return; // dừng;
        }
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap dia chi truong: ");
        dctruong = sc.nextLine();
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        while (true) {
            chieucao = sc.nextInt();
            if (chieucao > 0) {
                break;
            } else {
                System.out.println("Nhap lai: ");
            }
        }
    }
    
    public String toString() {
        return String.format("%15s", hoten) + String.format("%15s", ngayt.toString()) + String.format("%15s", diachi) + String.format("%15s", dctruong) + String.format("%15s", luong) + String.format("%15s", chieucao);
    }
}
