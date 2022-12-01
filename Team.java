import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T> {
    private Hero hero;
    private List<T> teams = new ArrayList<>();

    public Team(Hero hero) {
        this.hero = hero;
    }
    
    public void add(T pers){
        teams.add(pers);
    }

    @Override
    public Iterator<T> iterator() {
        return teams.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(hero.toString() + "\n");
        for (T item : this) {
            sb.append(item.toString() + "\n");
        }
        return sb.toString();
    }

    public Integer getTeamHP(){
        int summa = hero.getHealthPoint();
        for (T member : this) {
            summa += member.getHealthPoint();
        }
        return summa;
    }
}
