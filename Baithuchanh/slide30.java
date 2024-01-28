// Bài tập slide 30/ Chương 2

import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        int n, soDu, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        while(n>0){
            soDu = n%10;
            n=n/10;
            tong += soDu;

        }
        System.out.println("Tong cac chu so = "+tong);


         sc.close();
    }
    
}
