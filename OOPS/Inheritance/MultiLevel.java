class Bank{
    void bankName(){
        System.out.println("Bank: SBI");
    }
}
class Customer extends Bank{
    void customerName(){
        System.out.println("Customer Name: Aravind");
    }
}
class Account extends Customer{
    void accountType(){
        System.out.println("Account Type: General Account");
    }
}
class SavingsAccount extends Account{
    void interest(){
        System.out.println("Interest: 5%");
    }
}

public class MultiLevel{
    public static void main(String args[]){
        SavingsAccount s = new SavingsAccount();

        s.bankName();
        s.customerName();
        s.accountType();
        s.interest();
    }
}