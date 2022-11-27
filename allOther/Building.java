package allOther;
public class Building implements Start, Describable{

    private String name = null;

    public Building(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String describe() {
        return null;
    }

    @Override
    public void start() {

    }
}
