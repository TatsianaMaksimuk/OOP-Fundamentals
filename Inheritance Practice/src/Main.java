public class Main {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();

        m1.leftClick();
        m1.scrolledDown();
        m1.rightClick();

        m2.connect();
    }
}