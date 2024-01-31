import java.util.Scanner;
public class slide74 {
    public static void main(String[] args) {
        int n, Tong = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();

        }while(n<0);
        int A[]= new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu "+ i +":");
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; i++ ){
            if(A[i] % 2 == 0){
                Tong += A[i];
            }
        }
        System.out.println("Tong cac so chan cua mang la:"+Tong);
       sc.close(); 
    }
    
}
