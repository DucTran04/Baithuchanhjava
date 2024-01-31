import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char kyTu = str.charAt(i);

            if ( kyTu >= 'A'  && kyTu <= 'Z') {
                countUpper++;
            } else if (kyTu >= 'a' && kyTu <= 'z') {
                countLower++;
            } else if (kyTu >= '0' && kyTu <= '9') {
                countNumber++;
            }
        }

        System.out.println("So ky tu thuong: " + countLower);
        System.out.println("So ky tu hoa: " + countUpper);
        System.out.println("So chu so: " + countNumber);
        sc.close();
    }

    
    
    
}
