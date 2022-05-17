package com.ATM;
import java.util.*;

public class ATM {
    public static void  main(String[] args) {

        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = sc.nextInt();
        if(password == pin)
        {
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Welcome "+name);
            while(true)
            {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to print receipt");
                System.out.println("Press 5 to Exit");
                int opt = sc.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("Your current balance is "+balance);
                        break;
                    case 2:
                        System.out.println("How much amount do you want to add?");
                        AddAmount = sc.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount+balance;
                        break;
                    case 3:
                        System.out.println("How much amount do you want to take");
                        TakeAmount= sc.nextInt();
                        if(balance<TakeAmount)
                        {
                            System.out.println("Your balance is insufficient");
                        }
                        else {
                            System.out.println("Amount withdrawn: " + TakeAmount);
                            balance = balance-TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one ATM");                                System.out.println("Your current balance is "+balance);
                        System.out.println("Your current balance is "+balance);
                        System.out.println("Amount deposited "+AddAmount);
                        System.out.println("Your current balance is "+TakeAmount);
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Press 5 ");
                        break;

                }
                if(opt == 5)
                {
                    System.out.println( "Thank you" );
                    break;
                }

            }

        } else {
            System.out.println( "Wrong Pin" );
        }

    }
}

