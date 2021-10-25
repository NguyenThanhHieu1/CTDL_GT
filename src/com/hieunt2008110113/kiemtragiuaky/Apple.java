package com.hieunt2008110113.kiemtragiuaky;

public class Apple {

    int Ma;
    String khoiLuong;
    String mauSac;

    Apple(){}
    
    Apple(int id, String weigh, String color){

        Ma = id;
        khoiLuong = weigh;
        mauSac = color;
    }
    void inThongTin(){
        System.out.println("Mã: " +Ma);
        System.out.println("Khối Lượng: " +khoiLuong);
        System.out.println("Màu sắc: " +mauSac);
    }


    
}
