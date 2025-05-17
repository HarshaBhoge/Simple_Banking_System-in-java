import java.util.Scanner;


class bankAccount {
    
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // Here we need to define one constructor for further use in the console part
    bankAccount(String cName, String cID){
       customerName=cName;
       customerID=cID;
    }

    // 1st Functionality we will provide to user is "Deposite"
    // We know to if we want to deposite something in an our account the we want some "balance" & "previous balance in an account"

    //Let's create "deposite" method
    void deposite(int amount){
        if(amount!=0){
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    // 2nd Functionality we will provide to the user is "Withdraw"
    // for this we want "amount" which user will withdraw from their account
    void withdraw(int amount){
        if(amount!=0 && balance>=amount){
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }

    //3rd functionality : get previous transaction history
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("You have deposited "+ previousTransaction+" Rs in your account.");
        }
        else if(previousTransaction<0){
            System.out.println("You have withdrawn "+ -previousTransaction+" Rs from your account.");
        }
        else{
            System.out.println("No transaction history");
        }

    }

    // 4th functionality: show menu methodA
    // This method will done all the printing part in our console
    void showMenu(){
       
        char option= '\0'; // \0 represent null
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome "+ customerName+" to Bank System! ");
        System.out.println("Your ID is : "+customerID);
        System.out.println("====================================");
        System.out.println();

        System.out.println("Please select an option");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Get Previous Transaction");
        System.out.println("E. Exit");


       // here we will use do while loop so that user can execute all the options at once
       // there is no need to run the program again and again for diffrent functionalities
      do{
        System.out.println("====================================");
        System.out.println("Enter the option:");
        System.out.println("====================================");
        option=sc.next().charAt(0);
            // <<------------to resolve this error we used-------------->>.
            option=Character.toUpperCase(option); // this convert the input into uppercase


        switch (option) {

            // problem!! ----->>> here we are using capital letters for case ( A, B, C, D, E)
            // but switch case check the sky values so (a, b, c, d, e) have diff sky values than (A, B, C, D, E)
            // So, if user enter the small letters then program shows an error 

            

            case 'A':
            System.out.println("====================================");
            System.out.println("Your current balance is "+balance+" Rs");
            System.out.println("====================================");
            System.out.println();
                break;
            
            case 'B':
            System.out.println("====================================");
            System.out.println("Enter the amount you want to deposit:");
            System.out.println("====================================");
            int amount=sc.nextInt();
            deposite(amount);
            System.out.println();
            break;

            case 'C': 
            System.out.println("====================================");
            System.out.println("Enter the amount you want to withdraw:");
            System.out.println("====================================");
            int amountWithdraw=sc.nextInt();
            withdraw(amountWithdraw);
            System.out.println();
            break;

            case 'D': 
            System.out.println("====================================");
            System.out.println("Your previous transaction is:");
            getPreviousTransaction();
            System.out.println("====================================");
            System.out.println();
            System.out.println();
            break;

            case 'E' :
            System.out.println("====================================");
            System.out.println("Exit");
            System.out.println("Thank you for using our banking system");
            System.out.println("====================================");
            System.out.println();
            System.out.println();
            break;

            default:
            System.out.println("====================================");
            System.out.println("Invalid option, Please try again!");
            System.out.println("====================================");
            System.out.println();
            System.out.println();
                break;
        }
      }
      while (option!='E');
    }
}

public class bankSystem {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         bankAccount bank1=new bankAccount("XYZ", "01");
         bank1.showMenu();

         sc.close();
    }

}

 