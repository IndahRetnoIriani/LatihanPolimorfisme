package Tugas;

public class JumpingZombie extends Zombie{

    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (health * 30 / 100);
                break;
            case 2:
                health += (health * 40 / 100);
                break;
            case 3:
                health += (health * 50 / 100);
                break;
            default:
            System.out.println("Health = 0");
                break;
        }
        
    }

    @Override
    public void destroyed() {
        super.health -= (super.health * 10 / 100);
    }
    
    public String getZombieInfo(){
        System.out.println("Jumping Zombie Data");
        System.out.println("Health\t= " + super.health);
        System.out.println("Level\t= " + level);
        return "";
    }
}
