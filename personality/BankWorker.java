package personality;

public class BankWorker extends Person implements Describable{

    private ConditionSet conda = ConditionSet.ALIVE;
    private Integer hp = 2;
    private Boolean isSafe = false;
    private String typeBox;

    public BankWorker(String name) {
        super(name);
    }


    public boolean condition(ConditionSet conda){
        this.conda = conda;
        return true;
    }

    public void isBoxThere(Box box){
        this.isSafe = true;
        System.out.println("Кассир спрятался в " + box.describe());
        this.typeBox = box.describe();
    }

    public String getTypeBox(){
        return this.typeBox;
    }

    public boolean isSafe(){
        return this.isSafe;
    }

    public boolean getDamage(){
        if (!this.isSafe){
            this.hp = this.hp - 1;
            if (this.hp == 1){
                this.conda = ConditionSet.DAMAGED;
            }else{
                if (this.hp < 1) {
                    this.conda = ConditionSet.DEAD;
                }
            }
        }
        return true;
    }

    @Override
    public String describe(){
        String whatWeReturn = null;
        switch (this.conda){
            case ALIVE:
                whatWeReturn = super.getName() + " банква жив";
                break;
            case DAMAGED:
                whatWeReturn = super.getName() + " травмирован";
                break;
            case DEAD:
                whatWeReturn = super.getName() + " мертв";
                break;
            default:
                break;
        }
        return whatWeReturn;
    }
}
