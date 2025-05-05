import java.util.Random;

public abstract class Zombie {
    protected int arms;
    protected int legs;
    protected int baseHP;
    protected int speed;

    protected Random rng = new Random();

    public int getArms() {
        return arms;
    }

    public void setArms() {
        this.arms = rng.nextInt(0, 3);
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs() {
        this.legs = rng.nextInt(0, 3);
    }

    public int getBaseHP() {
        return baseHP;
    }

    public void setBaseHP() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
    }

    public int roll(int numDice, int numDiceSides){
        int sum = 0;
        for(int i = 0; i < numDice; i++){
            sum += (int)(Math.random() * numDiceSides + 1);
        }
        return sum;
    }

    public abstract int attack(int attackRoll);
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Zombie: ")
                .append("Arms: ").append(this.arms)
                .append(", Legs: ").append(this.legs)
                .append(", Base HP: ").append(this.baseHP)
                .append(", Speed: ").append(this.speed);
        return str.toString();
    }
}
