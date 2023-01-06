public class Student {
    private String name;

    private int age;

    public void setName(String newName){
        name = newName; //we don't have to do this.name because we're passing newName as argument
    }
    public String getName(){
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) { //we have to do this. age, as age is our parameter
        this.age = age;
    }

}
