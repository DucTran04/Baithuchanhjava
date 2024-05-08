public class NhanVien {
    protected String Name;
    protected long Salary;
    public NhanVien(){

    }
    public NhanVien(String Name){
        this.Name = Name;
    }
    protected String loaiNhanVien(){
        return"";
    }
    public void XuatThongTin(){
        System.out.println("Nhan vien: "+Name+"  ");
        System.out.println("Loai nhan vien: "+loaiNhanVien());
        System.out.println("Luong: "+Salary+" VND");
    }


    
}
