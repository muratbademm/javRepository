public class AccountManager {
   private double balance;
    public void deposit(double amount){
        balance=balance + amount;
    }
    public  void  withdraw (double amount) throws BalanceInsufficentException {
       if (balance>=amount){
           balance=balance - amount;
       }
       else {
           throw  new BalanceInsufficentException("bakiye yetersiz");
       }

    }

    public double getBalance() {
        return balance; //hesaptaki parayı okumamızı sağlıyor
    }


//    public double getBalance(double balance){
//        return balance;
//    }
}
