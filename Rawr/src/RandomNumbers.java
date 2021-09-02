import java.util.Random;

public class RandomNumbers {

    public static int randomNumbers() {
      
        Random random = new Random();
        
        int x = random.nextInt(100)+1;

        return x;
       
    }

}
