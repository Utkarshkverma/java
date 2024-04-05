public class RunnableInterface {
    public static void main(String[] args) {

        Runnable r1 = new t1();
        Runnable r2 = new t2();

        var thread1 = new Thread(r1);
        var thread2 = new Thread(r2);

        r1.run();
        r2.run();

    }
}


class t1 implements  Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class t2 implements  Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
