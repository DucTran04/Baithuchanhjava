import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        int n,number, sum = 0;
        double Tbc;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so cac so nguyen trong day: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Nhap so nguyen thu " + i + " : ");
            number = sc.nextInt();
            sum += number;
            
        }
        Tbc = (double) sum/n;
        System.out.print("Trung binh cong cua day so nguyen la: "+Tbc);
        sc.close();
    }
    
}
