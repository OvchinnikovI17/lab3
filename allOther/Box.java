package allOther;

public class Box implements Describable{

    String kind = null;
    String qualities = null;

    public Box(String kind, String quality){
        this.kind = kind;
        this.qualities = quality;
    }

    @Override
    public String describe() {
        return this.kind + " " + this.qualities;
    }
}