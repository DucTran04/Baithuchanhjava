
import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float Bk;
    public hinhtron(){
        ten = "hinh tron";
    }
    public void Nhapbankinh(){
        System.out.print(" Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        Bk = sc.nextFloat();
        //sc.close();
    }
    public void Tinhchuvi(){
        cv = 2 * PI * Bk;
        //super.Inchuvi();
    }
    public void Tinhdientich(){
        dt = PI * Bk * Bk;
        //super.Indientich();
    }

    
}
