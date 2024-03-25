import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
    }

    public void output() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
    }
}


    

