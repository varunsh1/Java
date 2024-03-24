class Cellphone{
    void ringing(){
        System.out.println("Ringing......");
    }
    void vibrating(){
        System.out.println("Vibrating.....");
    }
}
public class Practice2 {
    public static void main(String[] args) {
    Cellphone obj =  new Cellphone();
    obj.ringing();
    obj.vibrating();
    }
}
