public class Main {
    public static void main(String[] args)
    {
        Kronometre kronometre1=new Kronometre("thread1");
        Kronometre kronometre2=new Kronometre("thread2");
        Kronometre kronometre3=new Kronometre("thread3");

        kronometre1.start();
        kronometre2.start();
        kronometre3.start();

    }
}