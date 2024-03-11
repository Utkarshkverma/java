public class Encapsulation {
    public static void main(String[] args) {
        var human = new Human("Utkarsh",22,175,65);
        System.out.println(human.toString());
        human.setName( "Rishab");
        System.out.println(human.getName());
        System.out.println(human.toString());
    }
}

class Human
{
    private String Name;
    private  int Age;  
    int height;
    int weight;
    public Human() {
    }
    @Override
    public String toString() {
        return "Human [Name=" + Name + ", Age=" + Age + ", height=" + height + ", weight=" + weight + "]";
    }
    public Human(String name, int age,int d, int weight) {
        Name = name;
        Age = age;
        this.height = d;
        this.weight = weight;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }


}
