import java.util.ArrayList;
public class Arrlist {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList <String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("pink");
        
        System.out.println(colors.get(1));
        System.out.println(colors.contains("orange"));
        System.out.println(colors.size());
        System.out.println(colors);
}
}