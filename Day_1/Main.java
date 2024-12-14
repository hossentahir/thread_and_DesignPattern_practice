class MyClass extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value " + i);
            
        }

        try {
            Thread.sleep(0 );  // Sleep for 100 milliseconds after each print
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        

        t1.start();
        MyClass t2 = new MyClass();
        t2.start();
    }
}
