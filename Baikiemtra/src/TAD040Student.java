import java.util.Scanner;

public class TAD040Student extends TAD040Person {
    public String Quequan;
    @Override
    public void input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Que quan: ");
        Quequan = sc.nextLine();
        
    }
    @Override
    public void output(){
        System.out.println("Que quan: "+Quequan);
    }
    
    
}
