package allOther;

public class StealArms extends Weapon implements Start, Describable{

    private Boolean broken = false;
    private String result = null;

    public StealArms(String name, boolean broken) {
        super(name);
        this.broken = broken;
    }

    @Override
    public void start() {
        if (Math.random() <= 0.05) {
            this.broken = true;
        }
        if (!this.broken) {
            this.result = "удар нанесен";
        }else{
            this.result = "оружие сломано";
        }
    }
    @Override
    public String describe() {
        return super.getName() + " " + this.result;
    }
}
