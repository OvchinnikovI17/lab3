package allOther;

public class Shooting implements Describable {
    Boolean shootingMode = false;

    public Shooting(Boolean isStart){
        this.shootingMode = isStart;
    }

    @Override
    public String describe() {
        if (this.shootingMode) {
            return "стрельба началась";
        }else{
            return "стрельбы нет";
        }
    }
}
