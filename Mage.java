public class Mage extends Warrior<Staff, MagicShield>{
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon, MagicShield shield, Integer range, Integer mana) {
        super(name, healthPoint, weapon,shield);
        this.mana = mana;
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Mage. %s mana: %d range: %d", super.toString(), mana, range);
    }
}
