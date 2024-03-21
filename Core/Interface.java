public class Interface {
    public static void main(String[] args) {
        var cc = new MyClass();
        cc.method();
   
        System.out.println(interfaceA.age);
    }
}

interface interfaceA {
    int age = 45;
    String name = "John";
    // ~ All the variable inside  an interface are by default public, final and static
    void method();
}

interface InterfaceB {
    void method();
}

class MyClass implements interfaceA, InterfaceB {
    public void method() {
        System.out.println("Method implementation in MyClass");
    }
}


   
    

