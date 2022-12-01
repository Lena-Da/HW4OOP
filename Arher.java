public class Arher extends Warrior<Bow, WoodenShield>{
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Arher(String name, Integer healthPoint, Bow weapon, WoodenShield shield,Integer range) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
    }
    
    @Override
    public String toString() {
        return String.format("Archer. %s range: %d", super.toString(), range);
    }
}
