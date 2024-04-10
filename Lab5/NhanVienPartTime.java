public class NhanVienPartTime extends NhanVien  {
    private int Time;
    public NhanVienPartTime(String Name, int Time){
        this.Name = Name;
        this.Time = Time;
    }
    @Override
    public String loaiNhanVien(){
        return" Nhan vien thoi vu ";
    }
    public void tinhLuong(){
        Salary = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*Time;
    }


    
}
