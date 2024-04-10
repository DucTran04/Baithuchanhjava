public class Ketqua {
    public static void main(String[] args) {
        NhanVienFullTime Sep = new NhanVienFullTime("abc");
        Sep.setloaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("SDF");
        linh1.setloaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("SDl",3);
        linh2.setloaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime tv = new NhanVienPartTime("vbn", 8);
        Sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        tv.tinhLuong();
        Sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        tv.XuatThongTin();

    }
    
}
