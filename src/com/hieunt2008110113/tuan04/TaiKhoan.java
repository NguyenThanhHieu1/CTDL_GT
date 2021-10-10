package com.hieunt2008110113.tuan04;

public class TaiKhoan {

    String tentaikhoan;
    int sotaikhoan;
    float sodutaikhoan;

    Taikhoan(){}

    Taikhoan(String tk, int stk, float sdtk){
        tentaikhoan = tk;
        sotaikhoan = stk;
        sodutaikhoan = sdtk;

    }

    void intThongTinTaikhoan(){
        System.out.println("Tên tài khoản: " + tentaikhoan + " " + "Số tài khoản: " + sotaikhoan + " " + "Số dư trong tài khoản: " + sodutaikhoan);
    }

    
}
    
}
