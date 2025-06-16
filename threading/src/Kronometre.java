public class Kronometre implements  Runnable{
    private  Thread thread;
    private  String threadName;
    public  Kronometre (String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }
    @Override
    public void run() {
        System.out.println("çalıştırılıyor"+threadName);

            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(threadName + ": " + i);
                    Thread.sleep(1000);
                }
            }
                catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            System.out.println("Thread bitti"+threadName);
    }
    public  void  start(){
        System.out.println("thread nesnesi oluşuyor");
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
