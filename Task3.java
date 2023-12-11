import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        String da = null;
        int bal = 0, damt = 0, wamt = 0, tamt = 0, ch;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter user ID : ");
        String id = sr.next();
        System.out.print("Enter user pin : ");
        String pin = sr.next();
        do
        {
            System.out.print("1. Transaction history\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Exit\n");
            System.out.print("Enter your choice : ");
            ch = sr.nextInt();
            switch(ch)
            {
                case 1:
                    if(da == null && damt == 0 && wamt == 0 && tamt == 0)
                        System.out.print("There is no transaction history");
                    else
                    {
                        System.out.println("The amount deposited = " + damt);
                        System.out.println("The amount withdrawed = " + wamt);
                        System.out.println("The amount transfered = " + tamt);
                        System.out.println("Bank balance = " + bal);
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to be deposited : ");
                    damt = sr.nextInt();
                    System.out.println(damt + " is Successfully deposited into " + id + "'s account");
                    bal = bal + damt;
                    System.out.println("Bank balance = " + bal);
                    break;
                case 3:
                    System.out.print("Enter amount for withdrawal : ");
                    wamt = sr.nextInt();
                    if(bal < wamt)
                        System.out.println("There is no sufficient balance in your account");
                    else
                    {
                        System.out.println("Successfully withdrawed "+ wamt + " from " + id + "'s account");
                        bal = bal - wamt;
                        System.out.println("Bank balance = " + bal);
                    }
                    break;
                case 4:
                    System.out.print("Enter the account number to be transferred : ");
                    da = sr.next();
                    System.out.print("Enter the amount to be transfered : ");
                    tamt = sr.nextInt();
                    if(bal < tamt)
                        System.out.println("There is no sufficient balance in your account");
                    else
                    {
                        System.out.println("Successfully the amount is transferred to the account " + da);
                        bal = bal - tamt;
                        System.out.println("Bank balance = " + bal);
                    }
                    break;
                case 5:
                    break;

            }
        }while(ch != 5);
    }
}
