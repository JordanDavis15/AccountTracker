
package scannerexample;

import java.util.ArrayList;
import java.util.Scanner;


public class ScannerExample {

    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        //execute till stop is entered
        boolean isRunning = true;
        while(isRunning){
            
            

            //adding an account
            System.out.print("Add new account(1), see current customers(2):  ");
            
            Integer addAcc = s.nextInt();
            if(addAcc == 1){
                accounts.add(new Account(getName(), getNum()));
            }

            //print current customers
            else if(addAcc == 2){
                accounts.forEach((a) -> {
                    System.out.println(a.toString());
                });
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
    }
    
    public static int getNum(){
        System.out.print("Input Account Number: ");
        Scanner s = new Scanner(System.in);
        Integer num = s.nextInt();
        return num;
    }
    
    
    
}//end ScannerExample class
