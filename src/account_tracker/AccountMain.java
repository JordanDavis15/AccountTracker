/*
    Jordan Davis
    jadavis7776@yahoo.com
    2/18/19
*/

package account_tracker;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountMain {

    private static ArrayList<Account> accounts = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        //populates accounts with initial ammounts
        populateAccountsArrayList();
        
        Scanner s = new Scanner(System.in);
        
        //execute till stop is entered
        boolean isRunning = true;
        while(isRunning){

            //adding an account
            System.out.print("Add new account(1), Display customers/write to file(2):  ");
            
            Integer addAcc = s.nextInt();
            if(addAcc == 1){
                accounts.add(new Account(getNum(),getName()));
            }

            //print current customers
            else if(addAcc == 2){
                displayAccounts(); 
                writeToFile(accounts);
                
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
            for(int i = 0; i < accounts.size(); i++){
                wr.write(accounts.get(i).toString());
                if(i < accounts.size()-1){
                    wr.append("\n");
                }
            }
            wr.close();
        }
    }//end writeToFile()
    
    public static void populateAccountsArrayList() throws IOException{
        Path path = Paths.get("Accounts.txt");
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter("/");
        ArrayList<String> accName = new ArrayList<>();
        ArrayList<Integer> accNum = new ArrayList<>();
        //read line by line
        while(scanner.hasNext()){
            Integer numInt = Integer.parseInt(numStr);
            accNum.add(numInt);
	    accName.add(scanner.next().trim());
            String numStr = scanner.next();
            
        }
        scanner.close();
        for(Integer i = 0; i < accName.size(); i++){
            accounts.add(new Account( accNum.get(i),accName.get(i)));
        }

    }
    
    public static void displayAccounts(){
        for(Account a: accounts){
            System.out.println(a.toString());
        }
        System.out.println("");
    }
    
    
    
}//end AccountMain class
