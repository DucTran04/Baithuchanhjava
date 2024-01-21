import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = sc.nextInt();
       
        if(x % 2 == 0){
            System.out.println("x la so chan");

        }else{
            System.out.println("x la so le");
        }

        sc.close();
    }
    
}
