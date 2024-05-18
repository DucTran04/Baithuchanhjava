import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
String name;
HashSet<String> hashSetString = new HashSet<>(); 
Scanner sc = new Scanner(System.in);

hashSetString.add("Nike");
hashSetString.add("Volvo");
hashSetString.add("Kia");
hashSetString.add("Lenovo"); 
hashSetString.add("Lenovo");
System.out.println("Cac phan tu trong hashSetString: ");
System.out.println(hashSetString);
System.out.println("Nhap phan tu can xoa: ");

name = sc.nextLine();
if(hashSetString.contains(name)){
hashSetString.remove(name);
System.out.println("Xóa thành công!");
System.out.println("Các phần tử còn lại trong hashSetString:");
System.out.println(hashSetString);

} else {
}
System.out.println("Xóa không thành công!");

    
} 
    
}
