package student;

public class Pufunduy extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;
    public Pufunduy(int magicPower,int magicMove,int hardworking,int loyal,int honest){
        super(magicPower,magicMove);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Pufunduy{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", magicPower=" + magicPower +
                ", magicMove=" + magicMove +
                '}';
    }

    public void compare (Pufunduy pufunduy) {
        int abilitySum1 = hardworking + loyal + honest;
        int abilitySum2 = pufunduy.getHardworking() + pufunduy.getLoyal() + pufunduy.getHonest();
        if (abilitySum1 > abilitySum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else {
            System.out.println("Ученик 2 лучше чем ученик 1");
        }
    }
}
