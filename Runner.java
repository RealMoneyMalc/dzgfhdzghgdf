import java.util.Random;

public class Runner extends Zombie{
    private int baseHP;
    private int speed;
    private int climbSpeed;

    @Override
    public int getBaseHP() {
        return baseHP;
    }

    @Override
    public void setBaseHP() {
        this.baseHP = rng.nextInt(10, 23);;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed() {
        this.speed = rng.nextInt(15, 26);
        this.climbSpeed = speed/3;
    }

    public int getClimbSpeed() {
        return climbSpeed;
    }

    @Override
    public int attack(int attackRoll){
        if(attackRoll >= 19){
            return (roll(2, 8) * 2);
        } else if(attackRoll >= 5){
            return roll(2, 8);
        } else {
            return 0;
        }
    }

    public Runner(){
        setBaseHP();
        setSpeed();
    }

    public String toString(){
        return super.toString();
    }
}
