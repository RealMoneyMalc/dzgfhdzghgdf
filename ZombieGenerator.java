import java.util.ArrayList;
import java.util.Random;

public class ZombieGenerator {
    public void run(){
        //TODO: ask user for input
        generateNZombies(10);
    }

    public void generateNZombies(int numZombies){
        ArrayList<Zombie> zombieList = new ArrayList<>();

        for(int i = 0; i < numZombies; i++){
            Random rng = new Random();
            int zombieType = rng.nextInt(1, 4);

            if(zombieType == 1){
                Zombie zb = new Runner();
                zombieList.add(zb);
            } else if(zombieType == 2){
                Zombie zb = new Runner(); // Tank
                zombieList.add(zb);
            } else {
                Zombie zb = new Runner(); // Walker
                zombieList.add(zb);
            }
        }
    }
}
