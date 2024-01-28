import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        int number, sum=0;
        Scanner sc = new Scanner(System.in);
        while(sum <= 100){
            
            System.out.print("Nhap so nguyen: ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("Tong cac so nguyen: "+sum);
        sc.close();
    }
    
}
