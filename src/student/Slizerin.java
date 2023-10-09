package student;

public class Slizerin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstPower;

    public Slizerin(int magicPower, int magicMove, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(magicPower, magicMove);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                ", magicPower=" + magicPower +
                ", magicMove=" + magicMove +
                '}';
    }
    public void compare (Slizerin slizerin) {
        int abilitySum1 = cunning + determination + ambition + resourcefulness + thirstPower;
        int abilitySum2 = getAmbition() + getCunning() + getDetermination() + getThirstPower() + getResourcefulness();
        if (abilitySum1 > abilitySum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else {
            System.out.println("Ученик 2 лучше чем ученик 1");
        }
    }
}
