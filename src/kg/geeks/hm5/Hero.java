package kg.geeks.hm5;

public class Hero {
    private int hp;
    private double damage;
    private String superPower;

    public Hero(int hp, double damage, String superPower){
        this.hp = hp;
        this.damage = damage;
        this.superPower = superPower;
    }
    public Hero(int hp, double damage){
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return this.hp;
    }

    public double getDamage() {
        return this.damage;
    }

    public String getSuperPower() {
        if (superPower == null) {
            superPower = "No Super Power";
        }
        return this.superPower;
    }
}
