package vn.edu.giadinh.tuan04;

import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        // Cu phap khai bao mang
        int [] mangSoNguyen; //chua chi dinh so phan tu
        
        mangSoNguyen = new int[5];//=> Mang trong Java la mot kieu tham chieu doi tuong

        double mangSoThuc[] = new double[10];

        //truoc khi dung thi phai xac dinh so phan tu cua mang
        mangSoNguyen[0] = 2;

        //Khai bao co khoi tao gia tri cho mang
        double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("Mang diem mon hoc: " + Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];

        System.out.println("Mang diem mon hoc: " + Arrays.toString(diemMonHoc));

        //Cach 2
        String dsTenSinhVien[] = {"Nguyen","Thanh","Hieu"};
    }
    
}
