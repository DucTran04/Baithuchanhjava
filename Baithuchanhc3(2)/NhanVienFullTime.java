public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String Name){
        this.Name =Name;
    }
    public NhanVienFullTime(String Name, int ngayLamThem){
        this.Name = Name;
        this.ngayLamThem = ngayLamThem;

    }
    public void setloaiChucVu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
        return"Nhan vien toan thoi gian";
    }
    public void tinhLuong(){
        if(loaiChucVu==Configs.NHAN_VIEN_SEP){
        Salary = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP ;
        }else{
        Salary = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + (Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem) ;
        }
    }

    
}
