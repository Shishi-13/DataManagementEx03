import java.util.Random;
public class DiceGame{
  public static void main(String[] args){
    System.out.println("Dice rolling...");

    Random r = new Random();

    for(int i=1;i<3;i++){
      int dice=r.nextInt(6)+1;
      System.out.print("Dice " + i + ": " + dice);
      System.out.println();
  }
}
