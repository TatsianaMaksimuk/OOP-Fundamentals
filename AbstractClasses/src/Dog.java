public abstract class Dog {

    int age;
    String sex;
    boolean isAdopted;

    public Dog(int age, String sex, boolean isAdopted) {
        this.age = age;
        this.sex = sex;
        this.isAdopted = isAdopted;
    }

    public void bark(){
        System.out.println("Bark");
    };

     public abstract void eat();
}
