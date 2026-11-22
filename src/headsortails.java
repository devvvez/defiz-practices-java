import java.util.Random;

public class headsortails {
    static void main(String[] args) {
        Random randomizer = new Random();

        boolean isTails;

        isTails = randomizer.nextBoolean();

        if(isTails){
            System.out.println("TAILS");
        }
        else{
            System.out.println("HEADS");
        }

    }
}
