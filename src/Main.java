public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 20, "Invisibility");
        heroes[1] = new Medic(80, 10, "Healing", 50);
        heroes[2] = new Warrior(120, 25, "Critical Damage");

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
 }
