public class ThreadPriority {
    public static void main(String[] args) {
       var a = new Aaa();
       var b = new Bbb();
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        a.start();
        b.start();

        a.setPriority(9);
        b.setPriority(8);
        a.start();
        b.start();
    }
}


class Aaa extends Thread
{
    public void run()
    {
        for(int i = 0 ;i<10;i++)
        {
            System.out.println(i + "A");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Bbb extends Thread
{
    public void run()
    {
        for(int i = 0 ;i<10;i++)
        {
            System.out.println(i + "B");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
