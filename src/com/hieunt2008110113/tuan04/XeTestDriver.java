package com.hieunt2008110113.tuan04;

public class XeTestDriver {
    public static void main(String[] args) {
        Xe[] xelist = new Xe[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < xelist.length; i++ ){
            System.out.print("Tên chủ xe: ");
            String t = bienNhap.nextLine();
            System.out.print("Hảng sản xuất: ");
            String hx = bienNhap.nextLine();
            System.out.print("Dòng: ");
            String d = bienNhap.nextLine();
            System.out.print("Giấy phép: ");
            String gp = bienNhap.nextLine();
            System.out.print("Dung tích xăng: ");
            int dx = bienNhap.nextInt();
            bienNhap.nextLine();
            xelist[i] = new Xe(t, hx, d, gp, dx);

        }

        System.out.println("*****THÔNG TIN CHỦ XE*****");
        for(Xe xe : xelist){
            xe.intThongTinXe();
        }
    }
    
}
    
}
