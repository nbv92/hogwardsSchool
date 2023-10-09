public abstract class Hogwarts {
    private int magicPower;
    private int magicMove;

    public Hogwarts (int magic, int magicMove) {
        this.magicPower = magicPower;
        this.magicMove = magicMove;
    }

    public int getMagic() {
        return magicPower;
    }

    public int getMagicMove() {
        return magicMove;
    }
}
