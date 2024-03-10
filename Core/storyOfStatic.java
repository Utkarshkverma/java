public class storyOfStatic{
public static void main(String[] args) {
    Mobile obj = new Mobile();
    //Mobile.brand = "Samsung";
    obj.price = 15000;
    obj.name = "Galaxy Fold 2";
   

    var pbj2 = new Mobile();
    //Mobile.brand = "Apple"; // ! Its a good practice to write static variable  with ClassName instead of ObjectName
    pbj2.price = 90000;
    pbj2.name = "Iphone 13 Pro Max";
    obj.show();
    pbj2.show();

    Mobile.show(obj);

    // ! Main method is declared static as we know that if we don't declare it as static then we need to create the objet for it and since main is the statrtin point of execution then it will lead to deadlock
  
}
}

class Mobile{
    static String brand; // ! common for all the objects
    int price;
    String name;
    
    static // ! No matter how many  times we create an object, it will execute only once
    {
        brand = "Apple";
        System.out.println("Inside the static block");
    }
    

    public Mobile()
    {
     System.out.println("Inside the constructor");
    }


    public void show()
    {
        System.out.println("Brand "+brand+ " price : "+price+" Name: "+name);
    }

    public static void show(Mobile obj)
    {
        System.out.println("Inside the static method");
        System.out.println("Brand "+brand+ " price : "+obj.price+" Name: "+obj.name);
    }
}