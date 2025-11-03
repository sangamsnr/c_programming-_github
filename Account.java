package secondproject.java;

public class Account {
    //instance variable
    String acc_name;
    String acc_type;
    double balance;

    public Account(String acc_name, String acc_type, double balance) {
        this.acc_name = acc_name;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public double balanceEnquiry() {
        return this.balance;
    }

    public void deposit(double amt){
        this.balance +=amt;
        System.out.println("Deposite successfull:New balance:"+ balanceEnquiry());
    }

        public void withdraw(double amt){
            if(amt>this.balance) {
                System.out.println("Sorry Insufficient balance");
            }else{
                    this.balance -= amt;
                    System.out.println("Withdraw successfull: "+balanceEnquiry()) ;

            }
        }
    
}
