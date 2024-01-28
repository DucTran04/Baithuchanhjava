import java.util.Scanner;
public class slide47 {
    public static void main(String[] args) {
        int Number, sum=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Nhap so nguyen:");
            Number = sc.nextInt();
            sum += Number;
        } while (sum < 100);
        System.out.println("Tong cac so la: "+sum);
        sc.close();


        
        
    }
    
}
