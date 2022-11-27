package allOther;

public class Alone extends Person implements WhatToDO, Describable{
    private String[] actions = {"ничего", "ничего", "никуда"};

    public Alone(String name) {
        super(name);
    }

    public boolean tell(String info, Alone prsn){
        System.out.println( super.getName() + " рассказал " + info + " " + prsn.getName());
        prsn.actions[1] = info;
        return true;
    }

    @Override
    public boolean made() {
        this.actions[0] = "что-то";
        return true;
    }

    @Override
    public boolean know() {
        this.actions[1] = "о ограблении";
        return true;
    }

    @Override
    public boolean come() {
        this.actions[2] = " в контору";
        return true;
    }

    @Override
    public String describe() {
        String whatWeReturn = "";
        whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2];
        return whatWeReturn;
    }
}



