import java.util.Random;
public class DiceGame{
  public static void main(String[] args){
    System.out.println("Dice rolling...");

    Random r = new Random();
    int t=0;

    for(int i=1;i<3;i++){
      int dice=r.nextInt(6)+1;
      System.out.println("Dice " + i + ": " + dice);
      t+=dice;
    }
    System.out.println("total: " + t);

    if(t>7){
      System.out.println("You won");
    }else{
      System.out.println("You lost");
    }
}
