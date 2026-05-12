import java.util.Scanner;
public class ATM {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Long balance=10000L;
        int pin = 6633; 
        System.out.println("Welcome! Please enter your pin to access your account:");
        int userPin = sc.nextInt();
        if(userPin == pin){
            System.out.println("Access granted! Your current balance is: " + balance);
            System.out.println("Enter amount to withdraw:");


        Long withdraw = sc.nextLong();
        if(withdraw <= balance){
            balance -= withdraw;
            System.out.println("Withdrawal successful! Your new balance is: " + balance);
        } 
        else {
            System.out.println("Insufficient funds! Your current balance is: " + balance);
        }
        } 
        else {
            System.out.println("Access denied! Incorrect pin.");
        }
        sc.close();
    }
}
