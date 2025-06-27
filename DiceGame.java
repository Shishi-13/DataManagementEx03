import java.util.Random;
import java.util.Scanner;

public class DiceGame{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String name=scanner.nextLine();
    System.out.println("Hello, " + name + "!");
    System.out.println("Dice rolling...");

    Random r = new Random();
    int t=0;

    for(int i=1;i<3;i++){
      int dice=r.nextInt(6)+1;
      System.out.println("Dice " + i + ": " + dice);
      t+=dice;
    }
    System.out.println("total: " + t);
    scan.close();
}
