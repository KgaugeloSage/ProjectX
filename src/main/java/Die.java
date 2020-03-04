import java.util.ArrayList;
import java.util.Random;

public class Die {
    private int sides;
    private int[] probabilities;
    private ArrayList<Integer> values = new ArrayList<>();

    Die(int sides) {
        this.sides = sides;
    }
    Die(int sides, int... probabilities) {
        this.sides = sides;
        this.probabilities = probabilities;
        setProbabilities(probabilities);
    }
    void setProbabilities(int... probabilities) {
        for (int i = 1; i < (sides); ++i) {
            for (int j = 0; j < probabilities[i]; ++j) {
                values.add(i);
            }
        }
    }
    void roll() {
        Random randomIndex = new Random();
        int indexRolled = randomIndex.nextInt(sides);
        for (int i = 1; i < (sides + 1); ++i) {
            values.add(i);
        }
        System.out.println(values.get(indexRolled));
    }
    void print(){
        System.out.println(values);
    }
}
