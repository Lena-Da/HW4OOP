public class Hero extends Warrior<Weapon, WoodenShield>{

    public Hero(String name, Integer healthPoint, Weapon weapon, WoodenShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Hero. %s", super.toString());
    }
    
}
