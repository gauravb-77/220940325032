import java.util.Scanner;
class BankAccount{
    int accno;
    double balance;
    Scanner sc=new Scanner(System.in);

    BankAccount(int accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }

    void withDraw() throws Exception{
        double amount;
        System.out.print("Enter withdraw amount: ");
        amount=sc.nextDouble();
        if (balance>=amount){
            balance-=amount;
            //System.out.println("Your remaining balance is: "+balance);
            show();
        }
        else{
            throw new Exception("Your balance is not sufficient");
        }
    }

    void deposit(){
        double amount;
        System.out.print("Enter deposit amount: ");
        amount=sc.nextDouble();
        if(amount>=0){
            balance+=amount;
            //System.out.println("Your balance is: "+balance);
            show();
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    void show(){
        System.out.println("Account number is: "+accno+" \nBalance is: "+balance);
    }
}

public class BankAccQues {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(7894500, 1000);
        ba.show();
        ba.deposit();
        try{
            ba.withDraw();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
