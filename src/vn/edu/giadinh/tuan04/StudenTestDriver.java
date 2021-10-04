package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class StudenTestDriver {

    public static void main(String[] args) {
        //tao 1 danh sach SV
        Student[] studentList = new Student[2];
        
        //Nhap danh sach sinh vien tu ban phim
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhap danh sach sinh vien");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println("Nhap sinh vien thu: " + (i+1));
            System.out.print("Ten sinh vien: ");
            String name = varInput.nextLine();
            System.out.print("Tuoi: ");
            int age = varInput.nextInt();
            varInput.nextLine();
            studentList[i] = new Student(name, age);
        }

        //in thong tin SV
        System.out.println("=====In danh sach sinh vien sau nhap=====");
        for (Student student : studentList){
            student.inThongTin();
        }

    }
    
}
