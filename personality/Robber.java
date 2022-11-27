package personality;

public class Robber extends Person implements WhatToDO, Describable {
    private String[] actions = {"ничего", "ничего", "никуда"};
    private ConditionSet condi;
    private Boolean camo = false;

    public Robber(String name) {
        super(name);
    }

    public boolean condition(ConditionSet conda){
        this.condi = conda;
        return true;
    }

    public boolean camouflage(Boolean getIt){
        if (getIt){
            this.camo = true;
        }
        return true;
    }

    public boolean getCamouflage(){
        return this.camo;
    }

    public boolean bankLoot(Bank bank, Time time, Rob rob){
        bank.robberyCondition("robber", this.camo, time.getTime(), rob.getStatus());
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
        switch (this.condi){
            case ALIVE:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " живой";
            case DAMAGED:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " раненный";
            case DEAD:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " мертвый";
            default:
                break;
        }
        return whatWeReturn;
    }
}
