import java.io.*;
class Bank
{
    private double balance=100000.0;
    private String password;
    char ch[];
    Console obj=System.console();
    public void deposit(long num,double money)
    {
        System.out.print("Enter the password: ");
        ch=obj.readPassword();
        String k=String.valueOf(ch);
        if(k.equals("Prakash123@"))
        {
            balance=balance+money;
            System.out.println("Your amount has been successfully deposited");
            System.out.println("Deposited Amount= "+money);
            System.out.println("Total Balance= "+balance);
            System.out.println();
            System.out.println("========================================");
            System.out.println();
            System.out.println("Thank you for using our service :) ");
        }
        else
        System.out.println("You have entered the wrong password");
    }
    public void withdraw(long num,double money)
    {
        System.out.print("Enter the password: ");
        ch=obj.readPassword();
        String k=String.valueOf(ch);
        if(k.equals("Prakash123@"))
        {
            if(money<=balance)
            {
                balance=balance-money;
                System.out.println("Your transaction is successful");
                System.out.println("Amount Withdrawn= "+money);
                System.out.println("Total Balance= "+balance);
                System.out.println();
                System.out.println("========================================");
                System.out.println();
                System.out.println("Thank you for using our service :) ");
            }
            else
            System.out.println("You don not have enough balance in your account");
        }
        else
        System.out.println("You have entered the wrong password");
    }
    public void checkbalance()
    {
        System.out.print("Enter the password: ");
        ch=obj.readPassword();
        String k=String.valueOf(ch);
        if(k.equals("Prakash123@"))
        {
            System.out.println("Total Balance= "+balance);
            System.out.println();
            System.out.println("========================================");
            System.out.println();
            System.out.println("Thank you for using our service :) ");
        }
        else
        System.out.println("You have entered the wrong password");
    }
    public void open(long number,String ty,String name,String username,long id,String address,String pass,double amount)
    {
        System.out.println();
        System.out.println("Welcome to the Bank");
        System.out.println();
        System.out.println("Your name= "+name);
        System.out.println("Account Number= "+number);
        System.out.println("Account type=" +ty);
        System.out.println("Your Username= "+username);
        System.out.println("Amount Deposited= "+amount);
        System.out.println();
        System.out.println("========================================");
        System.out.println();
        System.out.println("Thank you for using our service :) ");
    }
    public void type()
    {
        System.out.println();
        System.out.println("1. Current account");
        System.out.println("2. Savings account");
        System.out.println("3. Salary account");
        System.out.println("4. Fixed Deposit Account");
        System.out.println("5. Recurring Deposit Account");
        System.out.println("6. NRI Account");
        System.out.println("7. Foreign currency non-resident (FCNR) account");
        System.out.println();
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Bank b=new Bank();
        System.out.println("1. Open an account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Account Balance");
        System.out.println("5. Exit");
        int choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
            System.out.println("Enter Your Name");
            String n=br.readLine();
            System.out.print("Enter Account No: ");  
            long accno=Long.parseLong(br.readLine()); 
            b.type();
            System.out.print("Enter Account type: ");  
            String acc_type=br.readLine(); 
            System.out.println("Choose your username");
            String user=br.readLine();
            System.out.println("Enter Valid Identification Proof Number");
            long valid=Long.parseLong(br.readLine());
            System.out.println("Enter your address");
            String add=br.readLine();
            System.out.print("Choose a password: ");
            String a1=br.readLine();
            System.out.print("Re-enter the password: ");
            String a2=br.readLine();
            System.out.print("Enter the initial amount to be deposited: ");
            double am=Double.parseDouble(br.readLine());
            b.open(accno,acc_type,n,user,valid,add,a2,am);
            break;
            case 2:
            System.out.print("Enter account number: ");
            long num1=Long.parseLong(br.readLine());
            System.out.print("Enter the amount to be deposited: ");
            double m2=Double.parseDouble(br.readLine());
            b.deposit(num1,m2);
            break;
            case 3:
            System.out.print("Enter account number: ");
            long num2=Long.parseLong(br.readLine());
            System.out.print("Enter the amount to be withdrawn: ");
            double m3=Double.parseDouble(br.readLine());
            b.withdraw(num2,m3);
            break;
            case 4:
            b.checkbalance();
            break;
            case 5:
            System.exit(0);
            break;
            default:
            System.out.println("You have entered the wrong choice");
        }
    }
}