public class FunctionalInterFace {
    public static void main(String[] args) {
        A obj  =  new B();
        obj.show();

        A objs = new A()
        {

            @Override
            public void show() {
                // TODO Auto-generated method stub
               System.out.println("Show");
            }
            
        };

        objs.show();
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
