import java.util.Scanner;

public class KQ {
    public class MainClass {
    public static void main(String[] args) 
    {
        hinhTron ht1 = new hinhTron();
        ht1.BK = 10.0f;
        System.out.println(ht1.BK);
        hinhTron2 ht2 = new hinhTron2();
        ht2.nhapBK();
        if(ht2.VongTronLon())
        {System.out.println("Hinh tron co ban kinh " + ht2.setBanKinh());}
        else
        {   float chuvi = ht2.tinhChuVi();
            System.out.println("Chu vi hinh tron "+ chuvi);}
        
        
        hinhTron3 ht3 = new hinhTron3();
        System.out.println(" Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        float bk = sc.nextFloat();
        ht3.setBanKinh(bk);
        System.out.println("Nhap vao toan do hinh tron: ");
        System.out.println("x = ");
        ToaDo toaDo = new ToaDo();
        toaDo.x = sc.nextInt();
        System.out.println("y = ");
        toaDo.y = sc.nextInt();
        ht3.setToaDo(toaDo);
        ht3.setToaDo(toaDo.x, toaDo.y);
        ht3.xuatBanKinh();
        ht3.xuatToaDo();
    }
}
}
