// bài 1/Chương 2/Trang 92

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args)  {
        double a, b, Tong, Hieu, Tich, Thuong, Du;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        Tong = a + b;
        Hieu = a - b;
        Tich = a * b;
        Thuong = a / b;
        Du = a % b;
        System.out.println("Tong 2 so la:"+Tong);
        System.out.println("Hieu 2 so la:"+Hieu);
        System.out.println("Tich 2 so la:"+Tich);
        System.out.println("Thuong 2 so la:"+Thuong);
        System.out.println("Du 2 so la:"+Du);
        if(a == b){
            System.out.println(" a bang b");
        }else if(a > b){
            System.out.println("a lon hon b");
        }else{
            System.out.println("a be hon b");
        }
        sc.close();



    }
        
}  

