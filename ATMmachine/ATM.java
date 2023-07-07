package ATMmachine;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        while(true)
        {
            System.out.println("\n 1.Available balance \n 2.withdraw amount \n 3.deposit amount \n 4.view mini statement");
            int choice =s.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("check y balance");
                    break;
                case 2:
                    System.out.println("withdraw amount");
                    break;
                case 3:
                    System.out.println("deposit amount");
                    break;
                case 4:
                    System.out.println("view mini statement");
                    break;    
            }
        }
    }
}
