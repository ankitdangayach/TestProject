package Thread;

public class Multithreading {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            /*Thread.MultithreadThingByExtendingThreadClass obj = new Thread.MultithreadThingByExtendingThreadClass(i);
            obj.start();*/

            MultithreadThingByImplRunnableInterface obj = new MultithreadThingByImplRunnableInterface(i);
            Thread thread = new Thread(obj);
            thread.start();
            /*boolean isAlive = thread.isAlive();
            System.out.println(isAlive);*/
           /* try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }

        /*throw new RuntimeException();*/
      /*  MultithreadThing obj = new MultithreadThing();
        MultithreadThing obj2 = new MultithreadThing();
        *//*obj.run();
        obj2.run();*//*
        obj.start();
        obj2.start();*/
    }
}
