package weekone;

public class Driver {
    public static void main(String[] args) {

        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();
        // # 1. What are the reasons for using generics here?
        // To be able to use the same method but with different types

        // #2. What are the benefits?
        // - Stronger error checking at compile time. More bugs move to compile rater than runtime.
        // - less code repetition because the class is multi purpose

        Class<BankAccount> baCls = BankAccount.class;
        try {
            BankAccount myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);
// Deposit
            myAccount.deposit(15);
        } catch (InstantiationException e) {
// ...
        } catch (IllegalAccessException e) {
// ...
        }


        System.out.println(aStorage.getValue().showBalance());
        if (aStorage.getClass() == sStorage.getClass()) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
//
//    The compiler complains about incompatible types between the new instance of myAccount(an object) and BankAccount

}