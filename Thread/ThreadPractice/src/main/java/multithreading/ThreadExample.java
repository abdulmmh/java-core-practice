package multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadBYClass tByC = new ThreadBYClass();
        tByC.run();

        ThreadByInterface tByI = new ThreadByInterface();
        tByI.run();
    }
}

class ThreadBYClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }
}

class ThreadByInterface implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface!");
        }
    }
}