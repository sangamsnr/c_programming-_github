import org.w3c.dom.ls.LSOutput;

public class Account {

        String accountNumber;
        String accountName;
        double balance;

        public Account(String accountNumber, String accountName, double balance) {
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.balance = balance;
        }


        double balanceEnquiry() {
            return this.balance;
        }

        public void deposit(double amount) {
            this.balance+=amount;
            System.out.println("deposit is sucessful:new balance is " + this.balance);
        }
        public void withdraw(double amount) {
            if(amount > this.balance) {
                System.out.println("balance insufficent");
            }
            else{
                balance-=amount;
                System.out.println("withdraw sucessful:new balance is " + balanceEnquiry());
            }
        }

          public static void main(String[] args) {
            // create and object of  account
              


          }
    }









