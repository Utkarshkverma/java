public class This {
    public static void main(String[] args) {
         Human human = new Human();
         human.setName("Rishab");
         System.out.println(human.getName()); 
         human.setAge(30);
         System.out.println(human.getAge());  
         human.toString();

    }
}


class Human{
 private String name;
 private int age;

public String getName() {
    return name;
}
@Override
public String toString() {
    return "Human [name=" + name + ", age=" + age + "]";
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) 
{
    age = age;
}
}
 

