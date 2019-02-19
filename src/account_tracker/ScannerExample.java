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

public class ScannerExample {

    
    public static void main(String[] args) throws IOException {
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
                Writer wr = new FileWriter("Accounts.txt");
                for(Account a: accounts) {
                    System.out.println(a.toString());
                    wr.append(a.toString());
                    wr.append("\n");
                }
                wr.close();
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
    
    public static int getNum(){
        System.out.print("Input Account Number: ");
        Scanner s = new Scanner(System.in);
        Integer num = s.nextInt();
        return num;
    }//end getNum()
    
    
}//end ScannerExample class
