import java.util.ArrayList;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        ArrayList <Integer> ArrlistInteger = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.print("Nhap phan tu thu "+ i +":");
            number = sc.nextInt();
            ArrlistInteger.add(number);
        }
        int max = ArrlistInteger.get(0);
        for (int i = 1 ; i< ArrlistInteger.size(); i++ ){
            if(ArrlistInteger.get(i).compareTo(max)>0){
                max = ArrlistInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong ArrlistInteger = "+max);

    }
    
    
}
