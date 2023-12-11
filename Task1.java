import java.util.*;
class Main {
    public static void main(String[] args) {
        int ch, pnr=0, pnr1=0;
       String tno = null, tname = null, ct = null, date = null, sp = null, dp = null;
        Scanner sr = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter Login ID : ");
        String id = sr.nextLine();
        System.out.print("Enter password : ");
        String pw = sr.nextLine();
        do
        {
            System.out.print("1. Registration form\n2. Cancellation form\n3. exit\n");
            System.out.print("Enter your choice : ");
            ch = sr.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Train number : ");
                    tno = sr.next();
                   System.out.print("Enter Train name : ");
                    tname = sr.next();
                    System.out.print("Enter class type : ");
                    ct = sr.next();
                    System.out.print("Enter date of journey : ");
                    date = sr.next();
                    System.out.print("Enter Source place : ");
                    sp = sr.next();
                    System.out.print("Enter destination place : ");
                    dp = sr.next();
                    System.out.print("Type insert to get registered : ");
                    String s1 = sr.next();
                    if(s1.equals("insert"))
                        System.out.println("Successfully Registered");
                    pnr = rand.nextInt(10);
                    System.out.println("Your PNR number is = " + pnr);
                    break;
                case 2:
                    System.out.print("Enter your PNR number : ");
                    pnr1 = sr.nextInt();
                    if(pnr1 == pnr)
                    {
                        System.out.println("Train Number : " + tno);
                        System.out.println("Train name : "+ tname);
                        System.out.println("Class type : "+ ct);
                        System.out.println("date of journey : " + date);
                        System.out.println("Source place : " + sp);
                        System.out.println("Destination place : " + dp);
                        System.out.println("Susccessfully Cancelled");
                    }
                    else
                        System.out.println("Invalid PNR number");
                    break;
                case 3:
                    System.out.println("Successfully Exited");
                    break;
            }
        }while(ch != 3);
    }
}
