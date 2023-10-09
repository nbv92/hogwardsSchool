package student;

public class Grifendor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Grifendor(int magicPower,int magicMove,int nobility,int honor,int bravery){
        super(magicPower,magicMove);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Grifendor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", magicPower=" + magicPower +
                ", magicMove=" + magicMove +
                '}';
    }

    public void compare (Grifendor grifendor) {
        int abilitySum1 = nobility + honor + bravery;
        int abilitySum2 = grifendor.getNobility() + grifendor.getHonor() + grifendor.getBravery();
        if (abilitySum1 > abilitySum2 ) {
           System.out.println("Ученик 1 лучше ученика 2");
        } else {
            System.out.println("Ученик 2 лучше чем ученик 1");
        }

    }
}
