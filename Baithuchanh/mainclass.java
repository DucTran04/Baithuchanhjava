public class mainclass {
    public static void main(String[] args) {
        hinhTron ht1 = new hinhTron();
        hinhTron ht2 = new hinhTron();
        ht1.NhapBK();
        System.out.println("Thong so hinh tron thu nhat: ");
        
        ht1.TinhCV();
        ht1.inCV();
        
        System.out.println("Thong so hinh tron thu hai: ");
        ht1.tinhDT();
        ht1.inDT();

    }
    
}
