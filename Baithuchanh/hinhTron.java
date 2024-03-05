import java.util.Scanner;
public class hinhTron {
    public float BK;
    public float CV;
    public float DT;
    public final float PI = 3.14f;
    public void NhapBK(){
        System.out.print("R = ");
        Scanner sc = new Scanner(System.in);
        BK = sc.nextFloat();
        
        sc.close();
    }
    public void TinhCV(){
        CV = 2 * PI * BK;
    }

    public void tinhDT(){
        DT = PI * BK *BK;
    }
    public void inCV(){
        System.out.println("CV = "+CV);

    }
    public void inDT(){
        System.out.println("DT = "+DT);
    }


}
