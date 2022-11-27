package allOther;

public class Granade extends Weapon implements Start, Describable{

    private Integer amountGranade = 0;
    private Boolean result = false;

    public Granade(String name, Integer amountGranade) {
        super(name);
        this.amountGranade = amountGranade;
    }

    public Boolean getResult(){
        return this.result;
    }
    @Override
    public void start() {
        if (this.amountGranade > 0) {
            this.result = true;
            this.amountGranade = this.amountGranade - 1;
        }else{
            this.result = false;
        }
    }
    @Override
    public String describe() {
        return super.getName() + " " + this.result;
    }
}