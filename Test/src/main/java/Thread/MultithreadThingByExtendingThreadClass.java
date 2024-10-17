package Thread;

public class MultithreadThingByExtendingThreadClass extends Thread {

    private final int threadNumber;

    public MultithreadThingByExtendingThreadClass(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "  from thread " + threadNumber);
           /* if(threadNumber==3){
                throw new RuntimeException();
            }*/

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
