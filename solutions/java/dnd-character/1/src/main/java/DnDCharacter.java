import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
class DnDCharacter {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public DnDCharacter () {
        this.strength = configureAbility();
        this.dexterity = configureAbility();
        this.constitution = configureAbility();
        this.intelligence = configureAbility();
        this.wisdom = configureAbility();
        this.charisma = configureAbility();
    }

    private int configureAbility () {
        List<Integer> roll = rollDice();
        return ability(roll);
    }
    
    int ability(List<Integer> scores) {
        int sum = 0;
        List<Integer> mutableScores = new ArrayList<>(scores);
        mutableScores.sort((a, b) -> Integer.compare(a, b));
        for (int i = 1; i < mutableScores.size(); i++) {
            sum += mutableScores.get(i);
        }
        return sum;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
    }

    List<Integer> rollDice() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Random rand = new Random();
        List<Integer> randomNumLs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int randomInt = rand.nextInt(6) + 1;
            randomNumLs.add(randomInt);
        }
        return randomNumLs;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getStrength() {
        System.out.println(strength);
        return strength;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getDexterity() {
        return dexterity;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getConstitution() {
        return constitution;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getIntelligence() {
        return intelligence;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getWisdom() {
        return wisdom;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getCharisma() {
        return charisma;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
