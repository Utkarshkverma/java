public class RunnableInterface {
    public static void main(String[] args) {




        // Runnable Interface with anonmous inner class

        Runnable r3 = ()->{
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hey There");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        var thread3 = new Thread(r3);


        thread3.start();

    }
}


//class t1 implements  Runnable
//{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hii");
//            try {
//                Thread.sleep(2);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//}
//
//class t2 implements  Runnable
//{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(2);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//}
