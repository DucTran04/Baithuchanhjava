import java.util.Scanner;

public class TAD040Person {
    public String name;
    public int age;
    public float ID;
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten sinh vien: ");
    name = sc.nextLine();
    System.out.print("Nhap tuoi: ");
    age = sc.nextInt();
    System.out.print("Nhap ID: ");
    ID = sc.nextFloat();
    
} 
public void output(){
    System.out.println("Sinh vien: "+name);
    System.out.println("Tuoi: "+age);
    System.out.println("ID: "+ID);
} 
    
}
