package allOther;

import java.util.Arrays;

public class Car implements Describable {

    String[] qualities = {"бронированная"};
    public Boolean where = false;

    public boolean here() {
        this.where = true;
        return true;
    }

    @Override
    public String describe(){
        if (this.where) {
            return  Arrays.toString(qualities).replace("[", "")
                    .replace("]", "") + " машина";
        }
        return null;
    }
}
