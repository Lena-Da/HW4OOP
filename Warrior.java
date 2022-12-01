public abstract class Warrior<T extends Weapon, S extends Shield>{
    private String name;
    private Integer healthPoint;
    private T weapon;
    private S shield;
    
    public Warrior(String name, Integer healthPoint, T weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    @Override
    public String toString() {
        return String.format("%s Name: %s %s HP: %d", getWeapon(), getName(), shield, getHealthPoint());
    }
}