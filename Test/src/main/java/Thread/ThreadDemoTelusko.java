package Thread;

public class ThreadDemoTelusko {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Hi" + Thread.currentThread().getPriority());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }, "Hi Thread"
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Hello");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }, "Hello Thread"
        );

       /* t1.setName("Hi Thread");
        t2.setName("Hello Thread");*/

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        /*System.out.println(t1.getName());
        System.out.println(t2.getName());*/

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("Bye");
    }
}
