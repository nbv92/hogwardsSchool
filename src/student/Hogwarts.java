package student;

public abstract class Hogwarts {
    protected final int magicPower;
    protected final int magicMove;

    public Hogwarts (int magicPower, int magicMove) {
        this.magicPower = magicPower;
        this.magicMove = magicMove;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getMagicMove() {
        return magicMove;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magicPower=" + magicPower +
                ", magicMove=" + magicMove +
                '}';
    }
    public void basicCompare(Hogwarts hogwarts) {
        int basicAbilitySum1 = magicMove + magicPower;
        int basicAbilitySum2 = magicMove + magicPower;
        if (basicAbilitySum2 < basicAbilitySum1) {
            System.out.println("Ученик 1 лучше по базовым");
        }else {
            System.out.println("Ученик 2 лучше по базовым");
        }
    }
}
