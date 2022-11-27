package allOther;

public class Buyer extends Person implements WhatToDO, Describable{
    private String[] actions = {"ничего", "ничего", "никуда"};

    public Buyer(String name) {
        super(name);
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
        String whatWeReturn = "";
        whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2];
        return whatWeReturn;
    }
}