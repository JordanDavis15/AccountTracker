package scannerexample;

public class Account {
    private String name;
    private int num;
    
    public Account(String name, int num){
        this.name = name;
        this.num = num;
    }
    @Override
    public String toString(){
        return name + "\t|\t" + num;
    }
    
    
}//end Account class
