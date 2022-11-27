package allOther;

public class Corporation extends Person implements Describable{

    private Boolean appear = false;

    public Corporation(String name) {
        super(name);
    }

    public boolean appear(){
        this.appear = true;
        return true;
    }

    @Override
    public String describe() {
        if (this.appear){
            return  "Появилось " + super.getName();
        }
        return null;
    }
}
