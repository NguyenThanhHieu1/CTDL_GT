package com.hieunt2008110113.tuan01;

public class BaiTap3Lab1 {
    public static void main(String[] args) {
        double canh,theTich;

        Scanner biennhap=new Scanner(System.in);

        System.out.println("  \tChương trình tính thể tích hình chữ nhật\n ");

        System.out.print("nhập cạnh của hình chứ nhât vào:");
        canh=biennhap.nextDouble();
        
        theTich=canh*canh*canh;
        System.out.println("thể tích hình chữ nhật là    :"+theTich);
    
}
    
    
}
