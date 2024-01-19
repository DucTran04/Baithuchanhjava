// Phương trình bậc hai-chương 2

import java.util.Scanner;
import java.lang.Math;
public class phuongtrinhbachai {
    public static void main(String[] args) {
        double heSoA, heSoB, heSoC, delTa, x, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap heSoA:");
        heSoA = sc.nextDouble();
        System.out.print("nhap heSoB:");
        heSoB = sc.nextDouble();
        System.out.print("nhap heSoC:");
        heSoC = sc.nextDouble();

        if(heSoA == 0){
            if(heSoB == 0 && heSoC != 0) {
                System.out.println("phuong trinh vo nghiem");

            } else {
                x = -heSoC/heSoB;
                System.out.println("phuong trinh co nghiem la x="+x);
            }

            }else{
                delTa = Math.pow(heSoB,2)-4*heSoA*heSoC;
                if( delTa < 0){
                    System.out.println("phuong trinh vo nghiem");

                }else if( delTa == 0 ){
                    x = -heSoB/2*heSoA;
                    System.out.println("phuong trinh co nghiem kep x ="+x);
                }else{
                    x1=(-heSoB + Math.sqrt(delTa))/(2*heSoA);
                    x2=(-heSoB - Math.sqrt(delTa))/(2*heSoA);
                    System.out.println("phuong trinh co nghiem");
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
            
                }

            }
            sc.close();

        }
    }
    

