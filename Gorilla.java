import java.util.Random;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

interface FeedingProcess {
    void putFoodInBowl();
    void insertBowlInCage();
    void startEating();
}

interface GroomingProcess {
    void addSoap();
    void lather();
    void rinse();
    void brushHair();
}

interface PettingProcess {
    void gentlePet();
    void roughPet();
    void observeReaction();
}

public class Gorilla implements Animal, FeedingProcess, GroomingProcess, PettingProcess {

    private Random random = new Random();
    private int strokeThresholdIrritation = 20;
    private int strokeThresholdBeastMode = 30; 

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            putFoodInBowl();
            insertBowlInCage();
            startEating();
            return true;
        } else {
            System.out.println("It's not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        addSoap();
        lather();
        rinse();
        brushHair();
    }

    @Override
    public void pet() {
        // pet at your own risk
        int strokes = random.nextInt(50) + 1;
        System.out.println("Number of strokes: " + strokes);
        if (strokes > strokeThresholdBeastMode) {
            System.out.println("Gorilla is in beast mode!");
        } else if (strokes > strokeThresholdIrritation) {
            System.out.println("Gorilla is irritated!");
        } else {
            gentlePet();
            observeReaction();
        }
    }

    @Override
    public void putFoodInBowl() {
        // put food in the bowl
        System.out.println("Putting gorilla food into the bowl.");
    }

    @Override
    public void insertBowlInCage() {
        // insert bowl in the cage
        System.out.println("Inserting the feeding bowl into the cage.");
    }

    @Override
    public void startEating() {
        // gorilla is now eating
        System.out.println("Gorilla is now eating.");
    }

    @Override
    public void addSoap() {
        // adding soap
        System.out.println("Adding soap to the gorilla's fur.");
    }

    @Override
    public void lather() {
        // lathering
        System.out.println("Lathering the gorilla.");
    }

    @Override
    public void rinse() {
        // rinsing
        System.out.println("Rinsing the gorilla.");
    }

    @Override
    public void brushHair() {
        // brushing hair
        System.out.println("Brushing the gorilla's hair.");
    }

    @Override
    public void gentlePet() {
        // gentle petting
        System.out.println("Gently petting the gorilla.");
    }

    @Override
    public void roughPet() {
        // rough petting
        System.out.println("Roughly petting the gorilla.");
    }

    @Override
    public void observeReaction() {
        System.out.println("Gorilla happy :)");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true); 
        gorilla.groom();    
        gorilla.pet();      
    }
}
