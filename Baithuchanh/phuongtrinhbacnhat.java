// Phương trình bậc nhất-chương 2

import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args)  {
        double heSoA, heSoB, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap heSoA:");
        heSoA = sc.nextDouble();
        System.out.print("nhap heSoB:");
        heSoB = sc.nextDouble();
        if(heSoA == 0){
            System.out.println(" khong la phuong trinh bac nhat ");
        }else{
            
            x = -heSoB/heSoA;
            System.out.println("phuong trinh co nghiem la x="+x);
        }
        sc.close();
    }

}   

    


    
            
    


