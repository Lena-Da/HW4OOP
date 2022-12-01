public class WoodenShield implements Shield{

    @Override
    public Integer save() {
        return 25;
    }


    @Override
    public String toString() {
        return String.format("Shield: %d", save());
    }
    
}
