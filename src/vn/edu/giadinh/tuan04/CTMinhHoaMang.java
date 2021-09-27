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

        System.out.println("So phan tu cua mang diem mon hoc: " + diemMonHoc.length);

        //Cach 2
        String dsTenSinhVien[] = {"Nguyen","Thanh","Hieu"};

        //dung vong lap de duyet mang
        System.out.println("=====Duyet Mang======");

        for(int i = 0; i < diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
         }

        System.out.println("=====For - Each=====");
         //For-Each
        for(double diem : diemMonHoc){
            System.out.println(diem);
        }

        //Mang co kieu du lieu tham chieu doi tuong 
        Dog[] danhSachDog = new Dog[7];

        Dog dog0 = new Dog(10, "Den", "Fido");
        Dog dog1 = new Dog(7, "Vang", "La la");
        Dog dog2 = new Dog(25, "Den trang", "Lulu");
        Dog dog3 = new Dog(26, "Vang Den", "Lili");
        Dog dog4 = new Dog(30, "Trang Vang", "Lolo");
        Dog dog5 = new Dog(35, "Den Nau", "Kiki");
        Dog dog6 = new Dog(40, "Vang Trang", "Kaka");
        
        danhSachDog[0] = dog0;
        danhSachDog[1] = dog3;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog1;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        danhSachDog[0].inThongTin();   
        danhSachDog[1].inThongTin();  
        danhSachDog[2].inThongTin();
        danhSachDog[3].inThongTin();
        danhSachDog[4].inThongTin();
        danhSachDog[5].inThongTin();
        danhSachDog[6].inThongTin();
  
    }
    
}
