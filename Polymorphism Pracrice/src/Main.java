class Bird {
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("twiddle twiddle");
    }
}

class Raven extends Bird{
    public void sing(String song){ //should be exact method with exact parameters.
        System.out.println("car car");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.sing();

        Robin robin1 = new Robin();
        robin1.sing();

        Raven raven1 = new Raven();
        raven1.sing(); //were calling method sing of bird, with no parameters, so it will be tweet instead of car

    }
}