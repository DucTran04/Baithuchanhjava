import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        int n, giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for( int i = 2; i<=n;i++){
            giaiThua *= i;
        }
    System.out.println(n + "!=" +giaiThua);
    sc.close();
}
}