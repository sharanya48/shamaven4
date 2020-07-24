abstract class Bank{
    abstract void balance();
    abstract void rateofinterest();
    void thanks(){
        System.out.println("thanks for using our bank");
    }
}
class Sbi extends Bank{
    void balance(){
        System.out.println("Balance: 1000");
    }
    void rateofinterest(){
        System.out.println("Rate of interest is 2 % ");
    }
}
class Axis extends Bank{
    void balance(){
        System.out.println("Balance: 50000");
    }
    void rateofinterest(){
        System.out.println("Rate of interest is 9 % ");
    }
}
public class Demo{
    public static void main(String args[]){
        Bank a;
        a=new Sbi();
        a.balance();
        a.rateofinterest();
        a.thanks();
        a=new Axis();
        a.balance();
        a.rateofinterest();
        a.thanks();
    }
}