public class hinhTron3 {
    public float r;
    public ToaDo toaDo; 
    

    public void setBanKinh(float r) {
        this.r = r;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public void setToaDo(int x, int y) {
        this.toaDo = new ToaDo(x, y); 
    }

    public void xuatBanKinh() {
        System.out.println("Ban kinh hinh tron " + this.r);
    }

    public void xuatToaDo() {
        System.out.println("Toa do hinh tron ");
        System.out.println("x = " + this.toaDo.x);
        System.out.println("y = " + this.toaDo.y);
    }
}
    

