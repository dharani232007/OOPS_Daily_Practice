public class BankAccount {
    private int balance;

    BankAccount(int x){
        balance = x;
    }

    void deposite(int x){
        if(x <=0){
            System.out.println("Cannot be deposite");
        }
        System.out.println("Deposite Successfully");
        this.balance += x;
        System.out.println("Total Balance "+this.balance);

    }

    void withdraw(int x){
        if(this.balance < x){
            System.out.println("Cannot Withdraw your ammount, Reduce the amount price");

        }
        else{
            System.out.println("Withdraw succesfully");
            this.balance -= x;
            System.out.println("Total Balance: "+ this.balance);
        }
    }

    void checkBalance(){
        if(this.balance <0){
            System.out.println("Invalid Balance");
        }
        else{
            System.out.println("Total balance : "+ this.balance);
        }
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount(1000);
        b1.deposite(500);
        b1.withdraw(900);
        b1.checkBalance();
    }

    
}
