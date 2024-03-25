
import java.util.Scanner;

public class person {
    public String Name;
    public int Age;
    public int Msv;
    public void tenSinhvien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        Name = sc.nextLine();
        sc.close();
    }
    public void Tuoi(int Age){
        System.out.println("Tuoi: "+Age);
    }
    public void Masinhvien(int Msv){
        System.out.println("Ma sinh vien: "+Msv);
        
    }
    

    }

    

