package personality;

import java.util.ArrayList;
import java.util.List;

public class Bandit extends Person implements Describable{
    private String[] actions = {"ничего", "ничего", "никуда"};
    private List<String> haveWeapon = new ArrayList<String>();
    private ConditionSet cond;
    private Integer amount;
    private String where = "никуда";
    public Bandit(String name, Integer howMany) {
        super(name);
        this.amount = howMany;
    }

    public boolean addWeapon(FireGun gun){
        this.haveWeapon.add(gun.getName());
        return true;
    }

    public boolean addWeapon(Granade gun){
        this.haveWeapon.add(gun.getName());
        return true;
    }

    public void condition(ConditionSet conda, String where){
        this.cond = conda;
        this.where = where;
    }

    public boolean getCondition(){
        System.out.println(super.getName() + " " + this.cond + ", ранен в " + this.where);
        return true;
    }

    public String useWeaponFireGun(FireGun gun, Police poilceman){
        if (this.haveWeapon.contains(gun.getName())){
            gun.start();
            boolean wrk = gun.getResult();
            if (wrk){
                poilceman.getDamage();
                return "Бандит выстрелил из " + gun.getName() + ", " + poilceman.getName() + " получил урон в 1 hp";
            }else{
                return "Бандит не смог выстрелить из " + gun.getName();
            }
        }else{
            return "У Бандита нет " +  gun.getName();
        }

    }

    public String useWeaponFireGun(FireGun gun, BankWorker bankWorker) {
        if (this.haveWeapon.contains(gun.getName())) {
            gun.start();
            boolean wrk = gun.getResult();
            if (wrk && !bankWorker.isSafe()) {
                bankWorker.getDamage();
                return "Бандит выстрелил из " + gun.getName() + ", " + bankWorker.getName() + " получил урон в 1 hp";
            } else {
                if (bankWorker.isSafe()) {
                    return "Бандит выстрелил, из " + gun.getName() + " но " + bankWorker.getName() + " защитился от них в " + bankWorker.getTypeBox();
                } else {
                    return "Бандит не смог выстрелить из " + gun.getName();
                }
            }

        }else{
            return "У Бандита нет " +  gun.getName();
        }
    }

    public String useWeaponGranade(Granade granade, Police poilceman) {
        if (this.haveWeapon.contains(granade)) {
            granade.start();
            boolean wtk = granade.getResult();
            if (wtk) {
                poilceman.getDamage();
                return "Бандит взорвал " + granade.getName() + " полицеский получил урон в 1 hp";
            } else {
                return "Бандит не смог кинуть " + granade.getName();

            }
        }else{
            return "У Бандита нет " +  granade.getName();
        }
    }

    public boolean know() {
        this.actions[1] = "о ограблении";
        return true;
    }

    public boolean come(Car car) {
        if (car.where) {
            this.actions[2] = car.describe();
        }
        return true;
    }
    @Override
    public String describe() {
        String whatWeReturn = null;
        switch (this.cond){
            case ALIVE:
                whatWeReturn = super.getName()  + " знает " + this.actions[1] + " приехал " + this.actions[2] + " живой " + getAmount() + " человек";
                break;
            case DAMAGED:
                whatWeReturn = super.getName() + " знает " + this.actions[1] + " приехал " + this.actions[2] + " раненный " + getAmount() + " человек";
                break;
            case DEAD:
                whatWeReturn = super.getName() + " знает " + this.actions[1] + " приехал " + this.actions[2] + " мертвый " + getAmount() + " человек";
            default:
                break;
        }
        return whatWeReturn;
    }

    public String getAmount() {
        return (String.valueOf(amount));
    }



    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
