package vn.edu.giadinh.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab2Bai4 {
    public static void main(String[] args){
        System.out.println("========Menu=======");
        System.out.println(">>1. Giai phuong trinh bac I");
        System.out.println(">>2. Giai phuong trinh bac II");
        System.out.println(">>3. Tinh tien dien");
        System.out.println("========Menu=======");
        int suLuaChon;
        System.out.print("Lua chon chuc nang:");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chon chuc nang khac");
        }
    }

    static void giaiPTBacI(){
         float a= 0, b = 0;

         if(a == 0){
             if(b == 0){
                 System.out.println("PT vo nghiem");
             }
         }
        }
    static void giaiPTBacII(){
        System.out.println("Trien khai code giai phuong trinh bac 2....");
   }

   static void tinhTienDien(){
    System.out.println("Trien khai code tinh tien dien....");
}
}

