public class Demo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run (){
                for(int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getId() + " value " + i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
}
