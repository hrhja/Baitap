package BAI25;

public class TEST {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "John Doe",'M');
        System.out.println(customer1);
        Account account1 = new Account(1001, customer1, 500.0);
        System.out.println(account1);
        account1.deposit(200.0);
        System.out.println(account1);
        account1.withdraw(100.0);
        System.out.println(account1);
        account1.withdraw(700.0);
        System.out.println(account1);
    }
}


