import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {

HashMap<String, String> hashMapCity = new HashMap<>();
hashMapCity.put("QNg", "Quang Ngai");
hashMapCity.put("NT", "Nha Trang");
hashMapCity.put("HCM", "Thành phố Hồ Chí Minh");
System.out.println("Danh sách các thành phố trong hashMapCity: "); 
Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet(); System.out.println(setCity);

System.out.println("QNg: " + hashMapCity.get("QNg"));

System.out.println("NT: " + hashMapCity.get("NT"));

if (hashMapCity.containsValue("Thành phố Hồ Chí Minh")) {

System.out.println("Có Thành phố Hồ Chí Minh trong hashMapCity");
}
    
}
}
