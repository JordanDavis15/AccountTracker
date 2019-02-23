/*
    Jordan Davis
    jadavis7776@yahoo.com
    2/18/19
*/

package account_tracker;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountMain {

    
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        //execute till stop is entered
        boolean isRunning = true;
        while(isRunning){

            //adding an account
            System.out.print("Add new account(1), Display customers/write to file(2):  ");
            
            Integer addAcc = s.nextInt();
            if(addAcc == 1){
                accounts.add(new Account(getName(), getNum()));
            }

            //print current customers
            else if(addAcc == 2){
                for(Account a: accounts) {
                    //System.out.println(a.toString());
                    writeToFile(accounts);
                }
            }
        
            System.out.println("Proceed again, yes(1), no(2):  ");
            Integer isRunningConvertToBool = s.nextInt();
            if(isRunningConvertToBool == 2){
                isRunning = false;
            }
        }
    }//end main
    
    
    //returns inputed name(from console)
    public static String getName(){
        System.out.print("Input Name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        return name;
    }//end getName()
    
    //returns inputed number(from console)
    public static int getNum(){
        System.out.print("Input Account Number: ");
        Scanner s = new Scanner(System.in);
        Integer num = s.nextInt();
        return num;
    }//end getNum()
    
    //writes content of arraylist to file
    public static void writeToFile(ArrayList<Account> accArrList) throws IOException{
        if(accArrList != null){
            Writer wr = new FileWriter("Accounts.txt");
            for(Account a: accArrList){
                wr.append(a.toString());
                wr.append("\n");
            }
            wr.close();
        }
    }//end writeToFile()
    
    
    
    
}//end AccountMain class
