package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {
    //1.Thuoc tinh

    String mssv;
    String tenSinhVien;
    int tuoi;

    String queQuan;

    Date ngaySinh;

    //2. Phuong thuc
    //<Kieu tra ve> <ten ham> <(danh sach tham so)>{......}
    void inThongTinSV(){
        System.out.println("Ma So Sinh Vien: " + mssv);
        System.out.println("Ten Sinh Vien: " + tenSinhVien);
        System.out.println("Que Quan: " + queQuan);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Ngay Sinh: " + ngaySinh);
    } 
    
}
