package pRajwals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ATMOperationInterfaces op= new ATMOperationImp();
        int atmNumber=1234567;
        int atmPin=1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SBI ATM Machine!!!");
        System.out.println("Enter ATM Number");
        int atmNum=sc.nextInt();
        System.out.println("Enter ATM Pin");
        int atmP=sc.nextInt();
        if((atmNumber==atmNum)&&(atmPin==atmP)){
            while (true){
                System.out.println("1.View Balance\n2.WithDraw Amount\n3.Deposit Amount\n5.View MiniStatement\n5.Exit");
                System.out.println("Enter You Choice: ");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter Amount to Withdraw");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("Enter Amount to Deposit");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.viewMiniStatement();
                } else if (ch==5) {
                    System.out.println("Collect Your ATM Card\nThanks For Using Atm Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}
