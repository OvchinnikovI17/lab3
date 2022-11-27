package allOther;
import java.util.Objects;

public class Bank extends Building implements  Start, Describable{

    public Integer bankStatus = 0;

    public Bank(String name) {
        super(name);
    }

    public void robberyCondition(String who, boolean areVisitorsVisitors, WhatTime whattime, Boolean rob){
        if (Objects.equals(who, "robber") && !areVisitorsVisitors && whattime != WhatTime.NIGHT && rob){
            bankStatus = 1;
        }
    }

    @Override
    public String describe() {
        if (bankStatus == 0){
            return "Банк в нормальном состоянии";
        }else{
            return "В банке произошло ограбление";
        }

    }

}
