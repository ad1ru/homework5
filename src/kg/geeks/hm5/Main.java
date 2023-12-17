package kg.geeks.hm5;

public class Main {
    public static void main(String[] args) {
        Boss firstBoss = new Boss();
        firstBoss.setHp(100);
        firstBoss.setDamage(10.5);
        firstBoss.setTypeOfDefence("Magic");

        System.out.println("Boss HP: " + firstBoss.getHp() +
                " Boss Damage: " + firstBoss.getDamage() +
                " Boss Defence: " + firstBoss.getTypeOfDefence());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes){
            System.out.println("Hero HP: " + hero.getHp() +
                    " Hero Damage: " + hero.getDamage() +
                    " Hero Super Power: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero firstHero = new Hero(150, 25.0);
        Hero secondHero = new Hero(180, 12.5, "Magic");
        Hero thirdHero = new Hero(200, 20.0);

        return new Hero[]{firstHero, secondHero, thirdHero};
    }
}