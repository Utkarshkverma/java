
public class Annotationns {
    public static void main(String[] args) {
        var b = new B();
        b.shows();
    }
}


class A{
     public void shows()
     {
        System.out.println("Inside A");
     }
}

class B extends A
{
    @Override
    public void shows()
    {
        System.out.println("Inside B");
    }
}

