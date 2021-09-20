package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien; //khai bao bien ten sinhVien tham chieu doi tuong kieu SinhVien
        
        sinhVien = new SinhVien();
        sinhVien.mssv = "2008110113";
        sinhVien.tenSinhVien = "Nguyễn Thanh Hiếu";
        sinhVien.queQuan = "Bình Thuận";
        sinhVien.tuoi = 19;

        sinhVien.inThongTinSV();
    }
    
}
