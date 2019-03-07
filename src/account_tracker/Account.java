/*
    Jordan Davis
    jadavis7776@yahoo.com
    2/18/19
*/
package account_tracker;

public class Account {
    private String name;
    private int num, amt;
    
    public Account(int num, String name, int amt){
        this.num = num;
        this.name = name;
        this.amt = amt;
        
    }
    @Override
    public String toString(){
        return name + "/" + num + "/" + amt + "/";
    }
    
    
}//end Account class
