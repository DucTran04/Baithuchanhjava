
import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieucao;
    public hinhtru(){
        ten = "hinh tru";
    }
    public void Nhapchieucao(){
        Nhapbankinh();
        System.out.print("Chieu cao : ");
        Scanner sc = new Scanner(System.in);
        
        chieucao = sc.nextFloat();
        //sc.close();
    }
    public void Tinhthetich(){
        super.Tinhdientich();
        tt = dt * chieucao;
        //super.Inthetich();
    }
    
}
