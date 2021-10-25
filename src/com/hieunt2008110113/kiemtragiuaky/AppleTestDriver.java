package com.hieunt2008110113.kiemtragiuaky;

import java.util.ArrayList;

public class AppleTestDriver {
    public static void main(String[] args) {
        
    
    static ArrayList <Apple> listApple = new ArrayList<Apple>();
    
    Apple apple = new Apple();

    System.out.print("Nhập màu sắc: ");
    System.out.print("Nhập mã ID: ");
    System.out.print("Nhập khối lượng: ");
        
    //tim tao theo mau
    static void search(){

        System.out.println("Nhập màu của táo: ");
        String colorName = scanner.next();
        for (Apple a: list){
            if((a.mauSac).equals(colorName)){
                a.inThongTin();
            }else{
                System.out.println("Không có táo màu này!");
            }
        }
    }

    //in danh sach Tao
    static void xuat(){
        for (Apple a : list){
            a.inThongTin();
        }
    }

    }
}
    

