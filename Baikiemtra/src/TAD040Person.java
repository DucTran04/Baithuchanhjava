import java.util.Scanner;

public class TAD040Person {
    public String name;
    public int age;
    public int ID;
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten sinh vien:");
    name = sc.nextLine();
    System.out.print("Nhap tuoi: ");
    age = sc.nextInt();
    System.out.print("Nhap ID: ");
    ID = sc.nextInt();
    
} 
public void output(){
    System.out.print("Sinh vien: "+name);
    System.out.println("Tuoi: "+age);
    System.out.println("ID: "+ID);
} 
    
}
