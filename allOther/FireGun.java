package allOther;

public class FireGun extends Weapon implements Start, Describable{

    private Integer amountPatrons = 0;
    private Boolean result = false;

    public FireGun(String name, Integer amountPatrons) {
        super(name);
        this.amountPatrons = amountPatrons;
    }

    public Boolean getResult(){
        return this.result;
    }

    @Override
    public void start() {
        if (this.amountPatrons > 0) {
            this.result = true;
            this.amountPatrons = this.amountPatrons - 1;
        }else{
            this.result = false;
        }
    }
    @Override
    public String describe() {
        return super.getName() + " " + this.result;
    }
}