import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("Nhap ky tu: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu " + ch + " trong chuoi là: " + count);
        sc.close();
    }

    
}
