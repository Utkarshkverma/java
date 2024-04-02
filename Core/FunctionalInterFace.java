public class FunctionalInterFace {
    public static void main(String[] args) {
        B obj  =  new B();
        obj.show();
    }
}

@FunctionalInterface
interface A{
  void show();
}

class B implements A
{

    @Override
    public void show() {
        
       System.out.println("Hello world");
    }
  
}
