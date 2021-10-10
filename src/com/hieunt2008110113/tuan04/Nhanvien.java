package com.hieunt2008110113.tuan04;

public class nhanvien {
    String tennhanvien;
    String diachi;
    String bophanlamviec;
    int luong;
    String ngaysinh;


    Nhanvien(String t, String dc, String bplv, int l, String ns){
        tennhanvien = t;
        diachi = dc;
        bophanlamviec = bplv;
        luong = l;
        ngaysinh = ns;

    }

    void intThongTinNhanvien(){
        System.out.println("Tên Nhân viên:" + tennhanvien + " " + "Địa chỉ:" + diachi + " " + "Bộ phận làm việc:" + bophanlamviec + " " + "Lương:" + luong + " " + "Ngày sinh:" + ngaysinh + " ");
        
    }

    
}
    
}
