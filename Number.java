package Practice100;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        
    

try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Number:");
    float n = sc.nextFloat();
    
    if(n>0){
        System.out.println("Number is Positive");
    }
    else if(n==0){
        System.out.println("Number is zero");
    }else{
        System.out.println("Number is negative");
    }
}
}
}
