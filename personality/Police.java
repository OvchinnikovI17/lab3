package personality;

public class Police extends Person implements WhatToDO, Describable {
    private String[] actions = {"ничего", "о ограблении", "на перестрелку"};
    private ConditionSet condi = ConditionSet.ALIVE;

    private Integer hp = 2;

    public Police(String name) {
        super(name);
    }

    public boolean condition(ConditionSet conda){
        this.condi = conda;
        return true;
    }

    public boolean getDamage(){
        this.hp = this.hp - 1;
        return true;
    }

    @Override
    public boolean made() {
        this.actions[0] = "что-то";
        return true;
    }

    @Override
    public boolean know() {
        this.actions[1] = "об этом";
        return true;
    }

    @Override
    public boolean come() {
        this.actions[2] = "";
        return true;
    }

    @Override
    public String describe() {
        String whatWeReturn = null;

        if (this.hp == 1){
            this.condi = ConditionSet.DAMAGED;
        }

        if (this.hp == 0){
            this.condi = ConditionSet.DEAD;
        }

        switch (this.condi){
            case ALIVE:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " живой";
                break;
            case DAMAGED:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " раненный";
                break;
            case DEAD:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " мертвый";
                break;
            default:
                break;
        }
        return whatWeReturn;
    }
}
