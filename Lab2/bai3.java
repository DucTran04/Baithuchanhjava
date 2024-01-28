import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        int age,year;
        String name, ageGroup;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        year = sc.nextInt();
        age = 2024 - year;
        if(age<16){
            ageGroup = "o do tuoi vi thanh nien !";
        }else if(age>=16 && age<18){
            ageGroup = "o do tuoi truong thanh !";
        }else{
            ageGroup= "da gia !";
        }
        System.out.println("Ban "+ name +" "+ ageGroup);
        sc.close();
    }
    
}
