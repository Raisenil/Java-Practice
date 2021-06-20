import java.util.Scanner;

public class Product {
    private String ProductTag;
    private String milk="";
    private int balance=0;
    private static int milkprice=50;
    private static int tag = 20200 ;
    private int grade;

    public Product(){
        Scanner in= new Scanner(System.in);
        System.out.print("1  -Strong\n2 - Healthy\n3- Average\n4 - Sick\nEnter student class level: ");
        this.grade=in.nextInt();
        setproTag();
    }
    private void setproTag (){
        tag++;
        this.ProductTag=grade+" "+tag;
    }
    public void income(){
        do {
            System.out.print("Enter amount to Calculate (Q to Quit)");
            Scanner in = new Scanner(System.in);
            int cost = in.nextInt();
            if (cost!=1){
                cost =  cost+ cost;
                balance= balance+ milkprice;
            }
            else {
                break;
            }
        }while(2!=0);
    }
    public void viewBalance(){

        System.out.println("Your balance is: BDT "+ balance);
    }
    public void dailycost(){
        viewBalance();
        System.out.print("Enter your todays cost: BDT ");
        Scanner in =new Scanner(System.in);
        int cost= in.nextInt();
        balance= balance - cost;
        viewBalance();
    }
    public String toString(){
        return
                "Grade Level: "+ grade +
                        "\nProduct Tag: "+ProductTag+
                        "\nBalance: BDT " +balance;
    }
}

