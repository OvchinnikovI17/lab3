package personality;

public class Company extends Building implements  Start, Describable{

    public Integer companyStatus = 0;

    public Company(String name) {
        super(name);
    }

    public boolean open(WhatTime whattime){
        if (whattime != WhatTime.NIGHT){
            companyStatus = 1;
        }
        return true;
    }

    @Override
    public String describe() {
        if (companyStatus == 1){
            return "Компания закрыта";
        }else{
            return "Компания открыта";
        }

    }

}
