/// Bài tập slide 35/ Chương 2
import java.util.Scanner;
public class slide35 {
   
    public static void main(String[] args) {
        int number1, number2 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        number1 = sc.nextInt();
        System.out.print("nhap so thu hai:  ");
        number2 = sc.nextInt();
        int minNumber = number1;
        
        if( number1 > number2){
            number2 = minNumber;

        }
        System.out.println("So nho nhat trong hai so "+ number1 +" va "+ number2 +" la "+minNumber);
        sc.close();

        
    }
    
}
