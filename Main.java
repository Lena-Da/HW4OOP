public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ivan", 150, new Staff(), new WoodenShield());
        Team<Arher> dreamTeam = new Team<>(hero1);
        dreamTeam.add(new Arher("Petr", 100, new LongBow(), new WoodenShield(), 20));
        dreamTeam.add(new Arher("Eva", 100, new Bow(), new WoodenShield(), 15));
        System.out.print(dreamTeam);
        System.out.println("Team HP "+dreamTeam.getTeamHP()+"\n");

        Hero hero2 = new Hero("Vova", 150, new Staff(),new WoodenShield());
        Team<Warrior> redTeam = new Team<>(hero2);
        redTeam.add(new Mage("Louis", 100, new Staff(), new MagicShield(), 30, 80));
        redTeam.add(new Arher("Fred", 100, new Bow(), new WoodenShield(), 15));
        System.out.print(redTeam);
        System.out.println("Team HP "+redTeam.getTeamHP()+"\n");

        Hero hero3 = new Hero("Winx", 100, new Staff(),new WoodenShield());
        Team<Warrior> fairyTeam = new Team<>(hero3);
        fairyTeam.add(new Mage("Lu", 110, new Staff(), new MagicShield(), 30, 50));
        fairyTeam.add(new Mage("Lu", 100, new Staff(), new MagicShield(), 30, 40));
        System.out.print(fairyTeam);
        System.out.println("Team HP "+fairyTeam.getTeamHP()+"\n");
        
    }
    
}
