import javax.sound.midi.spi.SoundbankReader;

public class Main {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
        System.out.println(c1.x);
        System.out.println(c2.x);
        c1.printHi();


        Class2 cl2 = new Class2();
        System.out.println(cl2.y);
    }

}