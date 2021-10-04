import java.lang.*;
public class main {
    public static void main (String[] args) {
        Ball b1 = new Ball (4,"Blue");
        Ball b2 = new Ball (7,"Green");
        Ball b3 = new Ball (5);
        b3.setColor("Red");
        System.out.println(b2);
        System.out.println(b1.Obyem());
        System.out.println(b2.Obyem());
        System.out.println(b3.Obyem());
    }
}
