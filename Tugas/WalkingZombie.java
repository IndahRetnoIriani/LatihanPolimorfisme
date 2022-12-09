package Tugas;

public class WalkingZombie extends Zombie {

    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 10 / 100);
                break;
            case 2:
                health += (health * 30 / 100);
                break;
            case 3:
                health += (health * 40 / 100);
                break;
            default:
            System.out.println("Health = 0");
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 20 / 100);
    }

    public String getZombieInfo(){
        System.out.println("Walking Zombie Data");
        System.out.println("Health\t= " + super.health);
        System.out.println("Level\t= " + level);
        return "";
    }
    
}
