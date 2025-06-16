public class Main {
    public static void main(String[] args)
    {
        //EmailLogger emailLogger=new EmailLogger();
        //emailLogger.Log("log mesajı");
       // DatabaseLogger databaseLogger = new DatabaseLogger();
//        BaseLogger [] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(), new ConsoleLog()};
//        // tüm diziye girdiklerimiz baseloggerdan miras aldıkları için dizi gibi kabul ediyor
//        for (BaseLogger logger:loggers){
//            logger.Log("Log Mesajı");
//        }
        //buna polimorfizm deniyor
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}