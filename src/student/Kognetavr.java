package student;

public class Kognetavr extends Hogwarts {

    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Kognetavr(int magicPower, int magicMove, int smart, int wise, int witty, int creativity) {
        super(magicPower, magicMove);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Kognetavr{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", magicPower=" + magicPower +
                ", magicMove=" + magicMove +
                '}';
    }

    public void compare (Kognetavr kognetavr) {
        int abilitySum1 = smart + wise + witty + creativity;
        int abilitySum2 = kognetavr.getCreativity() + kognetavr.getSmart() + kognetavr.getWise() + kognetavr.getWitty();
        if (abilitySum1 > abilitySum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else {
            System.out.println("Ученик 2 лучше чем ученик 1");
        }
    }
}
