import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float cd;
    public float cr;
    public hinhchunhat(){
        ten = " Hinh chu nhat ";
    }
    public void Nhapchieudai(){
        System.out.print("chieu dai: ");
        Scanner sc = new Scanner(System.in);
        cd = sc.nextFloat();
        //sc.close();
    }
    public void Nhapchieurong(){
        System.out.print("chieu rong: ");
        Scanner sc = new Scanner(System.in);
        cr = sc.nextFloat();
        //sc.close();
    }
    public void Tinhchuvi(){
        cv = ( cd + cr) * 2;
    }
    public void Tinhdientich(){
        dt = cd * cr;
    }

}
