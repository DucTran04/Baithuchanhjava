import java.io.IOException;

public class Slide15 {
    void m() throws IOException{
        throw new IOException ("loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("ngoai le duoc xu ly");
        }
    }
    public static void main(String[] args) {
        Slide15 sl15 = new Slide15();
        sl15.p();
        System.out.println("luong binh thuong.......");
    }
}
