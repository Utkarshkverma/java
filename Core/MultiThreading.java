
public class MultiThreading
{
    public static void main(String[] args) {
        var a = new A();
        var b = new B();

        a.start();
        b.start();
        
    }
}


class A extends Thread
{
    public void run()
    {
       for(int i = 0 ;i<100;i++)
       {
        System.out.println(i + "A");
       }
    }
}

class B extends Thread
{
    public void run()
    {
       for(int i = 0 ;i<100;i++)
       {
        System.out.println(i + "A");
       }
    }
}