public class MagicShield implements Shield {
    
    @Override
    public Integer save() {
        return 45;
    }


    @Override
    public String toString() {
        return String.format("Shield: %d", save());
    }
    
}
