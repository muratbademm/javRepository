public class Main {
    public static void main(String[] args)  {
        AccountManager accountManager=new AccountManager();
        System.out.println("hesap: "+accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println(accountManager.getBalance());
        try {
            accountManager.withdraw(10);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        accountManager.deposit(140);

        System.out.println(accountManager.getBalance());
        try {
            accountManager.withdraw(300);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(accountManager.getBalance());

    }

}