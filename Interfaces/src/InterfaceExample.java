interface WaterBottleInterface{
String color = "Blue";
String shape = "Round";
void fillUp();
void pourOut();
        }

public class InterfaceExample implements WaterBottleInterface{

    @Override
    public void fillUp() {
        System.out.println("It's filled");
    }

    @Override
    public void pourOut() {

    }
}

