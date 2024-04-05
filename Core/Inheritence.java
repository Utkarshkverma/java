public class Inheritence {
    public static void main(String[] args) {
        
        A a = new B(10);

    }
}



class A extends Object{
   public A()
   {
    super();
    System.out.println("Inside A");

   }

   public A(int  i){
    super();
    System.out.println(i + " Inside A with parameter");
   }
}

class B extends A{
   public B()
   {
    super(); 
    System.out.println("Inside B");
   }

   public B(int n)
   {
    this();
    System.out.println("Inside p B");
   }
}
