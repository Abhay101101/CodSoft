package CodSoft;

import java.util.Scanner;

public class ATM {
    private int account;
    // int amount;
    private Scanner sc;

    public ATM(){
        account=0;
        sc=new Scanner(System.in);
    }

    public void deposit(){
        System.out.print("Enter the deposit amount:");
        int deposit=sc.nextInt();
        if(deposit>0){
            account+=deposit;
            System.out.println("Amount deposited successfully...");
        }else{
            System.out.println("Invalid deposit amount, please enter a valid deposit amount!");
        }
    }


    public void withdrawal(){
        System.out.print("Enter the withdrawal amount: ");
        int withdraw=sc.nextInt();
        if(withdraw<=account && withdraw>0){
            account-=withdraw;
            System.out.println("Amount withdrawn successfully...");
        }else if(withdraw<0){
            System.out.println("Invalid withdrawn amount, enter a valid amount!");
        }else if(withdraw>account){
            System.out.println("Your account does not have sufficient balance..");
        }
    }

    public int checkBalance(){
        return account;
    }
    public static void main(String[] args) {
        ATM atm=new ATM();
        Scanner input=new Scanner(System.in);
        int choice;

        do{
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Balance Info");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice=input.nextInt();

            switch(choice){
                case 1:
                atm.deposit();
                break;

                case 2:
                atm.withdrawal();
                break;
                
                case 3:
                System.out.println("Your Account balance is:"+ atm.checkBalance());
                break;

                case 4:
                System.out.println("Thank you for using the ATM.");
            }
        }while(choice!=4);
        input.close();

    }
    
}
