package entities;

public class fixacao {
    private int accountCode;
    public String name;
    public double balance;

    public int getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(int accountCode) {
        this.accountCode = accountCode;
    }

    public void depositValue(double value){
        balance += value;
    }

    public void withdrawValue(double value){
        balance -= (value + 5.00);
    }

    public String toString(){
        return "Updated account data:"
                + getAccountCode()
                + ", holder: "
                + name + ", balance: $ "
                + balance;
    }
}
