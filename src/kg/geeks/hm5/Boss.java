package kg.geeks.hm5;

public class Boss {
    private int hp;
    private double damage;
    private String typeOfDefence;

    public int getHp() {
        return this.hp;
    }

    public double getDamage() {
        return this.damage;
    }

    public String getTypeOfDefence() {
        return this.typeOfDefence;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}
