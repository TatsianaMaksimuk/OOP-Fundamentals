public class Golden extends Dog{

    public String name;

    public Golden(String name, int age, String sex, boolean isAdopted) {
        super(age,sex,isAdopted);
        this.name = name;

    }

    @Override
    public void eat() {
        System.out.println("Golden Retriever eats");
    }
}
